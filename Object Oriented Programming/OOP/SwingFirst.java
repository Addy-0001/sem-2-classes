package OOP;

import javax.swing.*;

public class SwingFirst {
    public static void main(String[] args) {
        JFrame frame = new JFrame("J Frame Application");
        frame.setSize(300, 300);
        frame.setLayout(null);
        JLabel label = new JLabel("Hello World");
        label.setBounds(100, 100, 300, 300);

        JLabel label2 = new JLabel("New String Label");
        label2.setText("Hello World");
        label.setBounds(200, 200, 100, 100);

        frame.add(label);
        frame.add(label2);
        frame.setVisible(true);
    }
}
