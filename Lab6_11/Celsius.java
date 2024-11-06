package Lab6_11;

public class Celsius implements Convertable {
    public double convert(double temperature, String t_out) {
        if (t_out.equals("K")) return temperature - 273;
        else return (temperature - 32) / 1.8;
    }
}
