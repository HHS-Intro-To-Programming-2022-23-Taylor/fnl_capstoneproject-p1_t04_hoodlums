// This class does nothing
// it is created to establish the GitHub
// repository.
import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;


public class GameDisplay extends JPanel implements ActionListener, MouseListener {
	
	
	private double xCoord, yCoord, clickedX, clickedY; 
	private int height = 650, width = 900;
	
	private Resources gResource, bResource ; 
	
	private boolean clicked;
	
	Color color ; 
	
	
	public GameDisplay () {
		
		Timer clock = new Timer(10, this);
		clock.start();
		
		xCoord = 100;
		yCoord = 625;
		clickedX = 0;
		clickedY = 0;
		
		gResource = new GoodResource();
		bResource = new BadResource();
		
		addMouseListener(this);
		
		color = (Color.yellow);
		
	}
	
	public void paintComponent(Graphics g) {
		
		setBackground(color);
		
		
		super.paintComponent(g);
		
		g.setColor(Color.black);
		g.fillRect((int)xCoord, (int)yCoord, 100, 100);
		
	}
	
	
	public void actionPerformed(ActionEvent e) {
		
		xCoord++;
		yCoord  = 0.00428571428*((xCoord-450)*(xCoord-450))+100;
		
	//	System.out.println(xCoord + " "+ yCoord);
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

	@Override
	public void mouseClicked(MouseEvent e) {
		clickedX = e.getX();
		clickedY = e.getY();
		
		checkClick(gResource);
	}

	private boolean checkClick(Resources x) {
		
		if (	(clickedX >= x.giveX())&&(clickedX <= x.giveX()+100)&&(clickedY >= x.giveY())&&(clickedY <= x.giveY()+100)	)		
			color = new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
		else 
			return false;
		
		return true;
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
