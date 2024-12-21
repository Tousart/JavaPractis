package Lab23_2;

public class ArrayQueue<T> extends AbstractQueue<T> {
    private Object[] elements;
    private int head;
    private int tail;

    public ArrayQueue() {
        elements = new Object[10]; // Начальный размер массива
        head = 0;
        tail = 0;
    }

    @Override
    public void enqueue(T element) {
        if (size == elements.length) {
            resize();
        }
        elements[tail] = element;
        tail = (tail + 1) % elements.length;
        size++;
    }

    @Override
    public T element() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return (T) elements[head];
    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        T result = (T) elements[head];
        elements[head] = null; // Удаляем ссылку для сборщика мусора
        head = (head + 1) % elements.length;
        size--;
        return result;
    }

    private void resize() {
        int newCapacity = elements.length * 2;
        Object[] newElements = new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newElements[i] = elements[(head + i) % elements.length];
        }
        elements = newElements;
        head = 0;
        tail = size;
    }
}
