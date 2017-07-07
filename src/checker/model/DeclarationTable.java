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

    private Scope root;
    private Scope scope;
    private Scope globalScope;
    private Integer nextOffset = 1;

    private int scopePointer = 1;
    private List<Scope> scopes = new ArrayList<>();
    private LinkedList<Scope> queue = new LinkedList<>();

    private int nextForkId = 1;

    public DeclarationTable() {
        root  = new Scope();
        globalScope = new Scope();
        scope = root;
        scopes.add(root);
        queue.add(root);
    }

    public void createThread() {
        Scope newScope = new Scope();
        scope = newScope;
        queue.add(newScope);
        scopes.add(newScope);
    }

    public void openThread() {
        scope = scopes.get(scopePointer++);
    }

    public void exitThread() {
        scope = queue.pop();
        scopes.add(scope);
    }

    public void closeThread() {
        scope = scopes.get(scopePointer++);
    }

    public void createScope() {
        scope = scope.createScope();
    }

    public void openScope() throws ScopeOutOfBoundsException {
        scope = scope.openScope();
    }

    public void closeScope() throws ScopeOutOfBoundsException {
        scope = scope.closeScope();
    }

    public void addGlobalVariable(Variable variable) {
        globalScope.addVariable(variable);
    }

    public void addVariable(Variable variable) {
        scope.addVariable(variable);
    }

    public Variable getVariable(String name) {
        return scope.getVariable(name) != null ? scope.getVariable(name) : globalScope.getVariable(name);
    }

    public boolean isDeclared(String name) {
        return scope.isDeclared(name) || globalScope.isDeclared(name);
    }

    public boolean isDeclaredInGlobal(String name) {
        return globalScope.isDeclared(name);
    }

    public boolean isDeclaredInScope(String name) {
        return scope.isDeclaredInScope(name);
    }

    public void resetScope() {
        scope = root;
        root.resetScopeCounters();
        scopePointer = 1;
    }

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

    public int getNextOffset() {
        return nextOffset;
    }

    public int addForkId(String text) {
        if (scope.getForkId(text) != null) return -1;
        scope.addForkId(text);
        return scope.getForkId(text).getNumber();
    }

    public Id getForkId(String text) {
        return scope.getForkId(text);
    }

    private class Scope {

        private List<Scope> children = new ArrayList<>();
        private Scope parent;
        private List<Variable> variables = new ArrayList<>();
        private int nextScope = 0;

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

        private Set<Id> forkIds = new HashSet<>();


        public void addForkId(String text) {
            forkIds.add(new Id(text, genNextForkId()));
        }

        private int genNextForkId() {
            return nextForkId++;
        }

        public Id getForkId(String text) {
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
