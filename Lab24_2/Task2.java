package Lab24_2;

public class Task2 {
    public static void main(String[] args) {
        Client vc = new Client(new ChairFactory().createVictorianChair(19));
        Client mc = new Client(new ChairFactory().createMagicChair());
        Client fc = new Client(new ChairFactory().createFunctionalChair());
        vc.sit();
        mc.sit();
        fc.sit();

        VictorianChair victorian = new ChairFactory().createVictorianChair(19);
        System.out.println(victorian.getAge());
        MagicChair magic = new ChairFactory().createMagicChair();
        magic.doMagic();
        FunctionalChair functional = new ChairFactory().createFunctionalChair();
        System.out.println(functional.sum(21, 4));
    }
}