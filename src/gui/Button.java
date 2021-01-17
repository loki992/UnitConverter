package gui;

import model.lengthConverter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ButtonPanel extends JPanel implements ActionListener {

    public static final int HEIGHT = 100;
    public static final int WIDTH = 300;
    private JButton lengthButton;
    private JButton areaButton;
    private JButton sizeButton;
    private JButton volumeButton;
    private JButton weightButton;
    private JButton psysicsButton;


    public ButtonPanel(){
        lengthButton = new JButton("Długość");
        areaButton = new JButton("Powierzchnia");
        sizeButton = new JButton("Rozmiarówki");
        volumeButton = new JButton("Pojemność");
        weightButton = new JButton("Waga");
        psysicsButton = new JButton("Inne jednostki fizyczne");

        lengthButton.addActionListener(this);
        areaButton.addActionListener(this);
        sizeButton.addActionListener(this);
        volumeButton.addActionListener(this);

        setLayout(new FlowLayout(FlowLayout.CENTER));
        setPreferredSize(new Dimension(WIDTH, HEIGHT));

        add(lengthButton);
        add(areaButton);
        add(sizeButton);
        add(volumeButton);
        add(weightButton);
        add(psysicsButton);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == lengthButton){
            lengthConverter.menu();
        }

    }
}
