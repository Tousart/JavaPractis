package Lab7_4;

public class Matika {
    public static void main(String[] args) {
        MathCalculable m = new MathFunc();
        System.out.println("два в четвертой степени: " + m.degree(2, 4));
        System.out.println("Модуль комплексного числа 2 + 4i: " + m.complex(2, 4));
        System.out.println("Площадь окружности с радиусом 7: " + m.circleArea(7));
        System.out.println("Длина окружности с радиусом 7: " + m.circlePerimeter(7));
    }
}
