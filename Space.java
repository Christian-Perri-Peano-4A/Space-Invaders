/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceinveder;

import java.awt.Canvas;
import java.awt.Color;

/**
 *
 * @author perri.christian
 */
public class Space extends Canvas{
    Space() {
       System.out.println("Settaggio della finestra di gioco");
       setBackground (Color.BLACK);
       setSize(800, 600);
    }
}
