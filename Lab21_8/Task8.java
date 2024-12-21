package Lab21_8;

class Node {
    String data;
    Node prev;
    Node next;

    public Node(String data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    private Node head;
    private Node tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // Метод для вставки строки в конец списка
    public void insert(String str) {
        Node newNode = new Node(str);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Метод для отображения содержимого списка
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class Task8 {
    public static void main(String[] args) {
        DoublyLinkedList lst = new DoublyLinkedList();
        lst.insert("Вывод");
        lst.insert("всех");
        lst.insert("строк");
        lst.insert("списка");
        lst.display();
    }
}
