package checker.model;

import exceptions.ScopeOutOfBoundsException;

import java.util.*;

/**
 * Created by Jordy van der Zwan on 24-Jun-17.
 *
 * This class is used for bookkeeping of the declaration of all variables in the program.
 */
public class DeclarationTable {

    private Scope root;
    private Scope scope;

    public DeclarationTable() {
        root  = new Scope();
        scope = root;
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

    public void addVariable(Variable variable) {
        scope.addVariable(variable);
    }

    public void getVariable(String name) {
        scope.getVariable(name);
    }

    public void isDeclared(String name) {
        scope.isDeclared(name);
    }

    public void isDeclaredInScope(String name) {
        scope.isDeclaredInScope(name);
    }

    public void resetScope() {
        scope = root;
        root.resetScopeCounters();
    }

    @Override
    public String toString() {
        return "" + root;
    }

    private class Scope {

        private List<Scope> children = new ArrayList<>();
        private Scope parent;
        private Set<Variable> variables = new HashSet<>();
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
            String res = "";
            res += variables + "\n";
            for (Scope child : children) {
                res += "    " + child;
            }
            return res;
        }
    }
}
