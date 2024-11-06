package Lab7_5;

public class StringChange implements ProcessStrings{
    public StringChange () {}

    public int charCount(String str) {
        return str.replaceAll(" ", "").length();
    }

    public String oddChar(String str) {
        String s = "";
        str = str.replaceAll(" ", "");
        for (int i = 0; i < charCount(str); i++) {
            if (i % 2 != 0) s += str.charAt(i);
        }
        return s;
    }

    public String inverseString(String str) {
        String s = "";
        for (int i = str.length() - 1; i > -1; i--) {
            s += str.charAt(i);
        }
        return s;
    }
}
