/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceinveder;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author perri.christian
 */
public class SpaceInvader extends JFrame {

    public SpaceInvader() throws InterruptedException {
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Intro intro = new Intro();
        this.add(intro); // impacchetta e rende visibile il tutto
        this.pack();
        intro.run();
    }

    public static void main(String[] args) throws InterruptedException {
        SpaceInvader n1 = new SpaceInvader();
    }

}
