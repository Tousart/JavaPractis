package Lab11_4;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static Boolean checkDate1(String date) {
        if (date.matches("[0-9]*") && date.charAt(0) != '0') return true;
        return false;
    }

    public static Boolean checkDate2(String date) {
        if (date.matches("[0-9]*")) return true;
        return false;
    }

    public static Boolean checkInput1(String input) {
        String[] parts = input.split(" ");
        if (parts.length == 3) {
            if ((checkDate1(parts[0])) &&
                    (checkDate1(parts[1]) && (parts[1].length() == 1 || parts[1].length() == 2)) &&
                    (checkDate1(parts[2]) && (parts[2].length() == 1 || parts[2].length() == 2)))
                return true;
        }
        return false;
    }

    public static Boolean checkInput2(String input) {
        String[] parts = input.split(" ");
        if (parts.length == 2) {
            if ((checkDate2(parts[0]) && (parts[0].length() == 1 || parts[0].length() == 2)) &&
                    (checkDate2(parts[1]) && (parts[1].length() == 1 || parts[1].length() == 2)))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        String input1 = "";
        String input2 = "";

        DateFormat df = new SimpleDateFormat("dd.MM.yyyy hh:mm");

        do {
            input1 = str.nextLine();
        } while (!checkInput1(input1));
        int[] arr1 = Arrays.stream(input1.split(" ")).mapToInt(Integer::parseInt).toArray();

        do {
            input2 = str.nextLine();
        } while (!checkInput2(input2));
        int[] arr2 = Arrays.stream(input2.split(" ")).mapToInt(Integer::parseInt).toArray();

        Date date = new Date(arr1[0] - 1900, arr1[1] - 1, arr1[2], arr2[0], arr2[1]);
        System.out.println("Объект класса Date: " + df.format(date.getTime()));

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, arr1[0]);
        cal.set(Calendar.MONTH, arr1[1] - 1);
        cal.set(Calendar.DAY_OF_MONTH, arr1[2]);
        cal.set(Calendar.HOUR, arr2[0]);
        cal.set(Calendar.MINUTE, arr2[1]);
        System.out.println("Объект класса Calendar: " + df.format(date.getTime()));
    }
}