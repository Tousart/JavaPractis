package Lab2_Circle;

public class Circle {
    private double radius;
    private double x;
    private double y;
    private String color;

    public Circle(double radius, double x, double y, String color) {
        this.radius = radius;
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public double get_radius() {
        return this.radius;
    }

    public void set_radius(double radius) {
        this.radius = radius;
    }

    public double get_x() {
        return this.x;
    }

    public void set_x(double x) {
        this.x = x;
    }

    public double get_y() {
        return this.y;
    }

    public void set_y(double y) {
        this.y = y;
    }

    public String get_color() {
        return this.color;
    }

    public void set_x(String color) {
        this.color = color;
    }

    public double area() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double perimeter() {
        return 2 * Math.PI * this.radius;
    }

    public String compare(double r1, double r2) {
        if (r1 > r2) {
            return "Окружность с радиусом " + r1 +
                    " больше окружности с радиусом " + r2 +
                    " в " + (r1 / r2) + " раз(а)";
        }
        else if (r1 < r2) {
            return "Окружность с радиусом " + r2 +
                    " больше окружности с радиусом " + r1 +
                    " в " + (r2 / r1) + " раз(а)";
        }
        else {
            return "Окружности равны";
        }
    }
    @Override
    public String toString() {
        return "Circle.Circle{" + "Координаты: (" + this.x + ", " + this.y + ")" +
                "; Радиус: " + this.radius + "; Цвет: " + this.color + "}";
    }
}