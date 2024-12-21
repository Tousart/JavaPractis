package Lab17_2;

class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class DoublyLinkedList {
    private Node head;
    private Node tail;

    // Создание пустого списка
    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // Добавление элемента в список
    public void add(int data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {

            // Ссылка на новый узел, который становится следующим элементом текущего хвоста
            this.tail.next = newNode;

            // Ссылка на предыдущий узел для нового узла становится элементом старого хвоста
            newNode.prev = this.tail;

            // Ссылка на хвост приобретает значение нового узла
            this.tail = newNode;
        }
    }

    // Удаление элемента из списка
    public void remove(int data) {
        Node current = this.head;

        while (current != null) {
            if (current.data == data) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    this.head = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                } else {
                    this.tail = current.prev;
                }
                break;
            }
            current = current.next;
        }
    }

    // Вывод элементов списка на экран
    public void printList() {
        Node current = this.head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Очистка списка
    public void clear() {
        this.head = null;
        this.tail = null;
    }

    // Проверка спика на пустоту
    public boolean isEmpty() {
        return this.head == null;
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        System.out.println("Список пуст: " + list.isEmpty());

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("Элементы списка:");
        list.printList();

        System.out.println("Удаляем элемент 20");
        list.remove(20);
        list.printList();

        System.out.println("Очищаем список");
        list.clear();
        if (list.isEmpty()) {
            System.out.println("Список пуст");
        } else {
            System.out.println("Список НЕ пуст");
        }
    }
}