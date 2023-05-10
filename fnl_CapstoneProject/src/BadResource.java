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
	private int points;

	private double xCoord, yCoord;

	private Image solar, wind, hydro, picture;
	
	private Image oilDrum;
	


	
	static int points;
	
	private double xCoord, yCoord, slope;
	
	private Image coal, oil, gas;
	
	private int vertex;
	
	
	public BadResource(int x, int y, Image pic) {
		// TODO Auto-generated constructor stub
		
		picture = pic;
		xCoord = x;
		yCoord = y; 
		oilDrum = (new ImageIcon("oilDrum1.png")).getImage();

	}
	
	public BadResource () {
		
	}
//	public void draw(Graphics g) {
//		
//		g.drawImage(g, picture);
//		
//	}
	
	public Image returnImage() {
		
		return oilDrum; 
	}

	

	public void changePoints() {
		
		points-=10;

	public double returnPoints() {

		// TODO Auto-generated method stub
		return 0;

	}



	@Override
	public double giveX() {

		
		return xCoord;


		// TODO Auto-generated method stub
		return 0;

	}

	@Override
	public double giveY() {
		// TODO Auto-generated method stub
		return yCoord;
	}

	

	@Override
	public Image returnPic() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public double giveSlope() {
		// TODO Auto-generated method stub
		return slope;
	}



	@Override
	public int giveVertex() {
		// TODO Auto-generated method stub
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
