package Lab4_CarShop;

import java.text.NumberFormat;
import java.util.Locale;

public enum BMW {
    BMW_X6 ("BMW X6", "2019",
            "4395", NumberFormat.getCurrencyInstance(Locale.US).format(90000)),
    BMW_M5 ("BMW M5", "2024",
            "4395", NumberFormat.getCurrencyInstance(Locale.US).format(320000));

    private final String model;
    private final String year;
    private final String volume;
    private final String price;

    private BMW(String model, String year, String volume, String price) {
        this.model = model;
        this.year = year;
        this.volume = volume;
        this.price = price;
    }

    public String getModel() {
        return this.model;
    }

    public String getYear() {
        return this.year;
    }

    public String getVolume() {
        return this.volume;
    }

    public String getPrice() {
        return this.price;
    }
}