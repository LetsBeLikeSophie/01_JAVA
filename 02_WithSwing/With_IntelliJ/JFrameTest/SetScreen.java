package com.swing;

import javax.swing.*;
import java.awt.*;

public class SetScreen extends JFrame {

    public SetScreen(String title) {
        super(title);
        display();
    }
    public void display(){
        setSize(100, 100);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
