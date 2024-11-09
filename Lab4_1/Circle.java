package Lab4_1;

public class Circle extends Shape {
    private double radius;

    public Circle(String shapetype, double radius) {
        super(shapetype);
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * (Math.pow(this.radius, 2));
    }

    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }
    @Override
    public String toString() {
        return "{Type: " + this.shapetype +
                "; Radius: " + this.radius + "}";
    }
}