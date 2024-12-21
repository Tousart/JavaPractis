package Lab23_1;

public class Task1 {
    public static void main(String[] args) {
        // Тестирование ArrayQueueModule
        ArrayQueueModule.enqueue(1);
        ArrayQueueModule.enqueue(2);
        System.out.println(ArrayQueueModule.size()); // 2
        System.out.println(ArrayQueueModule.element()); // 1
        System.out.println(ArrayQueueModule.dequeue()); // 1
        System.out.println(ArrayQueueModule.isEmpty()); // false
        ArrayQueueModule.clear();
        System.out.println(ArrayQueueModule.isEmpty()); // true
        System.out.println();

        // Тестирование ArrayQueueADT (явная передача ссылки на экземпляр класса)
        ArrayQueueADT queueADT = new ArrayQueueADT(5);
        queueADT.enqueue(queueADT, "A");
        queueADT.enqueue(queueADT, "B");
        System.out.println(queueADT.element(queueADT)); // A
        System.out.println(queueADT.dequeue(queueADT)); // A
        System.out.println(queueADT.size(queueADT)); // 1
        System.out.println(queueADT.isEmpty(queueADT)); // false
        queueADT.clear(queueADT);
        System.out.println(queueADT.isEmpty(queueADT)); // true
        System.out.println();

        // Тестирование ArrayQueue (неявная передача ссылки на экземпляр класса)
        ArrayQueue queue = new ArrayQueue(5);
        queue.enqueue("X");
        queue.enqueue("Y");
        System.out.println(queue.element()); // X
        System.out.println(queue.dequeue()); // X
        System.out.println(queue.size()); // 1
        System.out.println(queue.isEmpty()); // false
        queue.clear();
        System.out.println(queue.isEmpty()); // true
        System.out.println();
    }
}
