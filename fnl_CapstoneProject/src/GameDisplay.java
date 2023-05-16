// This class does nothing
// it is created to establish the GitHub
// repository.
import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;


public class GameDisplay extends JPanel implements ActionListener, MouseListener {
	
	
	private double xCoord, yCoord, clickedX, clickedY; 
	private int height = 650, width = 900, time;
	

	private Resources gResource, bResource ; 
	
	private boolean clicked;
	
	Color color; 
	
	private Image bR, gR;
	//oilDrum = bResource;
	
	
	public GameDisplay () {
		
		Timer clock = new Timer(10, this);
		clock.start();
		
		xCoord = 100;
		yCoord = 625;
		clickedX = 0;
		clickedY = 0;
		
		time = 0;
		
		//gResource = new GoodResource();

		 bResource = new BadResource((int)xCoord,(int)yCoord);
		
		bResource = new BadResource(25, 600);
		gResource = new GoodResource(25, 600);

		
		


		addMouseListener(this);
		
		color = (Color.yellow);
		

	}
	
	public void paintComponent(Graphics g) {
		

		setBackground(color);
		
		

		setBackground(Color.WHITE);

		super.paintComponent(g);
		
		g.setColor(Color.ORANGE);
		g.fillOval((int)xCoord, (int)yCoord, 50, 50);
		
		g.setColor(Color.black);
		g.fillRect((int)xCoord, (int)yCoord, 100, 100);

		
		Graphics2D g2 = (Graphics2D)g;

		g2.drawImage(bResource.getPic(), (int)xCoord,(int)yCoord, this);

		g2.drawImage(bResource.getPic(), (int)bResource.giveX(),(int)bResource.giveY()-5, this);

		
	}
	
	
	public void actionPerformed(ActionEvent e) {
		if (time>2){
			bResource.changeX(bResource.giveX()+1);
			bResource.changeY(0.004*((bResource.giveX()-450)*(bResource.giveX()-450))+100);   
		}
		//	System.out.println(xCoord + " "+ yCoord);
		
		time++;
		
		repaint();
	}
	
	
	public static void main(String[] args) {
		JFrame w = new JFrame("Resource Ninja");
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
		
		checkClick(bResource);
	}

	private void checkClick(Resources x) {
		
		if (	(clickedX >= x.giveX())&&(clickedX <= x.giveX()+100)&&(clickedY >= x.giveY())&&(clickedY <= x.giveY()+100)	)		
			x.setClickState(true);
		else 
			x.setClickState(false);
		
	}
	
	public void shuffle(Resources x) {
		
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
