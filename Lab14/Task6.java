package Lab14;

import java.util.regex.Pattern;

public class Task6 {
    public static Boolean checkAddress(String address) {
        String regex1 = "(\\w+)@(\\w+\\.)(\\w+)*";
        String regex2 = "(\\w+)@(\\w+)*";

        if (!Pattern.matches(regex1, address) && !Pattern.matches(regex2, address)) {
            System.out.println("Данный адрес некорректен");
            return false;
        }

        System.out.println("Адрес корректен :)");
        return true;
    }

    public static void main(String[] args) {
        checkAddress("user@example.com");
        checkAddress("root@localhost");

        checkAddress("myhost@@@com.ru");
        checkAddress("@my.ru");
        checkAddress("Julia String");
    }
}
