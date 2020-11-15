package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener{
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;
    
    private JFrame w;
    private Timer timer;
    
    ArrayList<Polymorph> poly = new ArrayList<Polymorph>();
    
    public static void main(String[] args) {
   	 new PolymorphWindow().buildWindow();
    }
    
    public void buildWindow(){
   	 w = new JFrame("poly");
   	 w.add(this);
   	 w.getContentPane().setPreferredSize(new Dimension(500, 500));
   	 w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 w.pack();
   	 w.setVisible(true);
   	 
   	poly.add(new BluePolymorph(50, 50));
   	poly.add(new RedMorph(100, 50 ));
   	poly.add(new MovingMorph(50,250));
   	poly.add(new CirM(250,250, 50,50));
   	poly.add(new mouse(100,100, 50,50));
   	poly.add(new Image(200,400, 50,50));
   	poly.add(new Message(200,300, 50, 50));
   	 
   	 timer = new Timer(1000 / 30, this);
   	 timer.start();
    }
    
    public void paintComponent(Graphics g){
    //draw background
   	 g.setColor(Color.GRAY);
   	 g.fillRect(0, 0, 500, 500);
   	
   	 //draw polymorph
   	 for (int i = 0; i < poly.size(); i++) {
   		poly.get(i).draw(g);
	 }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
     System.out.println("yes");
   	 repaint();
   	 for (int j = 0; j < poly.size(); j++) {
   		poly.get(j).update();
	 }
   	 
    }

}
