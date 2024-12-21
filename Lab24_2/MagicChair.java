package Lab24_2;

public class MagicChair implements Chair {
    public void doMagic() {
        System.out.println("Магическое превращение...");
    }

    @Override
    public void sit() {
        System.out.println("Вы сидите на магическом стуле");
    }
}
