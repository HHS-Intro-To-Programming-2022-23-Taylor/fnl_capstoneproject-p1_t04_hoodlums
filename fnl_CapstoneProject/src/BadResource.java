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


		
	
	//fields 
	private double xCoord, yCoord, slope; //properties of the objects movement and location
	
	private Image coal, oilDrum, gas, picture, cross; //different possible pictures
	
	private int vertex, timeClicked, clickedX, clickedY; //more properties for location and movement
	
	private boolean clickState; //clicked o rnot
	
	static int points; //holds points a kind of resource holds
	
	//constructor
	public BadResource(int x, int y) {
		
		
		xCoord = x;
		yCoord = y; 
		
		
		//images
		clickState = false;
		oilDrum = (new ImageIcon("oilDrum1.png")).getImage();
		coal = (new ImageIcon("coal1.png")).getImage();
		gas = (new ImageIcon("gas.png")).getImage();
		cross = (new ImageIcon("cross.png")).getImage();

		points = 0; 

		
		this.makeSlope();
		this.makeVertex();
		
		timeClicked= 0;
	}
	
	
	//increases points by 10 when clicked, will be subtracted in gamedisplay
	public void changePoints() { 
		
		points+=30;

		
	}


	@Override
	//gives the X coord for the resource
	public double giveX() {
		
		if (xCoord > (this.giveVertex()-100)*2) 
			this.resetObj();
		
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
		
		vertex = (int)((Math.random()*250)+350); 
	}


	@Override
	//mutator for xCoord
	public void changeX(double x) {
		
		xCoord = x;

	}

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
		
		return cross;
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
