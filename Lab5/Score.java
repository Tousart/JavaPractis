package Lab5;

public class Score {
    private int milan = 0;
    private int real = 0;
    private int k = 0;

    public void setMilan() {
        milan++;
    }

    public void setReal() {
        real++;
    }

    public int getMilan() {
        return milan;
    }

    public int getReal() {
        return real;
    }

    public void reverse() {
        k = milan;
        milan = real;
        real = k;
//        milan, real = real, milan;
    }
}