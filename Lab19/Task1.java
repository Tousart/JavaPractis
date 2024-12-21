package Lab19;

import java.util.ArrayList;
import java.util.Scanner;

class MyException extends Exception {
    MyException(String errorMessage) {
        super(errorMessage);
    }
}

class UserInn {
    private ArrayList<String> array;
    private String name;
    private String inn;

    UserInn(String name, String inn) throws MyException {
        this.name = name;
        this.inn = inn;
        this.array = new ArrayList<>();
        for (int i = 10000; i < 100000; i++) {
            this.array.add(String.valueOf(i));
        }

        // Проверка ИНН
        checkInn(inn);
    }

    // Метод проверки ИНН
    private void checkInn(String inn) throws MyException {
        if (!this.array.contains(this.inn)) {
            throw new MyException(this.name + ": ИНН недействителен");
        }
    }

    @Override
    public String toString() {
        return "{Имя: " + this.name + "; ИНН: " + this.inn + "}";
    }
}

public class Task1 {
    public static void main(String[] args) throws MyException {
        Scanner input = new Scanner(System.in);
        String inp = "";

        do {
            System.out.print("Введите через пробел имя и ИНН: ");
            inp = input.nextLine();
        } while (!checkInput(inp));

        String[] parts = inp.split(" ");
        System.out.println(new UserInn(parts[0], parts[1]));

//        System.out.println(new UserInn("Иван", "11111"));
//        System.out.println(new UserInn("Петр", "23"));
    }

    public static boolean checkInput(String input) {
        String regex = "([А-ЯЁ])([а-яё]+) (\\d+)";
        return input.matches(regex);
    }
}
