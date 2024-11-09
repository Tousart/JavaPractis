package Lab6_10;

import java.util.ArrayList;

public class Shop {
    private ArrayList<Product> shop;
    private boolean flag = false;
    private boolean flag1 = false;

    public Shop () {
        this.shop = new ArrayList<>();
    }

    public int checkMark(String mark, String model) {
        int ind = -1;
        for (Marks i: Marks.values()) {
            if (i.toString().equals(mark)) {
                flag = true;
                break;
            }
        }
        if (flag) {
            for (int i = 0; i < this.shop.size(); i++) {
                if (this.shop.get(i).getModel().equals(model) &&
                        this.shop.get(i).getMark().equals(mark)) {
                    ind = i;
                    flag1 = true;
                    break;
                }
            }
            if (!flag1) System.out.println("Такой модели компьютера нет.");
        }
        else System.out.println("Такой марки компьютера нет.");
        flag = false;
        flag1 = false;
        return ind;
    }

    public void addProduct (String mark, String model, String processor, String monitor, String memory) {
        for (Marks i: Marks.values()) {
            if (i.toString().equals(mark)) {
                flag = true;
                break;
            }
        }
        if (flag) this.shop.add(new Product(mark, model, processor, monitor, memory));
        else System.out.println("Такой марки компьютера нет.");
        flag = false;
    }

    public void removeProduct(String mark, String model) {
        int ind = checkMark(mark, model);
        if (ind != -1) {
            this.shop.remove(ind);
        }
    }

    public void replaceModel (String mark, String model, String another) {
        int ind = checkMark(mark, model);
        if (ind != -1) {
            this.shop.get(ind).replaceModel(another);
        }
    }

    public void replaceProcessor (String mark, String model, String another) {
        int ind = checkMark(mark, model);
        if (ind != -1) {
            this.shop.get(ind).replaceProcessor(another);
        }
    }

    public void replaceMonitor (String mark, String model, String another) {
        int ind = checkMark(mark, model);
        if (ind != -1) {
            this.shop.get(ind).replaceMonitor(another);
        }
    }

    public void replaceMemory (String mark, String model, String another) {
        int ind = checkMark(mark, model);
        if (ind != -1) {
            this.shop.get(ind).replaceMemory(another);
        }
    }
    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < this.shop.size(); i++) {
            s += this.shop.get(i).getProduct();
        }
        return s;
    }
}