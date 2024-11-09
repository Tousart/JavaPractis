package Lab1;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        inp.useLocale(Locale.US);
        System.out.print("Введите размер массива: ");
        int size = inp.nextInt();
        double[] arr = new double[size];
        int i = 0;
        int s = 0;
        System.out.print("Введите элементы массива:\n");
        do {
            double num = inp.nextDouble();
            if (num % 1 == 0) {
                arr[i] = num;
                i += 1;
            }
            else {
                System.out.print("Введите целое число!\n");
            }
        } while (i < size);
        System.out.print("Элементы массива: ");
        for (int j = 0; j < size; j++){
            int b = (int) arr[j];
            s += b;
            System.out.print(b + " ");
        }
        System.out.print("\nСумма элементов массива: " + s);
        int min = (int) Arrays.stream(arr).min().getAsDouble();
        System.out.print("\nМинимальный элемент массива: " + min);
        int max = (int) Arrays.stream(arr).max().getAsDouble();
        System.out.print("\nМаксимальный элемент массива: " + max);
    }

}
