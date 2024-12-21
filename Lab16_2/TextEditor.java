package Lab16_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextEditor extends JFrame {
    private JTextArea textArea = new JTextArea();;
    private JMenuBar menuBar = new JMenuBar();

    public TextEditor() {
        super("Text Editor");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Появление окна в центре экрана
        setLocationRelativeTo(null);

        // Создаем JTextArea
        textArea();

        // Добавляем скролл-бар
        add(new JScrollPane(textArea), BorderLayout.CENTER);

        // Меню выбора цвета
        colorMenu();

        // Меню выбора шрифта
        fontMenu();

        // Обновляем меню-бар
        setJMenuBar(menuBar);
    }

    private class ColorAction implements ActionListener {
        private String colorName;

        public ColorAction(String colorName) {
            this.colorName = colorName;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (colorName.equals("Синий")) {
                textArea.setForeground(Color.BLUE);
            } else if (colorName.equals("Красный")) {
                textArea.setForeground(Color.RED);
            } else if (colorName.equals("Черный")) {
                textArea.setForeground(Color.BLACK);
            }
        }
    }

    private class FontAction implements ActionListener {
        private String fontName;

        public FontAction(String fontName) {
            this.fontName = fontName;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (fontName.equals("Times New Roman")) {
                textArea.setFont(new Font("Times New Roman", Font.PLAIN, 20));
            } else if (fontName.equals("MS Sans Serif")) {
                textArea.setFont(new Font("MS Sans Serif", Font.PLAIN, 20));
            } else if (fontName.equals("Courier New")) {
                textArea.setFont(new Font("Courier New", Font.PLAIN, 20));
            }
        }
    }

    private void textArea() {
        // Автоматический перенос на следующую строку, когда нынешняя превышает ширину
        textArea.setLineWrap(true);

        // Перенос на следующую строку по словам, а не по символам
        textArea.setWrapStyleWord(true);

        // Шрифт по умолчанию
        textArea.setFont(new Font("Times New Roman", Font.PLAIN, 20));
    }

    private void colorMenu() {
        JMenu colorMenu = new JMenu("Цвет");
        String[] colors = {"Синий", "Красный", "Черный"};
        for (String colorName : colors) {
            JMenuItem menuItem = new JMenuItem(colorName);
            menuItem.addActionListener(new ColorAction(colorName));
            colorMenu.add(menuItem);
        }

        menuBar.add(colorMenu);
    }

    private void fontMenu() {
        JMenu fontMenu = new JMenu("Шрифт");
        String[] fonts = {"Times New Roman", "MS Sans Serif", "Courier New"};
        for (String fontName : fonts) {
            JMenuItem menuItem = new JMenuItem(fontName);
            menuItem.addActionListener(new FontAction(fontName));
            fontMenu.add(menuItem);
        }

        menuBar.add(fontMenu);
    }

    public static void main(String[] args) {
        new TextEditor().setVisible(true);
    }
}
