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
	
	private Resources gResource, bResource ; 
	
	
	public GameDisplay () {
		time = 0;
		Timer clock = new Timer(100, this);
		clock.start();
		xCoord = 100;
		yCoord = 625;
		
		gResource = new GoodResource();
		bResource = new BadResource();
			
	}
	
	public void paintComponent(Graphics g) {
		
		setBackground(Color.WHITE);
		
		
		super.paintComponent(g);
		
		g.setColor(Color.ORANGE);
		g.fillOval((int)xCoord, (int)yCoord, 50, 50);
		
	}
	
	
	public void actionPerformed(ActionEvent e) {
		time++;
		xCoord++;
		yCoord  = 0.00428571428*((xCoord-450)*(xCoord-450))+100;
		
		System.out.println(xCoord + " "+ yCoord);
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
