package Lab23_3;

public abstract class AbstractEvaluate implements Expression {
    protected Expression left;
    protected Expression right;

    AbstractEvaluate(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}