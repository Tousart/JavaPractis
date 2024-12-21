package Lab18;

import java.util.Scanner;

public class Test2 {
    public static void printMessage() throws NullPointerException {
        System.out.print("Введите число: ");
        Scanner input = new Scanner(System.in);
        String key = input.nextLine();

//        if (key.isEmpty()) {
//            throw new NullPointerException("ХОТЬ ЧТО-ТО ВВЕДИ АХХАХАХ");
//        }
//        String message = "Введено " + key;

        try {
            getDetails(key);
        } catch (Exception e) {
            throw e;
        }
        String message = getDetails(key);

        System.out.println(message);
    }

    public static String getDetails(String key) {
        if (key.isEmpty()) {
            throw new NullPointerException("ХОТЬ ЧТО-ТО ВВЕДИ АХХАХАХ");
        }

        return "Введено: " + key;
    }

    public static void main(String[] args) {
        printMessage();
    }
}