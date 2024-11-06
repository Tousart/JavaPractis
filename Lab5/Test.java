package Lab5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test {
    public static void main(String[] args) {
        JFrame frame = new JFrame("MATCH");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
//        frame.setLayout(new FlowLayout());

        Score score = new Score();

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

        JPanel textPanel = new JPanel();
        textPanel.setLayout(new BoxLayout(textPanel, BoxLayout.Y_AXIS));

        JButton milan = new JButton("AC Milan");
        milan.setBackground(Color.RED);
        JButton realMadrid = new JButton("Real Madrid");
        realMadrid.setBackground(Color.WHITE);
        JButton reverse = new JButton("Reverse");
        reverse.setBackground(Color.GREEN);

        JLabel resultLabel = new JLabel("Score: " + score.getMilan() + "X" + score.getReal());
        resultLabel.setForeground(Color.YELLOW);
        JLabel lastScorerLabel = new JLabel("Last Scorer: N/A");
        lastScorerLabel.setForeground(Color.YELLOW);
        JLabel winnerLabel = new JLabel("Winner: DRAW");
        winnerLabel.setForeground(Color.YELLOW);

        milan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                score.setMilan();
                lastScorerLabel.setText("Last Scorer: AC Milan");
                resultLabel.setText("Result: " + score.getMilan() + "X" + score.getReal());
                if (score.getMilan() > score.getReal()) winnerLabel.setText("Winner: AC Milan");
                else if (score.getMilan() < score.getReal()) winnerLabel.setText("Winner: Real Madrid");
                else winnerLabel.setText("Winner: DRAW");
            }
        });

        realMadrid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                score.setReal();
                lastScorerLabel.setText("Last Scorer: Real Madrid");
                resultLabel.setText("Result: " + score.getMilan() + "X" + score.getReal());
                if (score.getMilan() > score.getReal()) winnerLabel.setText("Winner: AC Milan");
                else if (score.getMilan() < score.getReal()) winnerLabel.setText("Winner: Real Madrid");
                else winnerLabel.setText("Winner: DRAW");
            }
        });

        reverse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                score.reverse();
                resultLabel.setText("Result: " + score.getMilan() + "X" + score.getReal());
                if (score.getMilan() > score.getReal()) {
                    lastScorerLabel.setText("Last Scorer: AC Milan");
                    winnerLabel.setText("Winner: AC Milan");
                }
                else if (score.getMilan() < score.getReal()) {
                    lastScorerLabel.setText("Last Scorer: Real Madrid");
                    winnerLabel.setText("Winner: Real Madrid");
                }
                else winnerLabel.setText("Winner: DRAW");
            }
        });

        buttonPanel.add(milan);
        buttonPanel.add(realMadrid);
        textPanel.add(reverse);
        textPanel.add(resultLabel);
        textPanel.add(lastScorerLabel);
        textPanel.add(winnerLabel);
//        textPanel.add(Box.createRigidArea(new Dimension(100, 10)));

        buttonPanel.setBackground(Color.BLACK);
        textPanel.setBackground(Color.BLACK);

        frame.add(buttonPanel, BorderLayout.NORTH);
//        textPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        frame.add(textPanel, BorderLayout.CENTER);

        frame.pack();
//        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
}