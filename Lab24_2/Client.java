package Lab24_2;

public class Client implements Chair {
    public Chair chair;

    public Client(Chair chair) {
        this.chair = chair;
    }

    @Override
    public void sit() {
        this.chair.sit();
    }
}
