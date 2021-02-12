package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame( "Spiral" );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

        SpiralJPanel spiralJPanel = new SpiralJPanel();
        frame.add(spiralJPanel); // add spiralJPanel to frame
        frame.setSize(350, 350); // set frame size
        frame.setVisible(true); // display frame
    }
}
