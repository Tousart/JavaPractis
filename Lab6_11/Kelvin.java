package Lab6_11;

public class Kelvin implements Convertable {
    public double convert(double temperature, String t_out) {
        if (t_out.equals("C")) return temperature + 273;
        else return ((temperature - 32) / 1.8) + 273;
    }
}