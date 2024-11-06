package Lab4_CarShop;

import java.text.NumberFormat;
import java.util.Locale;

public enum AUDI {
    AUDI_A6 ("AUDI A6", "2018",
            "2967", NumberFormat.getCurrencyInstance(Locale.US).format(50000)),
    AUDI_R8 ("AUDI R8", "2019",
            "5204", NumberFormat.getCurrencyInstance(Locale.US).format(170000));

    private final String model;
    private final String year;
    private final String volume;
    private final String price;

    private AUDI(String model, String year, String volume, String price) {
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
