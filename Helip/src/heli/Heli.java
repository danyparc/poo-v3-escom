
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package heli;

import javax.swing.JFrame;

/**
 *
 * @author Lab-Prog2
 */
public class Heli{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame marco=new JFrame("Heli Kills");
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setSize(800,800);
        HeliPanel li=new HeliPanel();
        //Thread t=new Thread(li);
        //t.start();
    
        marco.add(li);
        marco.pack();
        marco.setVisible(true);
        
        // TODO code application logic here
    }
}