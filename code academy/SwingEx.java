import javax.swing.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.awt.Graphics;

class SwingEx extends JFrame{
	
	public class VisableBar extends JPanel{
 		public int barLength;
 	
 		public VisableBar(){
 			super();
 			this.setLayout(null);
			barLength = 0;
 		}
 	
	 	public void paintComponent(Graphics g){
	 		g.fillRect(0,50,barLength,50);
	 		for(int i=0;i<4;i++){
	            g.fillArc(0+i*50, 100, 50, 50, 0, 360);
	        }
	 	}
}

//window builder	
	SwingEx(){
	  setTitle("swing example");
	  setSize(300, 200);
	  setLocationRelativeTo(null);
	  setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	// creates and adds a panel      
	  VisableBar panel = new VisableBar();
      panel.barLength = 100;
	  getContentPane().add(panel);
	  

	  //creates and adds a quit button 	  
	  JButton quitButton = new JButton("quitriemo");
	  quitButton.setBounds(0,0, 100, 50);
	  quitButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent event) {
         System.exit(0);
        }
	  }); 
	  
	  panel.add(quitButton);
	  
	  
	}
	
  public static void main(String[] args){
    SwingEx window =new SwingEx();
    window.setVisible(true);
  }
}
