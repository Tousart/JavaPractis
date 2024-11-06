package Lab6_10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Shop k = new Shop();
        Scanner str = new Scanner(System.in);
        String comp = "";
        while (!comp.equals("q")) {
            System.out.println("\nДоступные марки компьютеров:");
            for (Marks i: Marks.values()) {
                System.out.print(i + " ");
            }
            System.out.print("\nДобавьте компьютер(введите add / для выхода введите q): ");
            comp = str.nextLine();
            if (comp.equals("add")) {
                System.out.print("\nВведите марку: ");
                comp = str.nextLine();
                while (comp.replaceAll(" ", "").replaceAll("\t", "").equals("")) {
                    System.out.print("Введите марку: ");
                    comp = str.nextLine();
                }
                System.out.print("Введите модель: ");
                String model = str.nextLine();
                while (model.replaceAll(" ", "").replaceAll("\t", "").equals("")) {
                    System.out.print("Введите модель: ");
                    model = str.nextLine();
                }
                System.out.print("Введите процессор: ");
                String processor = str.nextLine();
                while (processor.replaceAll(" ", "").replaceAll("\t", "").equals("")) {
                    System.out.print("Введите процессор: ");
                    processor = str.nextLine();
                }
                System.out.print("Введите монитор: ");
                String monitor = str.nextLine();
                while (monitor.replaceAll(" ", "").replaceAll("\t", "").equals("")) {
                    System.out.print("Введите монитор: ");
                    monitor = str.nextLine();
                }
                System.out.print("Введите память: ");
                String memory = str.nextLine();
                while (memory.replaceAll(" ", "").replaceAll("\t", "").equals("")) {
                    System.out.print("Введите память: ");
                    memory = str.nextLine();
                }
                k.addProduct(comp, model, processor, monitor, memory);
            }
        }
        k.addProduct("HUAWEI","dkfd", "sf", "sf", "23");
        System.out.println(k.toString());
        k.replaceModel("HUAWEI", "dkfd", "matebook");
        k.replaceProcessor("HUAWEI", "matebook", "corei7");
        k.replaceMonitor("HUAWEI", "matebook", "16 дюймов");
        k.replaceMemory("HUAWEI", "matebook", "1024gb");
        System.out.println(k.toString());
        k.removeProduct("HUAWEI", "matebook");
        System.out.println(k.toString());
    }
}
