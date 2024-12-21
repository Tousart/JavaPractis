package Lab23_4;

public class Multiply extends AbstractEvaluate {
    public Multiply(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public double evaluate(double x) {
        return left.evaluate(x) * right.evaluate(x);
    }
}
