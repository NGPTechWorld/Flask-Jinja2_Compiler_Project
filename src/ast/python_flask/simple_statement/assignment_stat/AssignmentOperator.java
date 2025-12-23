package ast.python_flask.simple_statement.assignment_stat;

public enum AssignmentOperator {
    ASSIGN("="),        // =
    ADD_ASSIGN("+="),    // +=
    SUB_ASSIGN("-="),    // -=
    MUL_ASSIGN("*="),    // *=
    DIV_ASSIGN("-="),    // /=
    MOD_ASSIGN("%="),    // %=
    POW_ASSIGN("**=");   // **=

    private final String op;

    AssignmentOperator(String op) {
        this.op = op;
    }
    public String getOp() {
        return op;
    }
    
}
