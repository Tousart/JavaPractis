package Lab23_3;

public class Variable implements Expression {
    private String x;

    public Variable(String x) {
        this.x = x;
    }

    @Override
    public double evaluate(double x) {
        return x;
    }
}
