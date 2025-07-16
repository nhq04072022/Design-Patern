package expression;

public class Expression implements Evaluable {
    private final Evaluable leftOperand;
    private final Evaluable rightOperand;
    private final Operator operator;

    public Expression(Evaluable leftOperand, Evaluable rightOperand, Operator operator) {

        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
        this.operator = operator;
    }

    @Override
    public double evaluate() {

        return operator.doOperation(leftOperand, rightOperand);
    }
}
