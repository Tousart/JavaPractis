package Lab7_4;

public class MathFunc implements MathCalculable {
    private double p = MathCalculable.pi();

    public MathFunc() {
    }

    public double degree(double number, double degree) {
        return Math.pow(number, degree);
    }

    public double complex(double a, double b) {
        return degree(degree(a, 2) + degree(b, 2),0.5);
    }

    public double circleArea(double r) {
        return p * degree(r, 2);
    }

    public double circlePerimeter(double r) {
        return 2 * p * r;
    }
}
