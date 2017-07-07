package checker.model;

import exceptions.ScopeOutOfBoundsException;

import java.util.*;
import controller.Compiler;

/**
 * Created by Jordy van der Zwan on 24-Jun-17.
 *
 * This class is used for bookkeeping of the declaration of all variables in the program.
 */
public class DeclarationTable {

    /**
     * This scope is the base scope which is the highest.
     */
    private Scope root;

    /**
     * This scope is the current scope of the program during usage of this class.
     */
    private Scope scope;

    /**
     * This scope contains all the global variables and other values it needs.
     */
    private Scope globalScope;

    /**
     * The nextOffset variable points to the next offset available in the memory of the application
     * We do not use any offset twice, not even in different memory pools (threads or global)
     */
    private Integer nextOffset = 1;

    /**
     * The scope pointer points to the scope that will be used next if a scope is opened.
     * It points to the index in the list of scopes.
     */
    private int scopePointer = 1;

    /**
     * This list will contain all the scopes you would find if you read the code from top to bottom.
     * This means that scopes can occur multiple time if you need to pass though one to return to the root for example.
     */
    private List<Scope> scopes = new ArrayList<>();

    /**
     * This queue is used to pop and push scopes during the setting up of the scopes in the program.
     */
    private LinkedList<Scope> queue = new LinkedList<>();

    /**
     *  Next id of a thread if a new fork is required.
     */
    private int nextForkId = 1;

    public DeclarationTable() {
        root  = new Scope();
        globalScope = new Scope();
        scope = root;
        scopes.add(root);
        queue.add(root);
    }

    /**
     * This method creates a new scope for a thread.
     */
    public void createThread() {
        Scope newScope = new Scope();
        scope = newScope;
        queue.add(newScope);
        scopes.add(newScope);
    }

    /**
     * This method opens a new thread which has already been created.
     */
    public void openThread() {
        scope = scopes.get(scopePointer++);
    }

    /**
     * This method exits a newly made thread, only used during first run.
     */
    public void exitThread() {
        scope = queue.pop();
        scopes.add(scope);
    }

    /**
     * This method closes a scope by entering the new one in the scopes list.
     */
    public void closeThread() {
        scope = scopes.get(scopePointer++);
    }

    /**
     * This method creates a new scope. This would happen during an block statement for example.
     */
    public void createScope() {
        scope = scope.createScope();
    }

    /**
     * This method opens a new scope.
     * @throws ScopeOutOfBoundsException Thrown when no scope is found.
     */
    public void openScope() throws ScopeOutOfBoundsException {
        scope = scope.openScope();
    }

    /**
     * This method closes a scope.
     * @throws ScopeOutOfBoundsException Thrown when no scope is found.
     */
    public void closeScope() throws ScopeOutOfBoundsException {
        scope = scope.closeScope();
    }

    /**
     * Thie method adds a variable to the global scope.
     * @param variable the variable that needs to be added.
     */
    public void addGlobalVariable(Variable variable) {
        globalScope.addVariable(variable);
    }

    /**
     * This method adds a variable to the current scope.
     * @param variable variable to be addded to the scope.
     */
    public void addVariable(Variable variable) {
        scope.addVariable(variable);
    }

    /**
     * Checks whether the variable is declared in the scope and returns it.
     * @param name name of the variable.
     * @return the variable associated with the name in the current scope.
     */
    public Variable getVariable(String name) {
        return scope.getVariable(name) != null ? scope.getVariable(name) : globalScope.getVariable(name);
    }

    /**
     * Checks whether the variable is declared in the scope.
     * @param name name of the variable.
     * @return true if it exists otherwise false.
     */
    public boolean isDeclared(String name) {
        return scope.isDeclared(name) || globalScope.isDeclared(name);
    }

    /**
     * Checks whether the variable is declared in the global scope.
     * @param name name of the variable.
     * @return true if it exists otherwise false.
     */
    public boolean isDeclaredInGlobal(String name) {
        return globalScope.isDeclared(name);
    }

    /**
     * Checks whether the variable is declared in the current scope only.
     * @param name name of the variable.
     * @return true if it exists otherwise false.
     */
    public boolean isDeclaredInScope(String name) {
        return scope.isDeclaredInScope(name);
    }

    /**
     * This method resets the scope counters.
     * Neccesary to do before walking though the tree again because of scoping.
     */
    public void resetScope() {
        scope = root;
        root.resetScopeCounters();
        scopePointer = 1;
    }

    /**
     * This method returns an offset and increments the offsetpointer.
     * @param type type of variable to be added (Used for memory calulation)
     * @return valid offset for a variable.
     */
    public Integer getNextOffset(Type type) {
        Integer res = nextOffset;
        nextOffset += Compiler.INTEGER_SIZE_MULTIPLIER;
        return res;
    }

    @Override
    public String toString() {
        return "DeclarationTable{" +
                "\nglobalScope=" + globalScope +
                "\n, scopes=" + scopes +
                "\n}";
    }

    /**
     * This method returns the next offset address.
     * @return next offset address.
     */
    public int getNextOffset() {
        return nextOffset;
    }

    /**
     * This method generates a new forkID for an identifier.
     * @param text identifier of the forkID.
     * @return the forkID that has been generated. Or -1 if it already exists
     */
    public int addForkId(String text) {
        if (scope.getForkId(text) != null) return -1;
        scope.addForkId(text);
        return scope.getForkId(text).getNumber();
    }

    /**
     * This method will return the forkid needed to use threads.
     * @param text identifier related to a certain forkID (ThreadID)
     * @return the forkID associated to the identifier given.
     */
    public Id getForkId(String text) {
        return scope.getForkId(text);
    }

    /**
     * This class has similar methods as this one.
     * It is made to allow for recursive behaviour of scopes.
     */
    private class Scope {

        /**
         * List of child scopes
         */
        private List<Scope> children = new ArrayList<>();

        /**
         * Parent of this scope
         */
        private Scope parent;

        /**
         * All variables declared in this scope
         */
        private List<Variable> variables = new ArrayList<>();

        /**
         * Next scope it needs to go of the children.
         */
        private int nextScope = 0;

        /**
         * All forkId's declared in this scope
         */
        private Set<Id> forkIds = new HashSet<>();

        private Scope(Scope parent) {
            this.parent = parent;
        }
        private Scope() {
            parent = null;
        }
        private Scope openScope() throws ScopeOutOfBoundsException {
            if (children.get(nextScope) == null) throw new ScopeOutOfBoundsException();
            return children.get(nextScope++);
        }
        private Scope createScope() {
            Scope newScope = new Scope(this);
            children.add(newScope);
            return newScope;
        }
        private Scope closeScope() throws ScopeOutOfBoundsException {
            if (parent == null) {
                throw new ScopeOutOfBoundsException();
            }
            return parent;
        }
        private void addVariable(Variable variable) {
            variables.add(variable);
        }
        private Variable getVariable(String name) {
            for (Variable var : variables) {
                if (var.getId().equals(name)) {
                    return var;
                }
            }
            if (parent != null) {
                return parent.getVariable(name);
            } else {
                return null;
            }
        }
        private boolean isDeclared(String name) {
            return getVariable(name) != null;
        }
        private boolean isDeclaredInScope(String name) {
            for (Variable var : variables) {
                if (var.getId().equals(name)) {
                    return true;
                }
            }
            return false;
        }
        private void resetScopeCounters() {
            nextScope = 0;
            for (Scope scope: children) {
                scope.resetScopeCounters();
            }
        }
        @Override
        public String toString() {
            return "Scope{" +
                    "\nchildren=" + children +
                    "\n, variables=" + variables +
                    "\n, nextScope=" + nextScope +
                    "\n, forkIds=" + forkIds +
                    "\n}";
        }

        void addForkId(String text) {
            forkIds.add(new Id(text, genNextForkId()));
        }
        private int genNextForkId() {
            return nextForkId++;
        }
        Id getForkId(String text) {
            for (Id var : forkIds) {
                if (var.getName().equals(text)) {
                    return var;
                }
            }
            if (parent != null) {
                return parent.getForkId(text);
            } else {
                return null;
            }
        }
    }
}
