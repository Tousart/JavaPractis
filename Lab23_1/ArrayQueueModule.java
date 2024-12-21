package Lab23_1;

public class ArrayQueueModule {
    private static final int DEFAULT_CAPACITY = 10;
    private static Object[] elements;
    private static int head;
    private static int tail;
    private static int size;

    static {
        elements = new Object[DEFAULT_CAPACITY];
        head = 0;
        tail = 0;
        size = 0;
    }

    // Инвариант: 0 <= size <= elements.length
    // Предусловие: size < elements.length
    // Постусловие: size' = size + 1
    public static void enqueue(Object element) {
        if (size == elements.length) {
            resize();
        }
        elements[tail] = element;
        tail = (tail + 1) % elements.length;
        size++;
    }

    // Инвариант: 0 <= size <= elements.length
    // Предусловие: size > 0
    // Постусловие: size' = size - 1
    public static Object dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        Object element = elements[head];
        elements[head] = null; // Удаляем ссылку
        head = (head + 1) % elements.length;
        size--;
        return element;
    }

    // Инвариант: 0 <= size <= elements.length
    // Предусловие: size > 0
    // Постусловие: возвращает первый элемент
    public static Object element() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return elements[head];
    }

    // Инвариант: 0 <= size <= elements.length
    // Предусловие: нет
    // Постусловие: возвращает размер очереди
    public static int size() {
        return size;
    }

    // Инвариант: 0 <= size <= elements.length
    // Предусловие: нет
    // Постусловие: возвращает true, если очередь пуста
    public static boolean isEmpty() {
        return size == 0;
    }

    // Инвариант: 0 <= size <= elements.length
    // Предусловие: нет
    // Постусловие: размер очереди становится 0
    public static void clear() {
        elements = new Object[DEFAULT_CAPACITY];
        head = 0;
        tail = 0;
        size = 0;
    }

    private static void resize() {
        Object[] newArray = new Object[elements.length * 2];
        for (int i = 0; i < size; i++) {
            newArray[i] = elements[(head + i) % elements.length];
        }
        elements = newArray;
        head = 0;
        tail = size;
    }
}
