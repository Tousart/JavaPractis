package Lab23_1;

public class ArrayQueue {
    private Object[] elements;
    private int size;
    private int head;
    private int tail;

    // Конструктор
    public ArrayQueue(int capacity) {
        elements = new Object[capacity];
        size = 0;
        head = 0;
        tail = 0;
    }

    // Добавить элемент в очередь
    public void enqueue(Object element) {
        if (size == elements.length) {
            throw new IllegalStateException("Queue is full");
        }
        elements[tail] = element;
        tail = (tail + 1) % elements.length;
        size++;
    }

    // Вернуть первый элемент в очереди
    public Object element() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return elements[head];
    }

    // Удалить и вернуть первый элемент в очереди
    public Object dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        Object element = elements[head];
        head = (head + 1) % elements.length;
        size--;
        return element;
    }

    // Вернуть текущий размер очереди
    public int size() {
        return size;
    }

    // Проверить, является ли очередь пустой
    public boolean isEmpty() {
        return size == 0;
    }

    // Очистить очередь
    public void clear() {
        head = 0;
        tail = 0;
        size = 0;
    }
}
