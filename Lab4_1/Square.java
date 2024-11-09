package Lab4_1;

public class Square extends Shape{
    public double side;

    public Square(String shapetype, double side) {
        super(shapetype);
        this.side = side;
    }

    public double getArea() {
        return Math.pow(this.side, 2);
    }

    public double getPerimeter() {
        return 4 * this.side;
    }
    @Override
    public String toString() {
        return "{Type: " + this.shapetype +
                "; Side: " + this.side + "}";
    }
}