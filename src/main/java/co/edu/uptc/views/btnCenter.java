package co.edu.uptc.views;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JWindow;

public class btnCenter extends JWindow{

    public btnCenter(){
        this.setSize(100, 50); 
        this.setLayout(null);
        createBtn();
        adjustSize();
    }

    private void createBtn(){
        JButton boton = new JButton("Centrado");
        boton.setBounds(0, 0, 100, 50);
        this.add(boton);
    }

    private void adjustSize(){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;
        int x = (screenWidth - this.getWidth()) / 2;
        int y = (screenHeight - this.getHeight()) / 2;
        this.setLocation(x, y);
        this.setVisible(true);
    }

}
