package Lab8_1;

import java.util.Scanner;

public class Main1 {
    public static void func (int k) {
        int i = 1;
        int n = 0;
        for (int j=0; j < k; j++) {
            if (n < i){
                System.out.println(i);
                n ++;
            }
            if (n == i){
                i++;
                n = 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        if (number.hasNextInt()) {
            int n = number.nextInt();
            if (n > 0) func(n);
        }
    }
}