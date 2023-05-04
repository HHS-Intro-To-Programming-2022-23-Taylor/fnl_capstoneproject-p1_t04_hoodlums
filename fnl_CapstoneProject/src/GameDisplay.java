// This class does nothing
// it is created to establish the GitHub
// repository.
import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;


public class GameDisplay extends JPanel implements ActionListener {
	
	private int time;
	private double xCoord, yCoord; 
	private int height = 650, width = 900;
	private JButton movingObject; 
	
	private Resources gResource, bResource ; 
	
	
	public GameDisplay () {
		time = 0;
		Timer clock = new Timer(100, this);
		clock.start();
		xCoord = 100;
		yCoord = 625;
		
//		movingObject = new JButton("Click Me");
//		movingObject.setBackground(Color.GREEN);
//		c.add(movingObject);
		
		movingObject = new JButton("Click Me");
		movingObject.setBackground(Color.GREEN);
		movingObject.setSize(100, 100);
		movingObject.setLocation(100, 100);
		
		
		gResource = new GoodResource();
		bResource = new BadResource();
			


		
		gResource = new GoodResource();
		bResource = new BadResource();
		

	}
	
	public void paintComponent(Graphics g) {
		
		setBackground(Color.WHITE);
		
		
		super.paintComponent(g);
		
//		JButton button = new JButton ("Click Me");
//		button.setSize(100,100);
		//button.add(button);
		g.setColor(Color.ORANGE);
		g.fillOval((int)xCoord, (int)yCoord, 50, 50);
		add(movingObject);
		
	}
	
	
	public void actionPerformed(ActionEvent e) {
		time++;
		xCoord++;
		yCoord  = 0.004*((xCoord-450)*(xCoord-450))+100;
		//0.00428571428
		//System.out.println(xCoord + " "+ yCoord);
		
		repaint();
	}
	
	
	public static void main(String[] args) {
		JFrame w = new JFrame("Trial");
		w.setBounds(250,100,900,650);
		
		Container c = w.getContentPane();
		c.add(new GameDisplay());
		
		w.setVisible(true);
		w.setResizable(false);
		

		
	}

}
