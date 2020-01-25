/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceinveder;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

/**
 *
 * @author perri.christian
 */
public class Intro extends Space{
     @Override
     public void paint (Graphics g){
         g.setColor(Color.green);     // Colora la scritta di colore verde
         g.setFont(new Font("Bold", Font.PLAIN, 40)); // Imposta il font della scrittura e la dimensione
         g.drawString("Space Invaders", 100, 100); // Serve ad impostare la poszione della scritta
         g.setFont(new Font("Bold", Font.PLAIN, 10));
         g.drawString("           By Alaberto", 110, 110);
     }

    void run() {
        
    }

}
