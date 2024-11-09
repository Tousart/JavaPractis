// cd "C:\Users\HUAWEI\IdeaProjects\practis\src\Lab12"
//
//
// javac Test.java
//
//
// javac Lab12/Test.java
// java Lab12.Test "C:\Users\HUAWEI\Pictures\Saved Pictures\Cat.jpg"
//
//
// cd "C:\Users\HUAWEI\IdeaProjects\practis\src"

package Lab12;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class Test extends JFrame {
    private Image image;

    public Test(String imagePath) {
        // Загружаем изображение
        image = new ImageIcon(imagePath).getImage();

        setTitle("Image Display");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        if (image != null) {
            g.drawImage(image, 0, 0, 800, 600, this);
        }
    }

    public static void main(String[] args) {
        if (args.length > 0) {
            String imagePath = args[0];
            if (new File(imagePath).exists()) {
                Test frame = new Test(imagePath);
                frame.setVisible(true);
            } else {
                System.out.println("No file: " + imagePath);
            }
        } else {
            System.out.println("Specify the path to the image");
        }
    }
}