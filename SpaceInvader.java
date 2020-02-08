/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceinveder;


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author perilli.alberto
 */
public class SpaceInvader extends JFrame {

    public SpaceInvader() throws InterruptedException {
       
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Intro intro = new Intro();
        this.add(intro); // impacchetta e rende visibile il tutto
        this.pack();
        this.setVisible(true);
        intro.run();
    }

    public static void main(String[] args) throws InterruptedException {
        SpaceInvader giochino=new SpaceInvader();
        Space spazio=new Space();
    }

}
