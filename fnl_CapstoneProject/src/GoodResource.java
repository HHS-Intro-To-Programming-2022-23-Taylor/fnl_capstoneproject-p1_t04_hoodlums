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
	
	private int vertex, timeClicked, clickedX, clickedY;

	private Image solar, wind, hydro, picture, check;
	
	private boolean clickState;
	
	static int points;
	
	public GoodResource(int x, int y) {

		xCoord = x; 
		yCoord = y; 
		
		clickState = false;
		
		solar = (new ImageIcon("solar.png")).getImage();
		wind = (new ImageIcon("wind.png")).getImage();
		hydro = (new ImageIcon("hydro.png")).getImage();
		
		check = (new ImageIcon("explosion.gif")).getImage();
		
		this.makeSlope();
		this.makeVertex();
		

		timeClicked = 0;
		
		
		

		points = 0; 

	}

	@Override

	public void changePoints() { 
		
		points+=10;
	}
	
	
	@Override

	public double giveX() {
		
		if ((yCoord > 675)&&(xCoord>this.giveVertex())) {
			this.resetObj();
			points-=10;
		}
		
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
		
		vertex = (int)((Math.random()*500)+200);
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

	@Override
	public void resetObj() {
		
		xCoord = 100;
		this.shufflePic();
		this.makeSlope();
		this.makeVertex();
		
	}

	@Override
	public void setClickedTime(int x) {
		
		timeClicked = x;
	}

	@Override
	public int getClickedTime() {

		return timeClicked;
	}

	@Override
	public Image clickedDrawing() {
		
		return check;
	}

	@Override
	public void setClickedX(int x) {
		
		clickedX = x;
	}

	@Override
	public void setClickedY(int y) {
		
		clickedY = y;
	}

	@Override
	public int getClickedX() {
		
		return clickedX;
	}

	@Override
	public int getClickedY() {
	
		return clickedY;
	}
	

}


