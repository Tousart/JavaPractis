package Lab7_4;

public interface MathCalculable {
    double degree(double number, double degree);
    double complex(double a, double b);
    static double pi() {
        return Math.PI;
    }
    double circleArea(double r);
    double circlePerimeter(double r);
}
