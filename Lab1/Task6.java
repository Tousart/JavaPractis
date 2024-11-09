package Lab1;

public class Task6 {
    public static void main(String[] args) {
        System.out.format("Первые 10 чисел гармонического ряда (%d/%s):\n", 1, "n");
        for(int i = 1; i < 11; i++) {
            if(i == 1) System.out.format("%d  ", 1);
            else System.out.format("%d/%d  ", 1, i);
        }
        System.out.println("\nЭти же числа, но в десятичном виде (с точностью до двух знаков после запятой):");
        for(double i = 1; i < 11; i++) {
            if(i == 1) System.out.format("%.2f  ", 1.00);
            else System.out.format("%.2f  ", 1 / i);
        }
    }

}
