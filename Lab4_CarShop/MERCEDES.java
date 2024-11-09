package Lab4_CarShop;

import java.text.NumberFormat;
import java.util.Locale;

public enum MERCEDES {
    CLS_63_AMG ("CLS 63 AMG", "2017",
            "5461", NumberFormat.getCurrencyInstance(Locale.US).format(80000)),
    GLE_53_AMG ("GLE 53 AMG", "2023",
            "2999", NumberFormat.getCurrencyInstance(Locale.US).format(160000));

    private final String model;
    private final String year;
    private final String volume;
    private final String price;

    private MERCEDES(String model, String year, String volume, String price) {
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
