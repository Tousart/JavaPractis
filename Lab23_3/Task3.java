package Lab23_3;

import java.util.Locale;
import java.util.Scanner;

public class Task3 {
    public static String normalizeAnswer(double answer) {
        String normalAnswer = String.valueOf(answer);

        if(normalAnswer.charAt(normalAnswer.length() - 1) == '0') {
            normalAnswer = normalAnswer.substring(0, normalAnswer.length() - 2);
        }

        return normalAnswer;
    }

    public static Boolean checkNumber(String number) {
        return number.matches("(-*)([1-9]+)([0-9]*)") ||
                number.matches("(-*)(0\\.)([0-9]+)") ||
                number.matches("(-*)([1-9]+)([0-9]*)(\\.)([0-9]+)");
    }

    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));

        Scanner inp = new Scanner(System.in);
        String number;

        System.out.print("Введите значение x для выражения: x^2 - 2x + 1: ");
        number = inp.nextLine();

//        do {
//            System.out.print("Введите значение x для выражения: x^2 - 2x + 1: ");
//            number = inp.nextLine();
//        } while (!checkNumber(number));

        if (!checkNumber(number)) {
            throw new RuntimeException("Неправильный формат числа!");
        }


        // Результат выражения
        double answer = new Add(new Subtract(new Multiply(new Variable("x"), new Variable("x")), new Multiply(new Const(2), new Variable("x"))), new Const(1)).evaluate(Double.parseDouble(number));
        System.out.println("\nРезультат выражения: " + normalizeAnswer(answer));
    }
}
