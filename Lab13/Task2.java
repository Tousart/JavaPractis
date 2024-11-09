package Lab13;

public class Task2 {
    public static void main(String[] args) {
        Person k1 = new Person("Владислав", "Бурунов", "Олегович");
        System.out.println(k1.formatName());

        Person k2 = new Person("", "", "");
        System.out.println(k2.formatName());
    }
}