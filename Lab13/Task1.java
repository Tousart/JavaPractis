package Lab13;

public class Task1 {
    public static String func(String str, int taskNumber) {
        if (!str.isEmpty()) {
            if (taskNumber == 1) {
                return str;
            } else if (taskNumber == 2) {
                return Character.toString(str.charAt(str.length() - 1));
            } else if (taskNumber == 3) {
                if (str.endsWith("!!!")) return "Строка заканчивается на !!!";
                else return "Строка не заканчивается на !!!";
            } else if (taskNumber == 4) {
                if (str.startsWith("I like")) return "Строка начинается на I like";
                else return "Строка не начинается на I like";
            } else if (taskNumber == 5) {
                if (str.contains("Java")) return "Строка содержит Java";
                else return "строка не содержит Java";
            } else if (taskNumber == 6) {
                return Integer.toString(str.indexOf("Java"));
            } else if (taskNumber == 7) {
                return str.replaceAll("a", "o");
            } else if (taskNumber == 8) {
                return str.toUpperCase();
            } else if (taskNumber == 9) {
                return str.toLowerCase();
            } else return str.substring(str.indexOf("Java"), str.indexOf("Java") + 4);
        }
        return "Введена пустая строка";
    }

    public static void main(String[] args) {
        String s = "I like Java!!!";
        System.out.println(func(s, 1));
        System.out.println(func(s, 2));
        System.out.println(func(s, 3));
        System.out.println(func(s, 4));
        System.out.println(func(s, 5));
        System.out.println(func(s, 6));
        System.out.println(func(s, 7));
        System.out.println(func(s, 8));
        System.out.println(func(s, 9));
        System.out.println(func(s, 10));
    }
}
