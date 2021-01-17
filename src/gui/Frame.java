package gui;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    public Frame(){
        super("Unit Converter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350,600);
        setLocation(600,200);
        setLayout(new FlowLayout(FlowLayout.CENTER));


        JPanel buttonPanel = new ButtonPanel();
        add(buttonPanel);




        setVisible(true);
    }
}
