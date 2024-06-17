import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Triangle extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int size = 50; // size of the square
        int startX = 100, startY = 100; // starting point of the square
        for (int i = 0; i < size; i++) {
            g.drawLine(startX + i, startY, startX + i, startY + size); // draw right line
            g.drawLine(startX, startY + i, startX + size, startY + i); // draw bottom line
            g.drawLine(startX + size - i, startY + size, startX + size - i, startY); // draw left line
            g.drawLine(startX + size, startY + size - i, startX, startY + size - i); // draw top line
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Square");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Triangle());
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}