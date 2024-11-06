package Lab14;

import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {
    public static Boolean checkFormat(String date) {
        Pattern pattern = Pattern.compile("(\\d+)/(\\d+)/(\\d+)*");
        Matcher matcher = pattern.matcher(date);

        if (!matcher.matches()) {
            return false;
        }

        String[] parts = date.split("/");

        if (parts[0].length() != 2 ||
                parts[1].length() != 2 ||
                parts[2].length() != 4)
            return false;

        if (!checkDate(parts)) return false;

        return true;
    }

    public static Boolean checkDate(String[] parts) {
        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]) - 1;
        int year = Integer.parseInt(parts[2]);

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, day);
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.YEAR, year);

        if (day != calendar.get(Calendar.DAY_OF_MONTH) ||
                month != calendar.get(Calendar.MONTH) ||
                year != calendar.get(Calendar.YEAR))
            return false;

        return true;
    }

    public static String conclusion(String date) {
        if (checkFormat(date)) return "Данная строчка в формате dd/mm/yyyy";
        return "Данная строка НЕ соответствует формату dd/mm/yyyy";
    }

    public static void main(String[] args) {
        System.out.println(conclusion("29/02/2000"));
        System.out.println(conclusion("30/04/2003"));
        System.out.println(conclusion("01/01/2003"));

        System.out.println(conclusion("29/02/2001"));
        System.out.println(conclusion("30-04-2003"));
        System.out.println(conclusion("1/1/1899"));
    }
}
