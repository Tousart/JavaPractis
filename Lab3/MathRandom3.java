package Lab3;

import java.util.ArrayList;
import java.util.Random;

public class MathRandom3 {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> arr = new ArrayList<>();
        int flag = 1;
        System.out.print("Элементы массива: ");
        for (int i = 0; i < 4; i++) {
            arr.add(rand.nextInt(10, 100));
            if (i != 0) {
                if (arr.get(i) <= arr.get(i - 1)) flag = 0;
            }
            if (i == 3) System.out.format("%d.", arr.get(i));
            else System.out.format("%d, ", arr.get(i));
        }
        if (flag == 1) System.out.print("\nМассив является строго возрастающей последовательностью");
    }
}
