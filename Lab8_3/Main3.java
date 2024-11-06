package Lab8_3;

import java.util.Scanner;

public class Main3 {
    public static void func(int a, int b) {
        if (a == b) System.out.println(a);
        else if (a > b) {
            System.out.println(a);
            func(a - 1, b);
        }
        else {
            System.out.println(a);
            func(a + 1, b);
        }
    }
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        if (number.hasNextInt()) {
            int a = number.nextInt();
            if (number.hasNextInt()) {
                int b = number.nextInt();
                func(a, b);
            }
        }

    }
}
