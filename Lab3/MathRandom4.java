package Lab3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MathRandom4 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner inp = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr_even = new ArrayList<>();
        System.out.print("Введите размер массива: ");
        double n = inp.nextDouble();
        while (n % 1 != 0) {
            System.out.println("Размер массива должен быть целым числом!");
            System.out.print("Введите размер массива: ");
            n = inp.nextDouble();
        }
        for (int i = 0; i < n; i++) {
            arr.add(rand.nextInt(0, (int)n + 1));
            if (arr.get(i) % 2 == 0) arr_even.add(arr.get(i));
        }
        System.out.println("Итоговый массив: " + arr);
        System.out.println("Массив из четных чисел: " + arr_even);
    }
}