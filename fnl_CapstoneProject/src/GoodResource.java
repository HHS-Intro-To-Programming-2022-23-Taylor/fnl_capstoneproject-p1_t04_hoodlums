import java.awt.Graphics;
import java.awt.Image;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;
/*Authors: Bharath Jayadev, Ojas Khandelwal 
 *Date: 5/16
 *Rev:01
 *Notes:
 */
public class GoodResource extends JFrame implements Resources{
	

	
	private double xCoord, yCoord, slope;
	
	private int vertex;

	private Image solar, wind, hydro, picture;
	
	private boolean clickState;
	
	static int points;
	
	public GoodResource(int x, int y) {

		xCoord = x; 
		yCoord = y; 
		
		clickState = false;
	}

	@Override

	public void changePoints() { 
		
		points+=10;
	
		solar = (new ImageIcon("solar.png")).getImage();
		wind = (new ImageIcon("wind.png")).getImage();
		hydro = (new ImageIcon("hydro.png")).getImage();
	}
	
	
	@Override

	public double giveX() {
		
		return xCoord;
	}

	@Override
	public double giveY() {
		
		
		
		return yCoord;
	}
	

	
	@Override
	public double giveSlope() {
		
		return slope;
	}

	@Override
	public int giveVertex() {
		
		return vertex;
	}

	@Override
	public void makeSlope() {
		
		slope = ((Math.random()*0.011)+0.004);
	}

	@Override
	public void makeVertex() {
		
		vertex = (int)((Math.random()*200)+350);
	}


	public void changeX(double x) {
		
		xCoord = x;
	}

	@Override
	public void changeY(double y) {
		
		yCoord = y;
	}

	@Override
	public void setClickState(boolean x) {
		
		clickState = x;
	}

	@Override
	public boolean returnClickState() {
		
		return clickState;
	}

	@Override
	public void shufflePic() {
		int r = (int) ((Math.random() * (15)) + 1);
	
		if (r>10) {
			picture = solar;
		}
		else if (r>=6 ) {
			picture = wind;
		}
			
		else {
		picture = hydro;
		}
	}

	@Override
	public Image getPic() {
		
		return picture;
	}
	

}


