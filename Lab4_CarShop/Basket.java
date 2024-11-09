package Lab4_CarShop;

import java.util.ArrayList;

public class Basket {
    private ArrayList<String> basket;

    public Basket() {
        this.basket = new ArrayList<>();
    }

    public void addCar(String product) {
        this.basket.add(product);
    }

    public void removeCar(int number) {
        if (0 < number && number <= this.basket.size()) {
            this.basket.remove(number - 1);
        }
    }

    public void buyAll() {
        this.basket.removeAll(this.basket);
    }
    @Override
    public String toString() {
        String s = "";
        if (this.basket.size() == 0) {
            s = "Корзина пуста(";
        }
        else {
            s = "Корзина:\n";
            for (int i = 0; i < this.basket.size(); i++) {
                s += (i + 1) + ". " + this.basket.get(i) + "\n";
            }
        }
        return s;
    }
}