package Lab24_3;

import javax.swing.*;

public class Task3 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Editor(new CreateTextDocument());
            }
        });
    }
}
