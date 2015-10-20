/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package heli;

import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.*;

/**
 *
 * @author Lab-Prog2
 */
public class Helicop implements Shape{
    private GeneralPath ruta=new GeneralPath();
    /*private GeneralPath helix=new GeneralPath();
    private GeneralPath down=new GeneralPath();
    private GeneralPath piso=new GeneralPath();
    private GeneralPath vent=new GeneralPath();*/
    public Helicop(double x,double y,double b,double h){
        //CopyPaste Start Here*********---->
        
        ruta.moveTo(x+b*3/22,y+h*5/8);
        ruta.lineTo(x+b*5/22,y+h*41/80);
        ruta.quadTo(x+b*1/4,y+h*199/400,x+b*3/11,y+h/2);
        ruta.lineTo(x+b*67/220,y+h*400/800);
        ruta.curveTo(x+b*343/1100,y+h*380/800,x+b*320/1100,y+h*380/800,x+b*500/1100,y+h*380/800); //
        ruta.quadTo(x+b*510/1100,y+h*380/800,x+b*515/1100,y+h*417/800);
        ruta.lineTo(x+b*850/1100,y+h*425/800); //Cola
        ruta.lineTo(x+b*940/1100,y+h*330/800);
        ruta.lineTo(x+b*965/1100,y+h*330/800);
        ruta.lineTo(x+b*885/1100,y+h*450/800);
        ruta.lineTo(x+b*885/1100,y+h*515/800);
        ruta.lineTo(x+b*865/1100,y+h*515/800);
        ruta.lineTo(x+b*850/1100,y+h*475/800);
        ruta.lineTo(x+b*515/1100,y+h*525/800);
        ruta.lineTo(x+b*205/1100,y+h*525/800);
        ruta.curveTo(x+b*200/1100,y+h*524/800,x+b*175/1100,y+h*525/800,x+b*150/1100,y+h*500/800);
        ruta.closePath();
        
        ruta.moveTo(x+b*410/1100,y+h*380/800);
        ruta.lineTo(x+b*410/1100,y+h*370/800);
        ruta.lineTo(x+b*405/1100,y+h*370/800);
        ruta.lineTo(x+b*405/1100,y+h*360/800);
        ruta.lineTo(x+b*425/1100,y+h*360/800);
        ruta.lineTo(x+b*425/1100,y+h*370/800);
        ruta.lineTo(x+b*420/1100,y+h*370/800);
        ruta.lineTo(x+b*420/1100,y+h*380/800);
        ruta.closePath();
        ruta.moveTo(x+b*407/1100,y+h*360/800);
        ruta.lineTo(x+b*407/1100,y+h*330/800);
        ruta.lineTo(x+b*423/1100,y+h*330/800);
        ruta.lineTo(x+b*423/1100,y+h*360/800);
        
        ruta.moveTo(x+b*423/1100,y+h*350/800);
        ruta.lineTo(x+b*450/1100,y+h*351/800);
        ruta.lineTo(x+b*450/1100,y+h*331/800);
        ruta.lineTo(x+b*423/1100,y+h*335/800);
        ruta.lineTo(x+b*407/1100,y+h*335/800);
        
        ruta.lineTo(x+b*380/1100,y+h*331/800);
        ruta.lineTo(x+b*380/1100,y+h*352/800);
        ruta.lineTo(x+b*407/1100,y+h*350/800);
        //Helice 1
        ruta.moveTo(x+b*380/1100,y+h*352/800);
        ruta.lineTo(x+b*80/1100,y+h*380/800);
        ruta.lineTo(x+b*80/1100,y+h*360/800);
        ruta.lineTo(x+b*380/1100,y+h*342/800);
        //helice 2
        ruta.lineTo(x+b*80/1100,y+h*320/800);
        ruta.lineTo(x+b*80/1100,y+h*300/800);
        ruta.lineTo(x+b*380/1100,y+h*331/800);
        ruta.moveTo(x+b*450/1100,y+h*350/800);
        //helice 3
        ruta.lineTo(x+b*750/1100,y+h*368/800);
        ruta.lineTo(x+b*750/1100,y+h*348/800);
        ruta.lineTo(x+b*450/1100,y+h*340/800);
        //helice 4
        ruta.lineTo(x+b*750/1100,y+h*300/800);
        ruta.lineTo(x+b*750/1100,y+h*280/800);
        ruta.lineTo(x+b*450/1100,y+h*330/800);
        ruta.closePath();
        
        ruta.moveTo(x+b*150/1100,y+h*500/800);
        ruta.curveTo(x+b*155/1100,y+h*570/800,x+b*250/1100,y+h*570/800,x+b*450/1100,y+h*560/800);
        ruta.quadTo(x+b*510/1100,y+h*542/800,x+b*515/1100,y+h*525/800);
        ruta.closePath();
        
        ruta.moveTo(x+b*450/1100,y+h*550/800);
        ruta.lineTo(x+b*450/1100,y+h*600/800);
        ruta.lineTo(x+b*350/1100,y+h*600/800);
        ruta.lineTo(x+b*350/1100,y+h*550/800);
        ruta.lineTo(x+b*335/1100,y+h*550/800);
        ruta.lineTo(x+b*335/1100,y+h*600/800);
        ruta.lineTo(x+b*285/1100,y+h*600/800);
        ruta.quadTo(x+b*255/1100,y+h*595/800,x+b*250/1100,y+h*585/800);
        ruta.lineTo(x+b*235/1100,y+h*585/800);
        ruta.quadTo(x+b*250/1100,y+h*605/800,x+b*285/1100,y+h*615/800);
        ruta.lineTo(x+b*500/1100,y+h*615/800);
        ruta.lineTo(x+b*500/1100,y+h*600/800);
        ruta.lineTo(x+b*465/1100,y+h*600/800);
        ruta.lineTo(x+b*465/1100,y+h*550/800);
        ruta.closePath();
        
        ruta.moveTo(x+b*185/1100,y+h*480/800);
        ruta.lineTo(x+b*240/1100,y+h*430/800);
        ruta.lineTo(x+b*270/1100,y+h*435/800);
        ruta.lineTo(x+b*225/1100,y+h*485/800);
        ruta.closePath();
        
        ruta.moveTo(x+b*287/1100,y+h*435/800);
        ruta.lineTo(x+b*245/1100,y+h*485/800);
        ruta.lineTo(x+b*370/1100,y+h*485/800);
        ruta.lineTo(x+b*370/1100,y+h*435/800);
        ruta.closePath();
        
        ruta.moveTo(x+b*380/1100,y+h*435/800);
        ruta.lineTo(x+b*380/1100,y+h*485/800);
        ruta.lineTo(x+b*400/1100,y+h*485/800);
        ruta.lineTo(x+b*400/1100,y+h*435/800);
        ruta.closePath();
        
        
        
        
        
        
    }
    
    
    

    @Override
    public Rectangle getBounds() {
        return ruta.getBounds();
	//return helix.getBounds();
	/*return down.getBounds();
	return piso.getBounds();
	return vent.getBounds();*/
    }
    
    @Override
    public Rectangle2D getBounds2D() {
        return ruta.getBounds2D();
        //return helix.getBounds2D();
       
    }

    
    @Override
    public boolean contains(double d, double d1) {
        return ruta.contains(d, d1);
        //return helix.contains(d,d1);
        
    }

    @Override
    public boolean contains(Point2D pd) {
        return ruta.contains(pd);
        //return helix.contains(pd);
               
    }

    @Override
    public boolean intersects(double d, double d1, double d2, double d3) {
        return ruta.intersects(d, d1, d2, d3);
        //return helix.intersects(d,d1,d2,d3);
                
    }

    @Override
    public boolean intersects(Rectangle2D rd) {
        return ruta.intersects(rd);
        //return helix.intersects(rd);
    }

    @Override
    public boolean contains(double d, double d1, double d2, double d3) {
        return ruta.contains(d, d1, d2, d3);
        //return helix.contains(d,d1,d2,d3);
        
    }

    @Override
    public boolean contains(Rectangle2D rd){
        return ruta.contains(rd);
        //return helix.contains(rd);
    }

    @Override
    public PathIterator getPathIterator(AffineTransform at) {
        return ruta.getPathIterator(at);
        //return helix.getPathIterator(at);
    }

    @Override
    public PathIterator getPathIterator(AffineTransform at, double d) {
        return ruta.getPathIterator(at, d);
        //return helix.getPathIterator(at,d);
    }
    
}
