package Lab15_Calculator;

import java.awt.*;
import java.awt.event.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Stack;
import javax.swing.*;

public class Calculator extends JFrame {
    JTextField textField = new JTextField();
    Color violet = new Color(216, 191, 216);
    Color pink = new Color(255, 182, 193);
    Color white = new Color(255, 255, 255);

    JButton button7 = new JButton("7");
    JButton button4 = new JButton("4");
    JButton button1 = new JButton("1");
    JButton button0 = new JButton("0");
    JButton buttonOpenBracket = new JButton("(");

    JButton button8 = new JButton("8");
    JButton button5 = new JButton("5");
    JButton button2 = new JButton("2");
    JButton buttonPoint = new JButton(".");
    JButton buttonClosedBracket = new JButton(")");

    JButton button9 = new JButton("9");
    JButton button6 = new JButton("6");
    JButton button3 = new JButton("3");
    JButton buttonNegativeNumber = new JButton("(-1");
    JButton buttonBackSpace = new JButton("<");

    JButton buttonDivision = new JButton("/");
    JButton buttonMultiplication = new JButton("*");
    JButton buttonSubtraction = new JButton("-");
    JButton buttonAddition = new JButton("+");
    JButton buttonEqual = new JButton("=");

    JButton buttonAC = new JButton("AC");

    public Calculator() {

        // Создаем окно
        super("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(410,430);
        setLayout(null);

        // Запрет на изменение размера окна
        setResizable(false);

        // Появление окна в центре экрана
        setLocationRelativeTo(null);

        // Добавляем экран калькулятора
        add(panelText());

        // Добавляем кнопки
        add(panelButtons());

        // Включаем режим "слушателя для кнопок"
        listener();
    }

    // Метод добавления экрана калькулятора
    private JPanel panelText() {
        JPanel panelText = new JPanel();
        panelText.setLayout(null);
        panelText.setBounds(0, 0, 400, 100);
        panelText.setBackground(pink);

        textField.setBounds(20, 20, 360, 60);
        textField.setFont(new Font("Arial", Font.PLAIN, 38));

        // Делаем текстовое окно невозможным для редактирования (с клавиатуры)
        textField.setEditable(false);

        panelText.add(textField);

        return panelText;
    }

    // Метод добавления кнопок
    private JPanel panelButtons() {
        JPanel panelButtons = new JPanel();
        panelButtons.setLayout(null);
        panelButtons.setBounds(0, 100, 400, 300);
        panelButtons.setBackground(violet);

        // Первый столбец
        button7.setBounds(20, 20, 80, 30);
        setColor(button7);
        panelButtons.add(button7);

        button4.setBounds(20, 70, 80, 30);
        setColor(button4);
        panelButtons.add(button4);

        button1.setBounds(20, 120, 80, 30);
        setColor(button1);
        panelButtons.add(button1);

        button0.setBounds(20, 170, 80, 30);
        setColor(button0);
        panelButtons.add(button0);

        buttonOpenBracket.setBounds(20, 220, 80, 30);
        setColor(buttonOpenBracket);
        panelButtons.add(buttonOpenBracket);

        // Второй столбец
        button8.setBounds(114, 20, 80, 30);
        setColor(button8);
        panelButtons.add(button8);

        button5.setBounds(114, 70, 80, 30);
        setColor(button5);
        panelButtons.add(button5);

        button2.setBounds(114, 120, 80, 30);
        setColor(button2);
        panelButtons.add(button2);

        buttonPoint.setBounds(114, 170, 80, 30);
        setColor(buttonPoint);
        panelButtons.add(buttonPoint);

        buttonClosedBracket.setBounds(114, 220, 80, 30);
        setColor(buttonClosedBracket);
        panelButtons.add(buttonClosedBracket);

        // Третий столбец
        button9.setBounds(206, 20, 80, 30);
        setColor(button9);
        panelButtons.add(button9);

        button6.setBounds(206, 70, 80, 30);
        setColor(button6);
        panelButtons.add(button6);

        button3.setBounds(206, 120, 80, 30);
        setColor(button3);
        panelButtons.add(button3);

        buttonNegativeNumber.setBounds(206, 170, 80, 30);
        setColor(buttonNegativeNumber);
        panelButtons.add(buttonNegativeNumber);

        buttonBackSpace.setBounds(206, 220, 80, 30);
        setColor(buttonBackSpace);
        panelButtons.add(buttonBackSpace);

        // Четвертый столбец
        buttonDivision.setBounds(300, 20, 80, 30);
        setColor(buttonDivision);
        panelButtons.add(buttonDivision);

        buttonMultiplication.setBounds(300, 70, 80, 30);
        setColor(buttonMultiplication);
        panelButtons.add(buttonMultiplication);

        buttonSubtraction.setBounds(300, 120, 80, 30);
        setColor(buttonSubtraction);
        panelButtons.add(buttonSubtraction);

        buttonAddition.setBounds(300, 170, 80, 30);
        setColor(buttonAddition);
        panelButtons.add(buttonAddition);

        buttonEqual.setBounds(300, 220, 80, 30);
        setColor(buttonEqual);
        panelButtons.add(buttonEqual);

        // Кнопка стирания
        buttonAC.setBounds(320, 260, 60, 30);
        setColor(buttonAC);
        panelButtons.add(buttonAC);

        return panelButtons;
    }

    // Метод добавления "слушаетля" к кнопкам
    private void listener() {

//        Запрещаем ввод с клавиатуры
//        keyboardBan();

        // Описание кнопок
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

//                 Убираем все пробелы в выражении (требуется, если ввод происходит с клавиатуры)
//                textField.setText(textField.getText().replaceAll("\\s", ""));

                if (e.getSource() == button7) {
                    if (textLength() && numberInput(textField.getText())) {
                        textField.setText(textField.getText() + "7");
                    }
                } else if (e.getSource() == button4) {
                    if (textLength() && numberInput(textField.getText())) {
                        textField.setText(textField.getText() + "4");
                    }
                } else if (e.getSource() == button1) {
                    if (textLength() && numberInput(textField.getText())) {
                        textField.setText(textField.getText() + "1");
                    }
                } else if (e.getSource() == button0) {
                    if (textLength() && numberInput(textField.getText())) {
                        textField.setText(textField.getText() + "0");
                    }
                } else if (e.getSource() == buttonOpenBracket) {
                    if (textLength() && openBracketInput(textField.getText())) {
                        textField.setText(textField.getText() + "(");
                    }
                } else if (e.getSource() == button8) {
                    if (textLength() && numberInput(textField.getText())) {
                        textField.setText(textField.getText() + "8");
                    }
                } else if (e.getSource() == button5) {
                    if (textLength() && numberInput(textField.getText())) {
                        textField.setText(textField.getText() + "5");
                    }
                } else if (e.getSource() == button2) {
                    if (textLength() && numberInput(textField.getText())) {
                        textField.setText(textField.getText() + "2");
                    }
                } else if (e.getSource() == buttonPoint) {
                    if (textLength() && pointInput(textField.getText())) {
                        textField.setText(textField.getText() + ".");
                    }
                } else if (e.getSource() == buttonClosedBracket) {
                    if (textLength() && closedBracketInput(textField.getText())) {
                        textField.setText(textField.getText() + ")");
                    }
                } else if (e.getSource() == buttonNegativeNumber) {
                    if (textLength() && negativeNumberInput(textField.getText())) {
                        textField.setText(textField.getText() + "(-");
                    }
                } else if (e.getSource() == buttonBackSpace) {
                    if (textField.getText().equals("ERROR")) {
                        textField.setText("");
                    }
                    int len = textField.getText().length();
                    if (len > 0) {
                        textField.setText(textField.getText().substring(0, len - 1));
                    }
                } else if (e.getSource() == button9) {
                    if (textLength() && numberInput(textField.getText())) {
                        textField.setText(textField.getText() + "9");
                    }
                } else if (e.getSource() == button6) {
                    if (textLength() && numberInput(textField.getText())) {
                        textField.setText(textField.getText() + "6");
                    }
                } else if (e.getSource() == button3) {
                    if (textLength() && numberInput(textField.getText())) {
                        textField.setText(textField.getText() + "3");
                    }
                } else if (e.getSource() == buttonDivision) {
                    if (textLength() && signInput(textField.getText())) {
                        textField.setText(textField.getText() + "/");
                    }
                } else if (e.getSource() == buttonMultiplication) {
                    if (textLength() && signInput(textField.getText())) {
                        textField.setText(textField.getText() + "*");
                    }
                } else if (e.getSource() == buttonSubtraction) {
                    if (textLength() && signInput(textField.getText())) {
                        textField.setText(textField.getText() + "-");
                    }
                } else if (e.getSource() == buttonAddition) {
                    if (textLength() && signInput(textField.getText())) {
                        textField.setText(textField.getText() + "+");
                    }
                } else if (e.getSource() == buttonEqual) {
                    if (equalInput(textField.getText())) {
                        textField.setText(getAnswer(result(textField.getText())));
                    }
                }

                else if (e.getSource() == buttonAC) {
                    textField.setText("");
                }

            }
        };

        button7.addActionListener(actionListener);
        button4.addActionListener(actionListener);
        button1.addActionListener(actionListener);
        button0.addActionListener(actionListener);
        buttonOpenBracket.addActionListener(actionListener);

        button8.addActionListener(actionListener);
        button5.addActionListener(actionListener);
        button2.addActionListener(actionListener);
        buttonPoint.addActionListener(actionListener);
        buttonClosedBracket.addActionListener(actionListener);

        button9.addActionListener(actionListener);
        button6.addActionListener(actionListener);
        button3.addActionListener(actionListener);
        buttonNegativeNumber.addActionListener(actionListener);
        buttonBackSpace.addActionListener(actionListener);

        buttonDivision.addActionListener(actionListener);
        buttonMultiplication.addActionListener(actionListener);
        buttonSubtraction.addActionListener(actionListener);
        buttonAddition.addActionListener(actionListener);
        buttonEqual.addActionListener(actionListener);

        buttonAC.addActionListener(actionListener);
    }

    // Метод проверки на возможность ввода числа
    private Boolean numberInput(String expression) {

        String regex1 = "(.+)\\)";
        String regex2 = "(.*)0";
        String regex3 = "(.+)(\\.\\d*)";

        // Проверка на несоответствие запрещенным regex1 и regex2 и возвращение соответствия разрешенному regex3
        if (expression.matches(regex2) || expression.matches(regex1)) {
            return expression.matches(regex3);
        }

        return true;
    }

    // Метод проверки на возможность ввода точки
    private Boolean pointInput(String expression) {

        String regex1 = "(.*)(\\d+)";
        String regex2 = "(.+)(\\.\\d*)";

        return expression.matches(regex1) &&
                !expression.matches(regex2);
    }

    // Метод проверк на возможность ввода знака математической операции
    private Boolean signInput(String expression) {

        String regex1 = "";
        String regex2 = "\\(";
        String regex3 = "(.*)([-+*/.(])";

        return !expression.matches(regex1) &&
                !expression.matches(regex2) &&
                !expression.matches(regex3);
    }

    // Метод проверки на возможность ввода открывающейся скобки
    private Boolean openBracketInput(String expression) {

        String regex1 = "(.*)([^-+*/.(])([-+*/])";
        String regex2 = "";
        String regex3 = "(.*)\\(";

        return expression.matches(regex1) ||
                expression.matches(regex2) ||
                expression.matches(regex3);
    }

    // Метод проверки на возможность ввода закрывающейся скобки
    private Boolean closedBracketInput(String expression) {

        int countOpenBrackets = expression.length() - expression.replaceAll("\\(", "").length();
        int countClosedBrackets = expression.length() - expression.replaceAll("\\)", "").length();
        String regex1 = "(.+)(\\))";
        String regex2 = "(.+)(\\d+)";
        String regex3 = "(.*)\\(([\\d.]+)";

        return (expression.matches(regex1) || expression.matches(regex2)) &&
                (countOpenBrackets > countClosedBrackets) &&
                !expression.matches(regex3);
    }

    // Метод проверки на возможность ввода отрицательного числа
    private Boolean negativeNumberInput(String expression) {

        String regex1 = "(.*)([^-+*/.(])([-+*/])";
        String regex2 = "";
        String regex3 = "(.*)\\(";

        return expression.matches(regex1) ||
                expression.matches(regex2) ||
                expression.matches(regex3);
    }

    // Метод проверки на возможность получения результата выражения
    private Boolean equalInput(String expression) {

        int countOpenBrackets = expression.length() - expression.replaceAll("\\(", "").length();
        int countClosedBrackets = expression.length() - expression.replaceAll("\\)", "").length();

        return (countOpenBrackets == countClosedBrackets) && !expression.matches("");
    }

    // Метод получения результата выражения
    private Double result(String expression) {
//        System.out.println(expression);

        int len = expression.length();

        for (int i = (expression.length() - 1); i > 0; i--) {

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
                String resultInBrackets = String.valueOf(result(expression.substring(ind1 + 1, ind2)));

                return result(expression.substring(0, ind1)
                        + resultInBrackets
                        + expression.substring(ind2 + 1, len));

            } else if (expression.charAt(i) == '+') {
                return result(expression.substring(0, i)) + result(expression.substring(i + 1, len));
            } else if (expression.charAt(i) == '-') {

                // Если знак минус не характеризует отрицательное число, то выполняем операцию
                if ("+-*/".indexOf(expression.charAt(i - 1)) == -1) {
                    return result(expression.substring(0, i)) - result(expression.substring(i + 1, len));
                }
                // Иначе просто пропускаем операцию

            }
        }

        for (int i = (expression.length() - 1); i > 0; i--) {
            if (expression.charAt(i) == '*') {
                return result(expression.substring(0, i)) * result(expression.substring(i + 1, len));
            } else if (expression.charAt(i) == '/') {
                return result(expression.substring(0, i)) / result(expression.substring(i + 1, len));
            }
        }

        // Возвращаем число, которое может быть одним из 4-х вариантов
        if (expression.matches("\\d+") ||
                expression.matches("(\\d+)\\.(\\d+)") ||
                expression.matches("-(\\d+)") ||
                expression.matches("-(\\d+)\\.(\\d+)")) {
            return Double.parseDouble(expression);
        }

        return Double.POSITIVE_INFINITY;
    }

    // Метод получения ответа в формате String
    private String getAnswer(double result) {
        String answer = String.valueOf(result);

        if (Double.isInfinite(result)) {
            answer = "ERROR";
        } else if (Double.isNaN(result)) {
            answer = "ERROR";
        } else if (result == 0.0) {
            answer = "0.0";
        }

        // Если результат по длине больше текстового окна (больше 16)
        if (answer.length() > 16) {

            int pointIndex = answer.indexOf('.');
            if (pointIndex != -1 && pointIndex < 15) {

                BigDecimal bd = new BigDecimal(result);
                bd = bd.setScale(16 - pointIndex, RoundingMode.HALF_UP);
                answer = String.valueOf(bd);

                while (answer.charAt(answer.length() - 1) == '0') {
                    answer = answer.substring(0, answer.length() - 1);
                }

            } else if (pointIndex == 15) {
                answer = String.valueOf(Math.ceil(result));
            } else {
                answer = answer.substring(0, 16);
            }

        }

        if (answer.charAt(answer.length() - 1) == '0') {
            answer = answer.substring(0, answer.length() - 2);
        } else if (answer.charAt(answer.length() - 1) == '.') {
            answer = answer.substring(0, answer.length() - 1);
        }

        return answer;
    }

    // Метод для применения цвета к кнопкам
    private void setColor(JButton button) {
        button.setBackground(pink);
        button.setForeground(white);
    }

    // Метод для блокирования ввода с клавиатуры
//    private void keyboardBan() {
//        textField.addKeyListener(new KeyAdapter() {
//            @Override
//            public void keyTyped(KeyEvent e) {
//                e.consume();
//            }
//        });
//    }

    // Метод для проверки длины текстового поля на непревышение
    private Boolean textLength() {
        if (!textField.getText().matches("([EOR]+)")) {
            return textField.getText().length() < 16;
        }

        return false;
    }
}