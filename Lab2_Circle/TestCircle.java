package Lab2_Circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle k = new Circle(4, 1, 2, "фиолетовый");
        System.out.println(k.toString());
        System.out.format("\nПлощадь: %.4f", k.area());
        System.out.format("\nПериметр: %.4f", k.perimeter());
        System.out.println("\n\n" + k.compare(5, 14));
        System.out.println(k.compare(45, 3));
        System.out.println(k.compare(6, 6));
    }
}