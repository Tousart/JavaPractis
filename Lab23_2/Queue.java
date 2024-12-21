package Lab23_2;

public interface Queue<T> {
    void enqueue(T element); // Добавить элемент в очередь
    T element(); // Вернуть первый элемент в очереди
    T dequeue(); // Удалить и вернуть первый элемент в очереди
    int size(); // Текущий размер очереди
    boolean isEmpty(); // Является ли очередь пустой
    void clear(); // Удалить все элементы из очереди
}

