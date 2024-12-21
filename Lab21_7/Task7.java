package Lab21_7;

import java.util.*;

class Node {
    ArrayList<Integer> values;
    int count; // текущее количество заполненных значений
    Node next;
    Node prev;

    public Node() {
        this.values = new ArrayList<>(5); // список на 5 элементов
        this.count = 0;
        this.next = this;
        this.prev = this;
    }

    // Метод для добавления значения в узел
    public boolean addValue(int value) {
        if (count < 5) {
            values.add(value); // добавить значение
            Collections.sort(values);
            count++;
            return true;
        }
        return false; // список заполнен
    }

    // Метод для получения половины значений
    public ArrayList<Integer> getHalfValues() {
        int halfSize = count / 2;
        ArrayList<Integer> halfValues = new ArrayList<>(values.subList(halfSize, count));

        // Обновление значений в head
        count -= halfSize; // уменьшаем количество значений
        values = new ArrayList<>(values.subList(0, count)); // обновляем значения в узле
        return halfValues;
    }
}

class CircularDoublyLinkedList {
    private Node head;

    public CircularDoublyLinkedList() {
        head = null;
    }

    // Метод для добавления значения в список
    public void addValue(int value) {
        if (head == null) {
            head = new Node();
        }

        Node current = head;

        do {
            if (current.addValue(value)) {
                return; // добавили значение и выходим
            }
            current = current.next;
        } while (current != head);

        // Если все узлы заполнены, создаем новый узел
        Node newNode = new Node();
        ArrayList<Integer> halfValues = current.getHalfValues();

        // Переключаем ссылки
        newNode.prev = current.prev;
        newNode.next = current;
        current.prev.next = newNode;
        current.prev = newNode;

        // Заполняем новый узел половиной значений
        for (int val : halfValues) {
            newNode.addValue(val);
        }

        // Добавляем новое значение в новый узел
        newNode.addValue(value);
    }

    // Метод для вывода значений списка
    public void display() {
        if (head == null) {
            System.out.println("Список пуст(");
            return;
        }

        Node current = head;
        do {
            System.out.print("[ ");
            for (Integer value : current.values) {
                System.out.print(value + " ");
            }
            System.out.print("] ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }
}


public class Task7 {
    public static void main(String[] args) {
        CircularDoublyLinkedList lst = new CircularDoublyLinkedList();

        lst.addValue(3);
        lst.addValue(1);
        lst.addValue(5);
        lst.addValue(2);
        lst.addValue(6);
        lst.addValue(7);

        for (int i = 0; i < 10; i++) {
            lst.addValue(i);
        }

        lst.display();
    }
}
