import java.awt.Graphics;
import java.awt.Image;
import java.awt.FlowLayout;
import java.awt.Image;
import javax.swing.JButton; 
import javax.swing.JFrame; 
import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;

public class GoodResource extends JFrame implements Resources{
	
	static int points;
	
	private double xCoord, yCoord, slope;
	
	private int vertex;

	private Image solar, wind, hydro, picture;


	public GoodResource(int x, int y) {

		xCoord = x; 
		yCoord = y; 
											
	}

	@Override

	public void changePoints() { 
		
		points+=10;
		
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
	public Image returnPic() {
		
		return null;
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
	public double returnPoints() {
		// TODO Auto-generated method stub
		return 0;
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
	}

}


