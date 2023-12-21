/*Authors: Bharath Jayadev, Ojas Khandelwal 
 *Date: 5/24
 *Rev:64
 *Notes:
 */

import java.awt.Graphics;
import java.awt.Image;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;

public class GoodResource extends JFrame implements Resources{
	

	//fields 
	
	private double xCoord, yCoord, slope;
	
	private int vertex, timeClicked, clickedX, clickedY;

	private Image solar, wind, hydro, wood, picture, check;
	
	private boolean clickState;
	
	static int points;
	
	//constructor 
	public GoodResource(int x, int y) {

		xCoord = x; 
		yCoord = y; 
		
		clickState = false;
		
		
		//images
		solar = (new ImageIcon("solar.png")).getImage();
		wind = (new ImageIcon("wind.png")).getImage();
		hydro = (new ImageIcon("hydro.png")).getImage();
		wood = (new ImageIcon("wood.png")).getImage();
		
		check = (new ImageIcon("explosionNOBG.gif")).getImage();
		
		this.makeSlope();
		this.makeVertex();
		
		timeClicked = 0;

		points = 0; 

	}

	@Override
	//increases points by 10 when clicked
	public void changePoints() { 
		
		points+=10;
	}
	
	
	@Override
	//gives the X coord for the resource
	public double giveX() {
		
		if ((yCoord > 675)&&(xCoord>this.giveVertex())) {
			this.resetObj();
			points-=10;
		}
		
		return xCoord;
	}

	@Override
	//gives the Y coord for the resource
	public double giveY() {
		
		return yCoord;
	}
	
	
	@Override
	//gives a slope for the parabolic arc
	public double giveSlope() {
		
		return slope;
	}

	@Override
	//gives a random vertex for the parabolic arc
	public int giveVertex() {
		
		return vertex;
	}

	@Override
	//Makes a random slope 
	public void makeSlope() {
		
		slope = ((Math.random()*0.011)+0.004);
	}

	@Override
	//Makes a random slope 
	public void makeVertex() {
		
		vertex = (int)((Math.random()*500)+200);
	}

	//mutator for xCoord
	public void changeX(double x) {
		
		xCoord = x;
	}

	@Override
	//mutator for yCoord
	public void changeY(double y) {
		
		yCoord = y;
	}

	@Override
	//Sets click state to true or false
	public void setClickState(boolean x) {
		
		clickState = x;
	}

	@Override
	//returns clickstate
	public boolean returnClickState() {
		
		return clickState;
	}

	@Override
	//returns random pictures for the resources
	public void shufflePic() {
		int r = (int) ((Math.random() * (20))+1);
	
		if (r>15) {
			picture = solar;
		}
		else if (r>10 ) {
			picture = wind;
		}
		else if (r>5)
			picture = wood;
		else 
			picture = hydro;
		
	}

	@Override
	//accessor for picture
	public Image getPic() {
		
		return picture;
	}

	@Override
	//when resource is clicked, resets it
	public void resetObj() {
		
		xCoord = 100;
		this.shufflePic();
		this.makeSlope();
		this.makeVertex();
		
	}

	@Override
	//determines time when resource is clicked
	public void setClickedTime(int x) {
		
		timeClicked = x;
	}

	@Override
	
	//accessor for timeClicked
	public int getClickedTime() {

		return timeClicked;
	}

	@Override
	
	//returns image after clicking resource
	public Image clickedDrawing() {
		
		return check;
	}

	@Override
	//returns coordinates when clicked
	public void setClickedX(int x) {
		
		clickedX = x;
	}

	@Override
	//returns coordinates when clicked
	public void setClickedY(int y) {
		
		clickedY = y;
	}

	@Override
	//accessor for clickedX
	public int getClickedX() {
		
		return clickedX;
	}

	@Override
	//accessor for clickY
	public int getClickedY() {
	
		return clickedY;
	}
	

}


