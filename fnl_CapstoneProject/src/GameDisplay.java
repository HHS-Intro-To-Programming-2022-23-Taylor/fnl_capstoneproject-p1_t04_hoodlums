// This class does nothing
// it is created to establish the GitHub
// repository.
import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;


public class GameDisplay extends JPanel implements ActionListener, MouseListener {
	
	
	private double xCoord, yCoord, clickedX, clickedY; 
	private int height = 650, width = 900;
	private JButton movingObject; 
	private Image oilDrum;
	private BadResource oil;
//  private JButton test; 
	
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
		
		

//		movingObject = new JButton("Click Me");
//		movingObject.setBackground(Color.GREEN);
//		c.add(movingObject);
		
//		movingObject = new JButton("Click Me");
//		movingObject.setBackground(Color.GREEN);
//		movingObject.setSize(100, 100);
//		movingObject.setLocation(100, 100);
		
		oilDrum = (new ImageIcon("oilDrum.png")).getImage();
	//	oil = new BadResource(30,30,oilDrum);
		
//		gResource = new GoodResource();
//		bResource = new BadResource();
	
		


		addMouseListener(this);
		
		color = (Color.yellow);
		

	}
	
	public void paintComponent(Graphics g) {
		
		setBackground(Color.WHITE);
		
		
		

		super.paintComponent(g);
		oil.draw(g);
//		JButton button = new JButton ("Click Me");
//		button.setSize(100,100);
		//button.add(button);
		g.setColor(Color.ORANGE);
		g.fillOval((int)xCoord, (int)yCoord, 50, 50);
		
		g.setColor(color);
		g.fillRect((int)xCoord, (int)yCoord, 100, 100);

		
		//GoodResource g1 = new GoodResource(); 
		
		add(movingObject);
		//add(test);
	}
	
	
	public void actionPerformed(ActionEvent e) {
		
		xCoord++;
		yCoord  = 0.004*((xCoord-450)*(xCoord-450))+100;
		//0.00428571428
		//System.out.println(xCoord + " "+ yCoord);
		

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
		
		checkClick();
	}

	private boolean checkClick() {
		
		if (	(clickedX >= xCoord)&&(clickedX <= xCoord+100)&&(clickedY >= yCoord)&&(clickedY <= yCoord+100)	)		
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
