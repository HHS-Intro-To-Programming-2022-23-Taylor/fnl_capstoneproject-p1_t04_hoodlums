// This class does nothing
// it is created to establish the GitHub
// repository.
import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;


public class GameDisplay extends JPanel implements ActionListener, MouseListener {
	
	
	private double xCoord, yCoord, clickedX, clickedY; 
	private int height = 650, width = 900, time;
	

	private Resources g1, b1 ; 
	
	private boolean clicked;
	
	Color color; 
	
	private Image bR, gR;
	//oilDrum = b1;
	
	
	public GameDisplay () {
		
		Timer clock = new Timer(10, this);
		clock.start();
		
		xCoord = 100;
		yCoord = 625;
		clickedX = 0;
		clickedY = 0;
		
		time = 0;
		
		//gResource = new GoodResource();

		
		
		b1 = new BadResource(25, 700);
		g1 = new GoodResource(25, 700);

		
		b1.shufflePic();
		g1.shufflePic();

		addMouseListener(this);
		
		color = (Color.yellow);
		

	}
	
	public void paintComponent(Graphics g) {
		

		setBackground(color);
		
		

		setBackground(Color.WHITE);

		super.paintComponent(g);
		
		
		
		g.setColor(Color.black);
		g.fillRect((int)xCoord, (int)yCoord, 100, 100);

		
		Graphics2D g2 = (Graphics2D)g;

	

		g2.drawImage(b1.getPic(), (int)b1.giveX(),(int)b1.giveY()-5, this);
		
		
		g2.drawImage(g1.getPic(), (int)g1.giveX(),(int)g1.giveY()-5, this);
		
	}
	
	
	public void actionPerformed(ActionEvent e) {

		if (time>10){

			b1.changeX(b1.giveX()+1);
			b1.changeY(b1.giveSlope()*((b1.giveX()+b1.giveX()/5-b1.giveVertex())*(b1.giveX()+b1.giveX()/5-b1.giveVertex()))+100);   
		}
		
		if (time>100){

			g1.changeX(g1.giveX()+1);
			g1.changeY(g1.giveSlope()*((g1.giveX()+g1.giveX()/5-g1.giveVertex())*(g1.giveX()+g1.giveX()/5-g1.giveVertex()))+100);   
		}
		
		
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
		
		checkClick(b1);
		checkClick(g1);
	}

	private void checkClick(Resources x) {
		
		if (	(clickedX >= x.giveX())&&(clickedX <= x.giveX()+100)&&(clickedY >= x.giveY())&&(clickedY <= x.giveY()+100)	)	{
			x.setClickState(true);
			x.resetObj();
		}
		else 
			x.setClickState(false);
		
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
