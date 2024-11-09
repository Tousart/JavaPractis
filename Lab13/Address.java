package Lab13;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Address {
    private String address;
    private ArrayList<String> parts;

    public Address(String address) {
        this.address = address;
        this.parts = new ArrayList<>();
        normalAddress(this.address);
    }

    private void normalAddress(String address) {
        StringTokenizer tokenizer = new StringTokenizer(address, ".,;");
        while (tokenizer.hasMoreTokens()) {
            this.parts.add(tokenizer.nextToken().trim());
        }
    }

    @Override
    public String toString() {
        return "Страна: " + this.parts.get(0) + "\n" +
                "Регион: " + this.parts.get(1) + "\n" +
                "Город: " + this.parts.get(2) + "\n" +
                "Улица: " + this.parts.get(3) + "\n" +
                "Дом: " + this.parts.get(4) + "\n" +
                "Корпус: " + this.parts.get(5) + "\n" +
                "Квартира: " + this.parts.get(6) + "\n";

    }
}
