package Lab11_5;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        for (int i = 0; i < 3; i++) {
            arrayList.add("Array");
            linkedList.add("Linked");
        }

        long startTime, endTime;

        // Вставка в ArrayList
        startTime = System.nanoTime();
        arrayList.add(0, "Array");
        endTime = System.nanoTime();
        System.out.println("ArrayList вставка: " + (endTime - startTime) + " нс");

        // Вставка в LinkedList
        startTime = System.nanoTime();
        linkedList.add(0, "Linked");
        endTime = System.nanoTime();
        System.out.println("LinkedList вставка: " + (endTime - startTime) + " нс");

        // Удаление из ArrayList
        startTime = System.nanoTime();
        arrayList.remove(0);
        endTime = System.nanoTime();
        System.out.println("ArrayList удаление: " + (endTime - startTime) + " нс");

        // Удаление из LinkedList
        startTime = System.nanoTime();
        linkedList.remove(0);
        endTime = System.nanoTime();
        System.out.println("LinkedList удаление: " + (endTime - startTime) + " нс");

        // Поиск по образцу в ArrayList
        startTime = System.nanoTime();
        arrayList.contains("Array");
        endTime = System.nanoTime();
        System.out.println("ArrayList поиск: " + (endTime - startTime) + " нс");

        // Поиск по образцу в LinkedList
        startTime = System.nanoTime();
        linkedList.contains("Linked");
        endTime = System.nanoTime();
        System.out.println("LinkedList поиск: " + (endTime - startTime) + " нс");
    }
}
