import java.awt.Graphics;
import java.awt.Image;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;
import java.awt.Image;
import java.awt.Graphics;

public class BadResource extends JPanel implements Resources{
		
	static int points;
	
	private double xCoord, yCoord, slope;
	
	private Image coal, oilDrum, gas;
	
	private int vertex;
	
	
	public BadResource(int x, int y) {
		// TODO Auto-generated constructor stub
		
		xCoord = x;
		yCoord = y; 
		oilDrum = (new ImageIcon("oilDrum1.png")).getImage();

	}
	
	
	public Image returnPic() {
		
		return oilDrum; 
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

	
}
