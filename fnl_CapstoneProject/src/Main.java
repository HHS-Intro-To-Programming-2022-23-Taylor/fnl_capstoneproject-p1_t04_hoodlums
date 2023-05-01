// This class does nothing
// it is created to establish the GitHub
// repository.
import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;


public class Main extends JPanel implements ActionListener {
	
	private int time;
	private int xCoord, yCoord; 
	private int height, width;
	
	
	public Main () {
		time = 0;
		Timer clock = new Timer(30, this);
		clock.start();
		xCoord = 250;
		yCoord = 500;
			
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
		w.setBounds(250,100,900,650);
		
		Container c = w.getContentPane();
		c.add(new Main());
		w.setVisible(true);
		w.setResizable(false);
		
		
	}

}
