package Lab23_2;

public class LinkedQueue<T> extends AbstractQueue<T> {
    private static class Node<T> {
        T value;
        Node<T> next;

        Node(T value) {
            this.value = value;
        }
    }

    private Node<T> head;
    private Node<T> tail;

    public LinkedQueue() {
        head = null;
        tail = null;
    }

    @Override
    public void enqueue(T element) {
        Node<T> newNode = new Node<>(element);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        size++;
    }

    @Override
    public T element() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return head.value;
    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        T result = head.value;
        head = head.next;
        if (head == null) {
            tail = null; // Очередь стала пустой
        }
        size--;
        return result;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }
}
