package Lab13;

import java.util.StringTokenizer;

public class Shirt {
    private String article;
    private String model;
    private String color;
    private String size;

    public Shirt (String shirt) {
        StringTokenizer tokenizer = new StringTokenizer(shirt, ",.;");
        this.article = tokenizer.nextToken().trim();
        this.model = tokenizer.nextToken().trim();
        this.color = tokenizer.nextToken().trim();
        this.size = tokenizer.nextToken().trim();
    }

    @Override
    public String toString() {
        return "Артикул: " + this.article + "\n" +
                "Модель: " + this.model + "\n" +
                "Цвет: " + this.color + "\n" +
                "Размер: " + this.size + "\n";
    }
}
