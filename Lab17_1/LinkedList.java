package Lab17_1;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    private Node head;

    // Создание списка
    public LinkedList() {
        this.head = null;
    }

    // Добавление в список
    public void add(int data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = newNode;
        } else {
            Node current = this.head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Удаление элемента из списка
    public boolean remove(int data) {
        if (this.head == null) {
            return false;
        }

        // Если нужно удалить голову
        if (this.head.data == data) {
            this.head = this.head.next;
            return true;
        }

        // Поиск узла для удаления
        Node current = this.head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return true;
            }
            current = current.next;
        }

        return false;
    }

    // Вывод элементов списка на экран
    public void display() {
        Node current = this.head;
        if (current == null) {
            System.out.println("В списке нет элементов");
            return;
        }
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.print("\n");
    }

    // Очистка списка
    public void clear() {

        // Удаляем все элементы, очищая ссылку на голову
        this.head = null;
    }

    // Проверка списка на пустоту
    public boolean isEmpty() {
        return this.head == null;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("Содержимое списка:");
        list.display();

        System.out.println("Удаляем элемент 2:");
        list.remove(2);
        list.display();

        System.out.println("Очистка списка:");
        list.clear();
        list.display();

        if (list.isEmpty()) {
            System.out.println("Список пуст");
        } else {
            System.out.println("Список НЕ пуст");
        }
    }
}
