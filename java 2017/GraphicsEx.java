import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;


public class GraphicsEx extends JFrame{
	
	
	public class Canvas extends JPanel{
 	
 		public Canvas(){
 		}
 	
		 	public void paintComponent(Graphics g){
	      	   g.fillArc(25, 25, 50, 50, 0, 360);
	     	   g.fillArc(100, 25, 50, 50, 0, 360);
	     	   g.setColor(Color.red);
	       	   g.fillArc(50, 40, 75, 75, 0, 360);
	       	   g.drawRect(50, 50, 150, 100);
	       	   
	       	   // R G B
				g.setColor(new Color(123, 200, 193));
				g.drawOval(50, 200, 150, 100);
				
				g.drawLine(300, 50, 450, 200);
				g.drawLine(300, 50+20, 450, 200+20);
				
				g.drawString("Do you like Java?", 300, 100);

	  		 }      	
	}
	
	public GraphicsEx() {
		super();
	  setTitle("Graphics Example");
	  setSize(500, 500);
	  setLocationRelativeTo(null);
	  setDefaultCloseOperation(EXIT_ON_CLOSE);
	  
	  Canvas canvas = new Canvas();
	  getContentPane().add(canvas);
	}
	
	public static void main(String[] args){
		GraphicsEx win = new GraphicsEx();
		win.setVisible(true);
		
		
	}
}