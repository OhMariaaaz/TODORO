package com.view;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class MainScreen {
    public static void main(String[] args){
        JFrame mainScreen = new JFrame();

        mainScreen.setTitle("TODORO");
        mainScreen.setSize(500,500);
        mainScreen.setResizable(true);
        mainScreen.setVisible(true);
        mainScreen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon image = new ImageIcon("demo/src/main/java/com/view/marra.png");
        mainScreen.setIconImage(image.getImage());

        mainScreen.getContentPane().setBackground(Color.pink);

        JLabel label = new JLabel("Welcome to TODORO");
        label.setText("Welcome to TODORO");
        label.setIcon(image);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(null);
        label.setFont(new Font("MB Boli",Font.PLAIN,20));

        mainScreen.add(label);
    }
    
}
