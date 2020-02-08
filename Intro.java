/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceinveder;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferStrategy;

/**
 *
 * @author perilli.alberto
 */
public class Intro extends Space {

    private int i;
    private BufferStrategy strategy;

    void run() throws InterruptedException {
        createBufferStrategy(2);
        strategy = getBufferStrategy();
        setBackground(Color.BLACK);
        setSize(800, 600);

        for (i = 200; i >= 15; i -= 1) {
            System.out.println("i: " + i);
            paint();
            Thread.sleep(10);
          
        }
          for (i = 0; i <10; i++) {
            System.out.println("i: "+i);
            paint();

        }
        
    }

    public void paint() {
        Graphics2D g = (Graphics2D) strategy.getDrawGraphics();
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, 800, 600);

        g.setColor(Color.green);     // Colora la scritta di colore verde
        g.setFont(new Font("Bold", Font.PLAIN, 40 + i)); // Imposta il font della scrittura e la dimensione
        g.drawString("Space Invaders", 100 + i, 100 + i); // Serve ad impostare la poszione della scritta
        g.setFont(new Font("Bold", Font.PLAIN, 10 + i));
        g.drawString("           By Alberto Perilli", 110 + i + i, 110 + i + i);
        g.dispose();
        strategy.show();
    }

}
