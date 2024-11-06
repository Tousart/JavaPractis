package Lab4_1;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String shapetype, double length, double width) {
        super(shapetype);
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter() {
        return 2 * (this.length + this.width);
    }
    @Override
    public String toString() {
        return "{Type: " + this.shapetype +
                "; Length: " + this.length +
                "; Width: " + this.width + "}";
    }
}