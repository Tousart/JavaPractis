package Lab11_2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static Boolean checkDate(String date) {
        if (date.matches("[0-9]*") && date.charAt(0) != '0') return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        String date;
        DateFormat df = new SimpleDateFormat("dd.MM.yyyy");

        System.out.println("Настоящее дата:");
        Calendar cal = Calendar.getInstance();
        System.out.println(df.format(cal.getTime()));

        System.out.println("Введите свою дату");

        do {
            System.out.print("Введите день: ");
            date = num.nextLine();
        } while (!checkDate(date) || (date.length() < 1 || date.length() > 2));
        int day = Integer.parseInt(date);

        do {
            System.out.print("Введите месяц: ");
            date = num.nextLine();
        } while (!checkDate(date) || (date.length() < 1 || date.length() > 2));
        int month = Integer.parseInt(date);

        do {
            System.out.print("Введите год: ");
            date = num.nextLine();
        } while (!checkDate(date));
        int year = Integer.parseInt(date);

        Calendar calPerson = Calendar.getInstance();
        calPerson.set(Calendar.YEAR, year);
        calPerson.set(Calendar.MONTH, month - 1);
        calPerson.set(Calendar.DAY_OF_MONTH, day);
        System.out.println("\nДата пользователя: " + df.format(calPerson.getTime()));

        if (calPerson.get(Calendar.YEAR) > cal.get(Calendar.YEAR))
            System.out.println("Дата пользователя больше");
        else if (calPerson.get(Calendar.YEAR) < cal.get(Calendar.YEAR))
            System.out.println("Системная дата больше");
        else {
            if (calPerson.get(Calendar.MONTH) > cal.get(Calendar.MONTH))
                System.out.println("Дата пользователя больше");
            else if (calPerson.get(Calendar.MONTH) < cal.get(Calendar.MONTH))
                System.out.println("Системная дата больше");
            else {
                if (calPerson.get(Calendar.DAY_OF_MONTH) > cal.get(Calendar.DAY_OF_MONTH))
                    System.out.println("Дата пользователя больше");
                else if (calPerson.get(Calendar.DAY_OF_MONTH) < cal.get(Calendar.DAY_OF_MONTH))
                    System.out.println("Системная дата больше");
                else System.out.println("Даты равны");
            }
        }
    }
}