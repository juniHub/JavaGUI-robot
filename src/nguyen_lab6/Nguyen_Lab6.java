package nguyen_lab6;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Arc2D;
import java.awt.geom.QuadCurve2D;
import javax.swing.ImageIcon;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Nguyen_Lab6 extends JPanel {
    
    Timer timer = new Timer(1000, null);
    int x=10,y=15;

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        setBackground(Color.BLACK); 
         
        // draw Hat
        g2.setColor(Color.GRAY);
        int xPoints[]= {270, 290, 305};
        int yPoints[] ={100, 60, 100 };
        g2.fillPolygon( xPoints, yPoints, 3);  
        g2.setColor(Color.ORANGE);
        g2.fillOval(268,30, 40, 40);
          
        // draw Face
        g2.setColor(Color.ORANGE);
        g2.fillRoundRect(150, 100 , 280, 200, 50, 50);
        g2.setColor(Color.LIGHT_GRAY);
        g2.fillRoundRect(170, 120 , 240, 160, 50, 50);
         
        // draw Mouth
         g2.setColor(Color.MAGENTA);
         g2.fillRoundRect(245, 250, 80, 24 , 40, 40);
         g2.setColor(Color.BLACK);
         g2.fillRect(260, 251, 5, 22);
         g2.fillRect(275, 251, 5, 22);
         g2.fillRect(290, 251, 5, 22);
         g2.fillRect(305, 251, 5, 22);
          
         // draw Eyes
      
        g2.setColor(Color.ORANGE);
        g2.fillOval(190, 160, 90, 90);
        g2.fillOval(290, 160, 90, 90);  
        g2.setColor(Color.WHITE);
        g2.fillOval(195, 165, 80, 80);
        g2.fillOval(295, 165, 80, 80);
       // g2.setColor(Color.BLUE);
       // g2.fillOval(212, 182, 45, 45);
       // g2.fillOval(312, 182, 45, 45);
         
          drawEyes(g2,212,182);
          drawEyes(g2,312,182);
          Surface mysurface = new Surface();
          //add(mysurface);
         
           timer.addActionListener( new ActionListener() { 
            @Override   
            public void actionPerformed(ActionEvent e) {
            
                     x=x+5;  
                   //  y=y+5;
               
             mysurface.setLocation(x, y);
           
             // drawEyes(g2,x,y);
              repaint();
            }
            });

        
        timer.start();
          
        //draw Hands
        drawHands(g2);
        drawSemiCircle(g2);
       
        // draw Body
        g2.setColor(Color.ORANGE);
        g2.fillRoundRect(170, 320 , 220, 140, 50, 50);
        g2.setColor(Color.YELLOW);
        g2.fillRoundRect(190, 340 , 180 , 100 , 50, 50);
        g2.setColor(Color.BLACK);
        g2.fillRoundRect(195, 345 , 170 , 90 , 50 , 50);
        
        g2.setColor(Color.LIGHT_GRAY);
        g2.fillRect(240, 300, 80, 20);
        g2.setColor(Color.LIGHT_GRAY);
        g2.fillRect(205, 460, 150, 15);
        
        g2.setColor(Color.ORANGE);
        g2.fillRect(190, 475, 180, 30);
        g2.fillRoundRect(190, 475 , 180, 60, 150, 150);
        g2.setColor(Color.YELLOW);
        g2.fillRoundRect(190, 550 , 180, 10, 30, 30);
        g2.fillRoundRect(215, 570 , 120, 10, 30, 30);
        g2.fillRoundRect(235, 590 , 80, 10, 30, 30);
        
         //draw Star
        drawStar(g2);
        
        //draw Rivets
        drawCircle(g2);
        
        //drawSemiCircle(g2);
 
         //draw Zigzag
       drawZigzag(200, 320, g2);
 
    }
    
      private void drawSemiCircle(Graphics2D g){
     
        g.setColor(Color.YELLOW);
        g.fillOval(40,310,40, 40);
   
        g.setColor(Color.BLUE);
        Shape shape=new Arc2D.Float(50,280,60,60,45,-150, Arc2D.CHORD); 
        g.fill(shape);
        
        g.setColor(Color.BLUE);
        shape=new Arc2D.Float(5,280,60,60,150,150, Arc2D.CHORD); 
        g.fill(shape);
        
       //g.rotate(45.0 * 0.0174532925 , 15, 150);
        shape = new Arc2D.Float(25, 300, 70,70,0, -180, Arc2D.CHORD); 
        g.setColor(Color.ORANGE);
        g.fill(shape); 
        
        
        g.setColor(Color.YELLOW);
        g.fillOval(480,310,40, 40);
   
        g.setColor(Color.BLUE);
        shape=new Arc2D.Float(490,280,60,60,45,-150, Arc2D.CHORD); 
        g.fill(shape);
        
        g.setColor(Color.BLUE);
        shape=new Arc2D.Float(445,280,60,60,150,150, Arc2D.CHORD); 
        g.fill(shape);
        
        shape = new Arc2D.Float(465, 300, 70,70,0, -180, Arc2D.CHORD); 
        g.setColor(Color.ORANGE);
        g.fill(shape); 
      
     }
     
     private void drawZigzag(int x, int y,  Graphics2D g){
     
         
        g.setColor(Color.MAGENTA);
        g.translate(x,y);
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.drawLine(50, 50, 80, 80);
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.drawLine(0, 50, 50, 50);
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.drawLine(100,60, 80,80);
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.drawLine(120, 90, 100, 60);  
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.drawLine(160,40, 120, 90);    
         
     }
     
     private void drawStar(Graphics2D g){
              
        g.setColor(Color.MAGENTA);
       
        int STAR_POINTS = 10;
	int[] polygonX = new int[STAR_POINTS];
	int[] polygonY = new int[STAR_POINTS];
        double innerRadius = 20*Math.sin(Math.toRadians(18)/Math.sin(Math.toRadians(54)));
       
       for (int i = 18; i < 360; i += 72) {
			polygonX[(i-18)/36] = 230+ (int) (20 * Math.cos(Math.toRadians(i)));
			polygonY[(i-18)/36] = 370 - (int) (20 * Math.sin(Math.toRadians(i))); 
		}
       
       for (int i = 54; i < 360; i += 72) {
			polygonX[(i-18)/36] = 230 + (int) (innerRadius * Math.cos(Math.toRadians(i)));
			polygonY[(i-18)/36] = 370 -(int) (innerRadius * Math.sin(Math.toRadians(i))); 
		}

        g.fillPolygon(polygonX, polygonY, STAR_POINTS);
       
     }
     private void drawHands(Graphics2D g){
       
       g.setColor(Color.LIGHT_GRAY);
       drawBezier(30, 350, 130, 550, 230, 350, g);
       g.setColor(Color.BLACK);
       drawBezier(60, 300, 150, 500, 190, 300, g);
        
       
       g.setColor(Color.LIGHT_GRAY);
       drawBezier(330, 350, 430, 550, 530, 350, g);
       g.setColor(Color.BLACK);
       drawBezier(360, 300, 450, 500, 490, 300, g);
     
       g.setColor(Color.ORANGE);
       g.fillArc(110,350,120,120,95,40);
       g.fillArc(320,350,120,120,75,-40);
       
       g.setColor(Color.BLUE);
       g.fillArc(75,335,120,120,220,50);
       g.fillArc(375,330,120,120,280,50); 
        
     }
     
     public void drawBezier(int x1, int y1, int x2, int y2, int x3, int y3, Graphics2D myg2){
   
       QuadCurve2D quadcurve = new QuadCurve2D.Float(x1, y1, x2, y2, x3, y3);
       myg2.fill(quadcurve);
   }
     
     private void drawCircle(Graphics2D g){
       g.setColor(Color.WHITE);
       g.fillOval(160,110,10,10);
       g.fillOval(160,270,10,10);
       g.fillOval(400,110,10,10);
       g.fillOval(400,275,10,10); 
       g.fillOval(180,340,10,10);
       g.fillOval(180,440,10,10);
       g.fillOval(370,340,10,10);
       g.fillOval(370,440,10,10); 
       g.fillOval(55,340,10,10);
       g.fillOval(495,340,10,10);
         
     }
     
     private void drawEyes(Graphics2D g,int x, int y){
         
      
        g.setColor(Color.BLUE);
        g.fillOval(x, y, 45, 45);
        g.fillOval(x, y, 45, 45);
         
         
         
     }

    public static void main(String[] args) {
        Nguyen_Lab6 happy = new Nguyen_Lab6();
        JFrame window = new JFrame("Nguyen_Lab6");
        window.add(happy);
        window.setSize(600, 800);
        window.setResizable(false);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class Surface extends JPanel {
    private static int locationX =0;
    private static int locationY =0;
    
    @Override
    public void setLocation(int  x, int y){
        locationX = x;
        locationY = y;
    }
    
    private void doDrawing(Graphics g) {

       Graphics2D g2d = (Graphics2D) g;
       g2d.setColor(Color.WHITE);
       g2d.drawString("CSCI230", locationX, locationY);
    
       
    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        doDrawing(g);
    }
}

