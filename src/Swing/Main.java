package Swing;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

JButton b = new JButton("Click here");
b.setBounds(80,150,150,60);

JLabel label = new JLabel();
label.setText("Bro, do you even code");

        JFrame frame = new JFrame();
        frame.setTitle("JFrame");

        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(b);
        frame.add(label);

    }
}
