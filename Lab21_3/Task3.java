package Lab21_3;

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

class CircularDoublyLinkedList {
    private Node head;

    public CircularDoublyLinkedList() {
        head = null;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
        } else {
            Node tail = head.prev;
            tail.next = newNode;
            newNode.prev = tail;
            newNode.next = head;
            head.prev = newNode;
        }
    }

    public void sort() {
        if (head == null) return;

        boolean swapped;
        do {
            swapped = false;
            Node current = head;
            do {
                Node nextNode = current.next;
                if (current.data > nextNode.data) {
                    int temp = current.data;
                    current.data = nextNode.data;
                    nextNode.data = temp;
                    swapped = true;
                }
                current = nextNode;
            } while (current.next != head);
        } while (swapped);
    }

    public void display() {
        if (head == null) return;

        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }
}

public class Task3 {
    public static void main(String[] args) {
        CircularDoublyLinkedList lst = new CircularDoublyLinkedList();
        lst.add(4);
        lst.add(2);
        lst.add(1);
        lst.display();
        lst.sort();
        lst.display();
    }
}
