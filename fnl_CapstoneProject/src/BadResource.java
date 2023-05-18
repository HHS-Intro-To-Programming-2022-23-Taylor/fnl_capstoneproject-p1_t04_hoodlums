import java.awt.Graphics;
import java.awt.Image;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;
import java.awt.Image;
import java.awt.Graphics;
import java.util.Random;
/*Authors: Bharath Jayadev, Ojas Khandelwal 
 *Date: 5/16
 *Rev:01
 *Notes:
 */
public class BadResource extends JPanel implements Resources{


		
	
	
	private double xCoord, yCoord, slope;
	
	private Image coal, oilDrum, gas, picture, cross;
	
	private int vertex, timeClicked, clickedX, clickedY;
	
	private boolean clickState;
	
	static int points;
	
	public BadResource(int x, int y) {
		
		
		xCoord = x;
		yCoord = y; 
		
		clickState = false;
		
		oilDrum = (new ImageIcon("oilDrum1.png")).getImage();
		coal = (new ImageIcon("coal1.png")).getImage();
		gas = (new ImageIcon("gas.png")).getImage();
		
		cross = (new ImageIcon("cross.png")).getImage();
		
		
		this.makeSlope();
		this.makeVertex();
		
		timeClicked= 0;
	}
	
	
	
	public void changePoints() { 
		
		points-=10;

		
	}


	@Override
	public double giveX() {
		
		if (xCoord > (this.giveVertex()-100)*2) 
			this.resetObj();
		
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


	@Override
	public void changeX(double x) {
		
		xCoord = x;

	}


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
			picture = coal;
		}
		else if (r>=6 ) {
			picture = gas;
		}
			
		else {
		picture = oilDrum;
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
		
		return cross;
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
