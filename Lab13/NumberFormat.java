package Lab13;

public class NumberFormat {
    private String code;
    private String num;
    private String firstNum;
    private String secondNum;
    private String thirdNum;

    private String getCode(String number) {
        if (number.contains("+")) {
            return number.substring(1, number.length() - 10);
        }
        return "7";
    }

    private String getNum(String number) {
        return number.substring(number.length() - 10);
    }

    public NumberFormat (String number) {
        this.code = getCode(number);
        this.num = getNum(number);
        this.firstNum = this.num.substring(0, 3);
        this.secondNum = this.num.substring(3, 6);
        this.thirdNum = this.num.substring(6);
    }

    @Override
    public String toString() {
        return "+" + this.code + "(" + this.firstNum + ")" +
                "-" + this.secondNum + "-" + this.thirdNum;
    }
}
