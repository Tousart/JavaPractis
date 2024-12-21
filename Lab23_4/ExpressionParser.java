package Lab23_4;

import java.util.Stack;

public class ExpressionParser {
    public static Expression result(String expression) {
        expression = expression.replaceAll(" ", "");
        int len = expression.length();
//        System.out.println(expression);

        for (int i = (len - 1); i > 0; i--) {

            // Получение результата выражения в скобках
            if (expression.charAt(i) == ')') {
                Stack<Character> brackets = new Stack<>();

                brackets.push(expression.charAt(i));

                int ind2 = i; // Индекс закрывающейся скобки
                while (!brackets.isEmpty()) {
                    i--;
                    if (expression.charAt(i) == '(') {
                        brackets.pop();
                    } else if (expression.charAt(i) == ')') {
                        brackets.push(expression.charAt(i));
                    }
                }
                int ind1 = i; // Индекс открывающейся скобки

                // Результат выражения в скобках
                String resultInBrackets = String.valueOf(result(expression.substring(ind1 + 1, ind2)).evaluate(1));

                String left = expression.substring(0, ind1);
                String right = expression.substring(ind2 + 1, len);

                return result(left + resultInBrackets + right);
            }

            if (expression.charAt(i) == '+') {
                return new Add(result(expression.substring(0, i)), result(expression.substring(i + 1, len)));
            } else if (expression.charAt(i) == '-') {
                return new Subtract(result(expression.substring(0, i)), result(expression.substring(i + 1, len)));
            }
        }

        for (int i = (len - 1); i > 0; i--) {
            if (expression.charAt(i) == '*') {
                return new Multiply(result(expression.substring(0, i)), result(expression.substring(i + 1, len)));
            } else if (expression.charAt(i) == '/') {
                return new Divide(result(expression.substring(0, i)), result(expression.substring(i + 1, len)));
            }
        }

        if (expression.equals("x")) {
            return new Const(new Variable(expression).evaluate(Task4.xyz[0]));
        } else if (expression.equals("y")) {
            return new Const(new Variable(expression).evaluate(Task4.xyz[1]));
        } else if (expression.equals("z")) {
            return new Const(new Variable(expression).evaluate(Task4.xyz[2]));
        } else if (expression.matches("(-*)([0-9]+)") || expression.matches("(-*)([0-9]+)(\\.)([0-9]+)")) {
            return new Const(Double.parseDouble(expression));
        }

        return new Const(0);
    }
}
