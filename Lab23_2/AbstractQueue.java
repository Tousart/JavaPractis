package Lab23_2;

public abstract class AbstractQueue<T> implements Queue<T> {
    protected int size;

    protected AbstractQueue() {
        this.size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        size = 0;
    }
}

