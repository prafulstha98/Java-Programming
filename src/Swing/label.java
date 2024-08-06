package Swing;

import javax.swing.*;
public class label
{
    public static void main(String args[])
    {
        JFrame f= new JFrame("Label Example");
        JLabel label = new JLabel("Bro, do you even code?");

        f.add(label);
        f.setSize(500,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}