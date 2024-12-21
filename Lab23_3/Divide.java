package Lab23_3;

public class Divide extends AbstractEvaluate {
    public Divide(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public double evaluate(double x) {
        return left.evaluate(x) / right.evaluate(x);
    }
}
