package Lab23_1;

public class ArrayQueueADT {
    private Object[] elements;
    private int size;
    private int head;
    private int tail;

    // Конструктор
    public ArrayQueueADT(int capacity) {
        elements = new Object[capacity];
        size = 0;
        head = 0;
        tail = 0;
    }

    // Предусловие: queue != null
    // Постусловие: элемент добавлен в очередь
    public void enqueue(ArrayQueueADT queue, Object element) {
        if (size == elements.length) {
            throw new IllegalStateException("Queue is full");
        }
        queue.elements[queue.tail] = element;
        queue.tail = (queue.tail + 1) % elements.length;
        queue.size++;
    }

    // Предусловие: queue != null
    // Постусловие: возвращается первый элемент очереди
    public Object element(ArrayQueueADT queue) {
        if (isEmpty(queue)) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue.elements[queue.head];
    }

    // Предусловие: queue != null
    // Постусловие: возвращается и удаляется первый элемент очереди
    public Object dequeue(ArrayQueueADT queue) {
        if (isEmpty(queue)) {
            throw new IllegalStateException("Queue is empty");
        }
        Object element = queue.elements[queue.head];
        queue.head = (queue.head + 1) % elements.length;
        queue.size--;
        return element;
    }

    // Предусловие: queue != null
    // Постусловие: возвращает текущий размер очереди
    public int size(ArrayQueueADT queue) {
        return queue.size;
    }

    // Предусловие: queue != null
    // Постусловие: возвращает true, если очередь пуста
    public boolean isEmpty(ArrayQueueADT queue) {
        return queue.size == 0;
    }

    // Предусловие: queue != null
    // Постусловие: очередь очищена
    public void clear(ArrayQueueADT queue) {
        queue.head = 0;
        queue.tail = 0;
        queue.size = 0;
    }
}
