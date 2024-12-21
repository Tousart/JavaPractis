package Lab23_2;

public class Task2 {
    public static void main(String[] args) {
        ArrayQueue<Integer> queue = new ArrayQueue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println("ArrayQueue size: " + queue.size()); // 3
        System.out.println("First element: " + queue.element()); // 1
        System.out.println("Dequeue: " + queue.dequeue()); // 1
        System.out.println("New size: " + queue.size()); // 2
        queue.clear();
        System.out.println("Size after clear: " + queue.size()); // 0
        System.out.println();

        LinkedQueue<String> linkedQueue = new LinkedQueue<>();
        linkedQueue.enqueue("Hello");
        linkedQueue.enqueue("World");
        System.out.println("LinkedQueue size: " + linkedQueue.size()); // 2
        System.out.println("First element: " + linkedQueue.element()); // Hello
        System.out.println("Dequeue: " + linkedQueue.dequeue()); // Hello
        System.out.println("New size: " + linkedQueue.size()); // 1
        linkedQueue.clear();
        System.out.println("Size after clear: " + linkedQueue.size()); // 0
        System.out.println();
    }
}
