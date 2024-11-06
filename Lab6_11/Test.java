package Lab6_11;

public class Test {
    public static void main(String[] args) {
        Convertable k = new Kelvin();
        System.out.println("90 по цельсию в кельвины: " + k.convert(90, "C"));
        System.out.println("90 по фаренгейту в кельвины: " + k.convert(90, "F"));

        Convertable c = new Celsius();
        System.out.println("270 по кельвину в по цельсию: " + c.convert(270, "K"));
        System.out.println("270 по фаренгейту в по цельсию: " + c.convert(270, "F"));

        Convertable f = new Fahrenheit();
        System.out.println("90 по цельсию в по фаренгейту: " + f.convert(90, "С"));
        System.out.println("270 по кельвину в по фаренгейту: " + f.convert(270, "F"));
    }
}
