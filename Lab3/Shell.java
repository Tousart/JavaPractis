package Lab3;

public class Shell {
    public static void main(String[] args) {
        Double a = Double.valueOf(23.4);
        System.out.printf("1 пункт: %.1f%n", a);
        System.out.printf("%n2 пункт: %.2f%n", Double.parseDouble("12.56"));
        System.out.printf("%nПреобразование ко всем примитивным типам (3 пункт):%n" +
                "Тип Byte: %d%n" +
                "Тип Short: %d%n" +
                "Тип Int: %d%n" +
                "Тип Long: %d%n" +
                "Тип Float: %.1f%n" +
                "Тип Double: %.1f%n", a.byteValue(), a.shortValue(),
                a.intValue(), a.longValue(),
                a.floatValue(), a);
        System.out.printf("%n4 пункт: %.1f%n", a);
        String d = Double.toString(34.78);
        System.out.printf("%n5 пункт: %s%n", d);
    }
}