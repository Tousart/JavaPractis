package Lab11_3;

public class Test {
    public static void main(String[] args) {
        Student k = new Student("Гриша", 2, 12, 1, 2010);
        System.out.println(k.toString("полный"));
        System.out.println(k.toString("средний"));
        System.out.println(k.toString("короткий"));
    }
}
