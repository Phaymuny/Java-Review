package JFrame;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //Jframe = is window GUI to add components to
        JFrame frame = new JFrame(); //create frame object
        frame.setTitle("The Title"); //set title to your frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //set to close the running program when user click cross
        frame.setResizable(false); //make un-resizeable frame
        frame.setSize(420,420); //set size width and height of frame
        frame.setVisible(true); //make frame visible


        ImageIcon image = new ImageIcon("D:/Personal/JavaClass/JavaSelfLearn/src/JFrameicons8.png"); //create image Icons
        frame.setIconImage(image.getImage()); //this will change icon of frame
        frame.getContentPane().setBackground(Color.gray);

    }

}
