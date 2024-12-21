package Lab24_2;

public class VictorianChair implements Chair {
    private int age;

    public VictorianChair(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public void sit() {
        System.out.println("Вы сидите на Викторианском стуле");
    }
}
