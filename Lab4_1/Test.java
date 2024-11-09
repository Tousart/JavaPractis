package Lab4_1;

public class Test {
    public static void main(String[] args) {
        Circle c = new Circle("Lab2_Circle", 20);
        System.out.println(c.toString());
        System.out.println(c.getType());
        System.out.format("Площадь: %.1f\n", c.getArea());
        System.out.format("Периметр: %.1f\n\n", c.getPerimeter());

        Rectangle r = new Rectangle("Rectangle", 10, 5);
        System.out.println(r.toString());
        System.out.println(r.getType());
        System.out.format("Площадь: %.1f\n", r.getArea());
        System.out.format("Периметр: %.1f\n\n", r.getPerimeter());

        Square k = new Square("Square", 15);
        System.out.println(k.toString());
        System.out.println(k.getType());
        System.out.format("Площадь: %.3f\n", k.getArea());
        System.out.format("Периметр: %.3f\n\n", k.getPerimeter());
    }
}