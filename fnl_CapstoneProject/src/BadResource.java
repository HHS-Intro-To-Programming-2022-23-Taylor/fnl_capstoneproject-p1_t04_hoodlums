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

public class BadResource extends JPanel implements Resources{


		
	static int points;
	
	private double xCoord, yCoord, slope;
	
	private Image coal, oilDrum, gas, picture;
	
	private int vertex;
	
	private boolean clickState;
	
	public BadResource(int x, int y) {
		
		
		xCoord = x;
		yCoord = y; 
		
		clickState = false;
		
		oilDrum = (new ImageIcon("oilDrum1.png")).getImage();

		coal = (new ImageIcon("coal1.png")).getImage();
		gas = (new ImageIcon("gas.png")).getImage();

		

	}
	
	
	
	public void changePoints() { 
		
		points-=10;

		
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

	

}
