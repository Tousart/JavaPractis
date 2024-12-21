package Lab23_4;

public class Subtract extends AbstractEvaluate {
    public Subtract(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public double evaluate(double x) {
        return left.evaluate(x) - right.evaluate(x);
    }
}
