package com.company;

import java.awt.Graphics;
import javax.swing.JPanel;

public class SpiralJPanel extends JPanel {

    public void paintComponent(Graphics g) {
        double rSTEP = 0.25 * Math.PI;
        int dMIN = 30;
        int dSTEP = 5;
        int CENTRE = 150;
        int n = 25;

        super.paintComponent(g);

        int[] x = new int[n];
        int[] y = new int[n];

        for (int i = 0; i < n; ++i) {
            int dist = dMIN + i * dSTEP;
            double rad = i * rSTEP;
            x[i] = (int) (CENTRE + dist * Math.cos(rad));
            y[i] = (int) (CENTRE + dist * Math.sin(rad));
        }
        g.drawPolyline(x, y, n);
    }
}