package Lab6_11;

public class Fahrenheit implements Convertable {
    public double convert(double temperature, String t_out) {
        if (t_out.equals("C")) return (temperature * 1.8) + 32;
        else return ((temperature - 273) * 1.8) + 32;
    }
}