package Lab17_3;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CircularLinkedList {
    private Node head = null;

    public void createEmptyList() {
        this.head = null;
    }

    // Добавление элемента в список
    public void add(int data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = newNode;
            newNode.next = this.head;
        } else {
            Node temp = this.head;
            while (temp.next != this.head) {
                temp = temp.next;
            }
            temp.next = newNode; // Добавляем новый узел в конец
            newNode.next = this.head; // Указатель нового узла на голову
        }
    }

    // c. Функция удаления элемента из списка
    public void remove(int key) {
        if (this.head == null) return;

        Node current = this.head, previous = null;

        if (current.data == key) {

            // Если единственный элемент
            if (current.next == this.head) {
                this.head = null;
            } else {
//                previous = this.head;
                while (current.next != this.head) {
                    current = current.next;
                }

                // Изменяем главу на следующий элемент
                this.head = this.head.next;

                // Последний элемент указывает на новую голову
                current.next = this.head;
            }
            return;
        }

        // Ищем узел для удаления
        while (current.next != head && current.data != key) {
            previous = current;
            current = current.next;
        }

        // Если нашли узел для удаления
        if (current.data == key) {
            previous.next = current.next;
        }
    }

    // Вывод элементов списка
    public void displayList() {
        if (head == null) {
            System.out.println("Список пуст.");
            return;
        }
        Node current = head;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
        System.out.println();
    }

    // Очистка списка
    public void clearList() {
        head = null;
    }

    // Проверка на пустоту списка
    public boolean isEmpty() {
        return head == null;
    }

    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();

        list.createEmptyList();
        System.out.println("Список пуст: " + list.isEmpty());

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println("Содержимое списка: ");
        list.displayList();

        list.remove(20);
        System.out.println("Содержимое списка после удаления 20: ");
        list.displayList();

        System.out.println("Очищаем список");
        list.clearList();

        if (list.isEmpty()) {
            System.out.println("Список пуст");
        } else {
            System.out.println("Список НЕ пуст");
        }
    }
}
