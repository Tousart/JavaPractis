package Lab4_CarShop;

import java.util.Formatter;

public class Catalog {
    private String mark;

    public Catalog(String mark) {
        this.mark = mark;
    }

    public String checkBMW(String mark) {
        String elem = "";
        for (BMW check : BMW.values()) {
            if (check.getModel().equals(mark)) {
                elem = check.getModel() + ": " + check.getPrice();
                break;
            }
        }
        return elem;
    }

    public String checkMERCEDES(String mark) {
        String elem = "";
        for (MERCEDES check : MERCEDES.values()) {
            if (check.getModel().equals(mark)) {
                elem = check.getModel() + ": " + check.getPrice();
                break;
            }
        }
        return elem;
    }

    public String checkAUDI(String mark) {
        String elem = "";
        for (AUDI check : AUDI.values()) {
            if (check.getModel().equals(mark)) {
                elem = check.getModel() + ": " + check.getPrice();
                break;
            }
        }
        return elem;
    }
    @Override
    public String toString() {
        Formatter fmt = new Formatter();
        String s = "" + fmt.format("%s" + "%" + 35 + "s" + "%" + 39 + "s" + "%" + 14 + "s%n",
                "Модель", "Год выпуска", "Объем двигателя, см3", "Цена");
        if (this.mark == "BMW") {
            for (BMW bmw : BMW.values()) {
                fmt = new Formatter();
                fmt.format("%s" + "%" + (30 - bmw.getModel().length() + bmw.getYear().length()) + "s" +
                                "%" + (30 - bmw.getYear().length() + bmw.getVolume().length()) + "s" +
                                "%" + (30 - bmw.getVolume().length() + bmw.getPrice().length()) + "s%n",
                        bmw.getModel(), bmw.getYear(), bmw.getVolume(), bmw.getPrice());
                s += fmt;
                fmt.close();
            }
        }
        else if (this.mark == "MERCEDES") {
            for (MERCEDES mrs : MERCEDES.values()) {
                fmt = new Formatter();
                fmt.format("%s" + "%" + (30 - mrs.getModel().length() + mrs.getYear().length()) + "s" +
                                "%" + (30 - mrs.getYear().length() + mrs.getVolume().length()) + "s" +
                                "%" + (30 - mrs.getVolume().length() + mrs.getPrice().length()) + "s%n",
                        mrs.getModel(), mrs.getYear(), mrs.getVolume(), mrs.getPrice());
                s += fmt;
                fmt.close();
            }
        }
        else if (this.mark == "AUDI") {
            for (AUDI mrs : AUDI.values()) {
                fmt = new Formatter();
                fmt.format("%s" + "%" + (30 - mrs.getModel().length() + mrs.getYear().length()) + "s" +
                                "%" + (30 - mrs.getYear().length() + mrs.getVolume().length()) + "s" +
                                "%" + (30 - mrs.getVolume().length() + mrs.getPrice().length()) + "s%n",
                        mrs.getModel(), mrs.getYear(), mrs.getVolume(), mrs.getPrice());
                s += fmt;
                fmt.close();
            }
        }
        fmt.close();
        return s;
    }
}
