 /** JFrame is called which is similar to
 * Drawing class. In order to import a window on the screen
 * 
 * Since JFrame is a predefined class, the keyword extends is used
 * 
 * 
 * Width and height placement of Yin and Yang is centered
 * because it's divided by 2. 
 * 
 * The location of the white and black circles are almost identical
 * because they are in the same location width wise, just not height wise 
 * */
	import java.awt.Color; 
	import java.awt.Graphics;
	 
	import javax.swing.JFrame;
	 
	public class artContest extends JFrame {
		
		
	 public artContest(){
		 this.setSize(450,500);//Sets size of frame by pixels 
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Closes program when user clicks out 
	 
	 }
	 public void paint(Graphics g){ //Calling graphics g to draw on the panel (JFrame)
		 
		 int xCenter = getWidth() / 2;//Width placement of Yin and Yang
		 int yCenter = getHeight()/ 2;//Width placement of Yin and Yang
		 int radius = (int)(Math.min(getWidth(), getHeight()) * 0.4);//Radius size of Yin and Yang as a whole 
		 int x = xCenter - radius;
		 int y = yCenter - radius;
	
	 //Left half of Yang (white circle)	 
	 g.setColor(Color.white);
	 g.fillOval(x, y, 2 * radius, 2 * radius);
	 
	 //Black outline of the whole circle
	 g.setColor(Color.black);
	 g.drawOval(x, y, 2 * radius, 2 * radius);
	 
	 //Right side of Yin (black side)
	 g.setColor(Color.black);
	 g.fillArc(x, y, 2 * radius, 2 * radius, 270, 180);//Yang's curve 
	 
	 //White circle, surrounding black circle on top
	 g.setColor(Color.white);
	 g.fillOval(x + (radius / 2), y, radius, radius);//Creates an oval and sets the colour to white 
	 
	//Creates an oval and sets the colour to black 
	 g.setColor(Color.black);
	 g.fillOval(x + (radius / 2), y + radius, radius, radius);
	 
	 //Location of the white circle on top 
	 g.setColor(Color.black);
	 g.fillOval(x + radius - (radius / 4), y + radius / 4, radius / 2, radius / 2);
	
	 //Location of the black circle directly under the white circle 
	 g.setColor(Color.white); 
	 g.fillOval(x + radius - (radius / 4), y + radius + radius / 4, radius / 2, radius / 2);
	
		
	 }
	 
	 // Defining main method in artContest class 
	 public static void main(String args[]) { 
		 
	 //Assigns YinYang to an object, and to be visible when true 
	 artContest objYinYang = new artContest(); 
	 objYinYang.setVisible(true);
	 }
	} 