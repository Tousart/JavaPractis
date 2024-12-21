package Lab23_4;

public class Task4 {
    static Double[] xyz = {1.0, 2.0, 3.0};

    public static String normalizeAnswer(double answer) {
        String normalAnswer = String.valueOf(answer);

        if(normalAnswer.charAt(normalAnswer.length() - 1) == '0') {
            normalAnswer = normalAnswer.substring(0, normalAnswer.length() - 2);
        }

        return normalAnswer;
    }

    public static void main(String[] args) {
        System.out.println(normalizeAnswer(ExpressionParser.result("z * (x+y)").evaluate(1)));
    }
}
