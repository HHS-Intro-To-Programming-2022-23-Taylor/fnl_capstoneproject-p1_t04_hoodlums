/*Authors: Bharath Jayadev, Ojas Khandelwal 
 *Date: 5/16
 *Rev:01
 *Notes:
 */

import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;
import java.awt.Font.*;

public class GameDisplay extends JPanel implements ActionListener, MouseListener { //class extends jPanel and implements action listener and mouselistener
	
	//fields
	private double  clickedX, clickedY; 
	
	private int time; 
	
	private Image bgpic = (new ImageIcon("bgpic.png")).getImage();//background pic

	private Resources g1, b1, g2, b2, g3, b3, g4, g5 ; //moving objects
	
	Color color; 
	
	private JTextField display;
	
	//constructor
	public GameDisplay () {
		
		Timer clock = new Timer(10, this); //clock begins, game begins
		clock.start();
		
		
		clickedX = 0;
		clickedY = 0;
		
		time = 0;
		
		//gResource = new GoodResource();

		
		//all resource objects created
		b1 = new BadResource(25, 700);
		g1 = new GoodResource(25, 700);
		b2 = new BadResource(25, 700);
		g2 = new GoodResource(25, 700);
		b3 = new BadResource(25, 700);
		g3 = new GoodResource(25, 700);
		g4 = new GoodResource(25,700);
		g5 = new GoodResource(25, 700);
		
		//all have their properties shuffled
		b1.shufflePic();
		b2.shufflePic();
		b3.shufflePic();
		g1.shufflePic();
		g2.shufflePic();
		g3.shufflePic();
		g4.shufflePic();
		g5.shufflePic();
		
		addMouseListener(this); //adding mouse listener
		
		color = (Color.yellow);
		
		
		display = new JTextField("Score:",20); //adding box for score
	    display.setFont(new Font("Monospaced Bold", Font.BOLD, 20));
	    display.setBackground(Color.WHITE);
	    display.setEditable(false);
	    display.setHorizontalAlignment(JTextField.CENTER);
		add(display);
	    
		
	}
	
	//paint component
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		g.drawImage(bgpic, 0, 0, null);//drawing baground pic
			
		Graphics2D g2 = (Graphics2D)g; //created 2d graphics
		
		drawOnClick(g2, b1); //checks for ever resource, draws explosion gif or cross if object is clicked or not
		drawOnClick(g2, b2);
		drawOnClick(g2, b3);
		drawOnClick(g2, g1);
		drawOnClick(g2, this.g2);
		drawOnClick(g2, g3);
		drawOnClick(g2, g4);
		drawOnClick(g2, g5);
		
		//draws every single resource at its own coordinates
		g2.drawImage(b1.getPic(), (int)b1.giveX(),(int)b1.giveY()-5, this);
		g2.drawImage(b2.getPic(), (int)b2.giveX(),(int)b2.giveY()-5, this);
		g2.drawImage(b3.getPic(), (int)b3.giveX(),(int)b3.giveY()-5, this);
		g2.drawImage(g1.getPic(), (int)g1.giveX(),(int)g1.giveY()-5, this);
		g2.drawImage(this.g2.getPic(), (int)this.g2.giveX(),(int)this.g2.giveY()-5, this);
		g2.drawImage(g3.getPic(), (int)g3.giveX(),(int)g3.giveY()-5, this);
		g2.drawImage(g4.getPic(), (int)g4.giveX(),(int)g4.giveY()-5, this);
		g2.drawImage(g5.getPic(), (int)g5.giveX(),(int)g5.giveY()-5, this);
	    
		display.setText("SCORE: " + (GoodResource.points - BadResource.points));
	}
	
	//helper method, checks if an object has been clicked, if has , draws its clicked image
	private void drawOnClick(Graphics2D g, Resources x) {
		
		if (time > x.getClickedTime()+25)
			x.setClickState(false);
		
		if (x.returnClickState() == true)
			g.drawImage(x.clickedDrawing(), x.getClickedX()-50,x.getClickedY()-50, this);
		
	}
	
	//everytime an event happens, action performed runs
	public void actionPerformed(ActionEvent e) {

		//every single moving object, runs delayed for every object at their own coordinates. only changes the coordinates/fields of obj
		if (time>10){

			b1.changeX(b1.giveX()+1);
			b1.changeY(b1.giveSlope()*((b1.giveX()+b1.giveX()/5-b1.giveVertex())*(b1.giveX()+b1.giveX()/5-b1.giveVertex()))+100);   

		}
		
		if (time>100){

			g1.changeX(g1.giveX()+1);
			g1.changeY(g1.giveSlope()*((g1.giveX()+g1.giveX()/5-g1.giveVertex())*(g1.giveX()+g1.giveX()/5-g1.giveVertex()))+100);   
		}
		
		if (time>200){

			g2.changeX(g2.giveX()+1);
			g2.changeY(g2.giveSlope()*((g2.giveX()+g2.giveX()/5-g2.giveVertex())*(g2.giveX()+g2.giveX()/5-g2.giveVertex()))+100);   
		}
		
		if (time>400){

			b2.changeX(b2.giveX()+1);
			b2.changeY(b2.giveSlope()*((b2.giveX()+b2.giveX()/5-b2.giveVertex())*(b2.giveX()+b2.giveX()/5-b2.giveVertex()))+100);   
		}
		
		if (time>700){

			g3.changeX(g3.giveX()+1);
			g3.changeY(g3.giveSlope()*((g3.giveX()+g3.giveX()/5-g3.giveVertex())*(g3.giveX()+g3.giveX()/5-g3.giveVertex()))+100);   
		}

		if (time>1000){

			g4.changeX(g4.giveX()+1);
			g4.changeY(g4.giveSlope()*((g4.giveX()+g4.giveX()/5-g4.giveVertex())*(g4.giveX()+g4.giveX()/5-g4.giveVertex()))+100);   
		}
		
		if (time>1200){

			b3.changeX(b3.giveX()+1);
			b3.changeY(b3.giveSlope()*((b3.giveX()+b3.giveX()/5-b3.giveVertex())*(b3.giveX()+b3.giveX()/5-b3.giveVertex()))+100);   
		}

		if (time>1500){

			g5.changeX(g5.giveX()+1);
			g5.changeY(g5.giveSlope()*((g5.giveX()+g5.giveX()/5-g5.giveVertex())*(g5.giveX()+g5.giveX()/5-g5.giveVertex()))+100);   
		}

		
		time++; //increment time 
		
		repaint(); //repaint

		
	}

//main method, create window	
	public static void main(String[] args) {
		JFrame w = new JFrame("Resource Ninja");
		w.setBounds(250,100,900,650);
		
		Container c = w.getContentPane();
		c.add(new GameDisplay());
		
		w.setVisible(true);
		w.setResizable(false);
		
	}

	//mouseListener, when mouse clicked
	@Override
	public void mouseClicked(MouseEvent e) {
		
		clickedX = e.getX(); //gets coordinates of where mouse clicked
		clickedY = e.getY();
		
		checkClick(b1); //check if any of the objects were clicked, using polymorphism
		checkClick(b2);
		checkClick(b3);
		checkClick(g1 );
		checkClick(g2);
		checkClick(g3);
		checkClick(g4);
		checkClick(g5);
	}

	
	private void checkClick(Resources x) {		

		if (	(clickedX >= x.giveX())&&(clickedX <= x.giveX()+100)&&(clickedY >= x.giveY())&&(clickedY <= x.giveY()+100)	)	{
	
			x.resetObj();
			
			x.setClickState(true);
			x.setClickedTime(time);
			x.setClickedX((int)clickedX);
			x.setClickedY((int)clickedY);
			
			x.changePoints();

		}
		
		
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
