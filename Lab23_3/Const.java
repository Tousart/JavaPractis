package Lab23_3;

public class Const implements Expression {
    private double value;

    public Const(double value) {
        this.value = value;
    }

    @Override
    public double evaluate(double x) {
        return value;
    }
}
