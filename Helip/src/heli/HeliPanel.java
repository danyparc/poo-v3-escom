/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package heli;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.*;
import java.awt.geom.Ellipse2D;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

/**
 *
 * @author Lab-Prog2
 */
public class HeliPanel extends JPanel implements MouseMotionListener,Runnable,KeyListener,MouseListener{
    private Timer t;
    private boolean R=false; 
    private double x=700,y=500,xb=-20,yb=0,rX,rY;
    private int tecli=0,xo=0,yo=0,cou=0,aux=0;
    private double arX[]=new double[100];
    private double arY[]=new double[100];
    private Helicop h;
    private Ellipse2D el;
    Thread hilo=new Thread(this);
        public HeliPanel(){
        setPreferredSize(new Dimension(800,800));
        setBackground(Color.cyan);
        addMouseMotionListener(this);
        addMouseListener(this);
        addKeyListener(this);
        setFocusable(true);
        
        //xb=x;
        
       /*t=new Timer(15, new ActionListener(){
            
            @Override
           public void actionPerformed(ActionEvent ev) {
                
                
            }
             
    });
    
    */
        
    }
        

    public void mouseMoved(MouseEvent e){
        x=e.getX();
        y=e.getY();
        repaint();
   }
        
    @Override
    public void run() {
       xb=x;
       yb=y+50;
        while(true)
        {
            yo+=1;
             if(yo==100){
                 yo=0;
             }   
               for(int cou=0;cou<500;cou++){
                    arX[cou]=xb;
                    arX[cou]-=5;
                    //arY[cou]=yb;
                setX(arX[cou]);
                
                repaint();
                }
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(HeliPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
                
            
        }
       
    }
    
    
    public void setX(double a){
        xb=a;
    }
    public void setY(double bi){
        yb=bi;
    }
       
        public void Elipses(double b){
                tecli=(int) b;
        }
    
        
        @Override
      public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2=(Graphics2D)g;
        
        Helicop h=new Helicop(x,y,100,80);
        if(R){
         for(int i=0;i<aux;i++){
          el=new Ellipse2D.Double(arX[i],arY[i]+50, 10, 10);
          
          g2.fill(el);
          arX[i]-=10;
          
        }
        }
          //yo=(int) yb;
          //xo=(int) xb;
        //g2.fillOval(xo, yo, 10, 10);
        //g2.fill(el);
        g2.draw(h);
        g2.fill(h);
       
        }

    @Override
    public void mouseDragged(MouseEvent me) {
    }
    @Override
    public void keyTyped(KeyEvent ke) {
    }
    @Override
    public void keyPressed(KeyEvent ke) {
        
        if(ke.getKeyCode()==KeyEvent.VK_RIGHT){
          R=true;
          aux+=1;
          arX[aux]=x;
          arY[aux]=y;
          repaint();
          if(aux==99){
              aux=0;
          }
          
          hilo.start();
            //tecli+=1;
            
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        /*
        setX(x);
        setY(y+50);
        hilo.start();
       repaint();
       */
    } 

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }

    

    
}

