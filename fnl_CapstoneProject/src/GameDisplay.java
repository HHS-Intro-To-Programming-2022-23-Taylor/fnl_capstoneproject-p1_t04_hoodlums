// This class does nothing
// it is created to establish the GitHub
// repository.
import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;


public class GameDisplay extends JPanel implements ActionListener {
	
	private int time;
	private int xCoord, yCoord; 
	
	
	
	public GameDisplay () {
		time = 0;
		Timer clock = new Timer(30, this);
		clock.start();
		xCoord = 250;
		yCoord = getHeight();
			
	}
	
	public void paintComponent(Graphics g) {
		
		setBackground(Color.WHITE);
		
		
		super.paintComponent(g);
		
		g.setColor(Color.ORANGE);
		g.fillOval(xCoord, yCoord, 50, 50);
		
	}
	
	
	public void actionPerformed(ActionEvent e) {
		time++;
		yCoord--;
		repaint();
	}
	
	
	public static void main(String[] args) {
		JFrame w = new JFrame("Trial");
		w.setBounds(500,250,500,500);
		
		Container c = w.getContentPane();
		c.add(new GameDisplay());
		w.setVisible(true);
		
		
	}

}
