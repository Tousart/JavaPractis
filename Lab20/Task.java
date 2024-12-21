package Lab20;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

class Work<T extends Comparable, V extends Serializable, K> {
    private T o1;
    private V o2;
    private K o3;

    Work(T o1, V o2, K o3) {
        this.o1 = o1;
        this.o2 = o2;
        this.o3 = o3;
    }
}

class MiniMax<T extends Comparable<T>> {
    private T[] array;

    MiniMax(T[] array) {
        this.array = array;
    }

    public T getMin() {
        return Arrays.stream(this.array).min(Comparator.naturalOrder()).orElse(null);
    }

    public T getMax() {
        return Arrays.stream(this.array).max(Comparator.naturalOrder()).orElse(null);
    }
}

class Calculator {
    public static <T extends Number, V extends Number> double sum(T a, V b) {
        return a.doubleValue() + b.doubleValue();
    }

    public static <T extends Number, V extends Number> double divide(T a, V b) {
        return a.doubleValue() / b.doubleValue();
    }

    public static <T extends Number, V extends Number> double multiply(T a, V b) {
        return a.doubleValue() * b.doubleValue();
    }

    public static <T extends Number, V extends Number> double subtraction(T a, V b) {
        return a.doubleValue() - b.doubleValue();
    }
}

public class Task {
    public static void main(String[] args) {
        String[] array = {"dgs", "aaaa", "ggg"};
        MiniMax<String> k = new MiniMax<>(array);
        System.out.println(k.getMin());
        System.out.println(k.getMax());

        System.out.println(Calculator.sum(12, 9.6));
        System.out.println(Calculator.divide(12, 9.6));
        System.out.println(Calculator.multiply(12, 9.6));
        System.out.println(Calculator.subtraction(12, 9.6));
    }
}