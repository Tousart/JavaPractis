package Lab8_11;

import java.util.Scanner;

public class Main {
    public static int func(int count_zero, int count_one) {
        if (count_zero == 2) return count_one;
        Scanner number = new Scanner(System.in);
        if (number.hasNextInt()) {
            int b = number.nextInt();
            if (b == 0) return func(++count_zero, count_one);
            else if (b == 1) return func(0, ++count_one);
        }
        return func(0, count_one);
    }
    public static void main(String[] args) {
        System.out.println(func(0, 0));
    }
}