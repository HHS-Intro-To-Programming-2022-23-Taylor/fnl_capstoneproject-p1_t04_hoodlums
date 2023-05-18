import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;
import java.awt.Font.*;
/*Authors: Bharath Jayadev, Ojas Khandelwal 
 *Date: 5/16
 *Rev:01
 *Notes:
 */

public class GameDisplay extends JPanel implements ActionListener, MouseListener {
	
	
	private double xCoord, yCoord, clickedX, clickedY; 
	private int height = 650, width = 900, time;
	

	private Resources g1, b1 ; 
	
	private boolean clicked;
	
	Color color; 
	
	private Image bR, gR;
	//oilDrum = b1;
	
	private JTextField display;
	
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
		
		
		display = new JTextField("Score:",20);
	    display.setFont(new Font("Monospaced Bold", Font.BOLD, 20));
	    display.setBackground(Color.GREEN);
	    display.setEditable(false);
	    display.setHorizontalAlignment(JTextField.CENTER);
		add(display);
	    
		
	}
	
	public void paintComponent(Graphics g) {
		

		setBackground(color);
		
		

		setBackground(Color.WHITE);

		super.paintComponent(g);
		
		
		
		g.setColor(Color.black);
		g.fillRect((int)xCoord, (int)yCoord, 100, 100);

		
		Graphics2D g2 = (Graphics2D)g;

	
		drawOnClick(g2, b1);
		drawOnClick(g2, g1);
		
		g2.drawImage(b1.getPic(), (int)b1.giveX(),(int)b1.giveY()-5, this);
		g2.drawImage(g1.getPic(), (int)g1.giveX(),(int)g1.giveY()-5, this);
		
		
		
		

		
		
//		g.setColor(Color.CYAN);
//		g.fillRect(10, 20, 20, 10);
//		g.setColor(Color.MAGENTA);

		//g.drawString("Hi there", 20, 10);
//		JLabel label = new JLabel ("Score:" + (GoodResource.points + BadResource.points));
//		label.setFont(new Font("Times", Font.BOLD, 12));
//		label.setForeground(Color.RED);
//		this.add(label);
//		
	    
		display.setText("SCORE: " + (GoodResource.points - BadResource.points));
	}
	
	private void drawOnClick(Graphics2D g, Resources x) {
		
		if (time > x.getClickedTime()+2000)
			x.setClickState(false);
		
		if (x.returnClickState() == true)
			g.drawImage(x.clickedDrawing(), x.getClickedX(),x.getClickedY(), this);
		
	}
	
	public void actionPerformed(ActionEvent e) {


		if (time>10){

			b1.changeX(b1.giveX()+1);
			b1.changeY(b1.giveSlope()*((b1.giveX()+b1.giveX()/5-b1.giveVertex())*(b1.giveX()+b1.giveX()/5-b1.giveVertex()))+100);   

		}



		}

		
		
		if (time>100){

			g1.changeX(g1.giveX()+1);
			g1.changeY(g1.giveSlope()*((g1.giveX()+g1.giveX()/5-g1.giveVertex())*(g1.giveX()+g1.giveX()/5-g1.giveVertex()))+100);   
		}
		
		
		time++;
		
		repaint();

		
	}

			
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
