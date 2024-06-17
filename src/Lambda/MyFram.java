package Lambda;

import javax.swing.*;

public class MyFram extends JFrame {
    JButton mybutton = new JButton("My button");
    MyFram(){
        mybutton.setBounds(100,100,100,100);
        mybutton.addActionListener(
            (e) -> System.out.println("You clicked")
        );

        /*mybutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("You clicked");
            }
        });*/

        this.add(mybutton);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(420,420);
        this.setLayout(null);
        this.setVisible(true);
    }
}
