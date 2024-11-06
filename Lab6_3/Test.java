package Lab6_3;

public class Test {
    public static void main(String[] args) {
        Nameable religion1 = new Orthodoxy();
        religion1.getName();

        Nameable religion2 = new Islam();
        religion2.getName();

        Nameable religion3 = new Catholicism();
        religion3.getName();

        Nameable religion4 = new Buddhism();
        religion4.getName();
    }
}
