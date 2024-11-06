package Lab14;

import java.util.regex.Pattern;

public class Task7 {
    public static Boolean checkPassword(String password) {

        if (!Pattern.matches(".*\\d.*", password)) {
            System.out.println("Пароль должен иметь хотя бы одну цифру");
            return false;
        }

        if (!Pattern.matches(".*[a-z].*", password)) {
            System.out.println("Пароль должен иметь хотя бы одну строчную букву");
            return false;
        }

        if (!Pattern.matches(".*[A-Z].*", password)) {
            System.out.println("Пароль должен иметь хотя бы одну заглавную букву");
            return false;
        }

        return true;
    }

    public static void conclusion(String password) {
        if (checkPassword(password)) {
            if (password.length() < 8) {
                System.out.println("Ненадежный пароль!");
            } else {
                System.out.println("Надежный пароль");
            }
        }
    }

    public static void main(String[] args) {
        conclusion("F032_Password");
        conclusion("TrySpy1");

        conclusion("smart_pass");
        conclusion("A007");
    }
}
