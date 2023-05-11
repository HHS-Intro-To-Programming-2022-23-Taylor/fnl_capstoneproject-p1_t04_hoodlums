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





	private Image solar, wind, hydro, picture;
	


	

		
	static int points;
	
	private double xCoord, yCoord, slope;
	
	private Image coal, oilDrum, gas;
	
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
	
	
	int max = 16;
	int min = 1; 
	int r = (int) ((Math.random() * (max - min)) + min);
	
	public Image returnPic() {
		if (r>10) {
			return coal;
		}
		else if (r>=6 ) {
			return gas;
		}
			
		else {
		return oilDrum;
		}
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
	public double createPath() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Image returnImage() {
		// TODO Auto-generated method stub
		return null;


	@Override
	public void changeX(double x) {
		
		xCoord = x;

	}


	@Override

	public double returnPoints() {
		// TODO Auto-generated method stub
		return 0;
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

	

}
