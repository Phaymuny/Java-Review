package Label;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Jlabel = a GUI display area for string of text, an image, or both.

        ImageIcon imageIcon = new ImageIcon("icons8.png");

        JLabel label = new JLabel();
        label.setText("Bro, do you want to even code?");
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
        label.setIcon(imageIcon);
        frame.add(label);

    }
}
