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
	
	//static int points;
	
	private double xCoord, yCoord, slope;
	
	private int vertex;
	
	
	
	public GoodResource() {

	}

	private int points;


	private Image solar, wind, hydro, picture;

//	private JButton test;



	public GoodResource(int x, int y, Image pic) {


		
		picture = pic; 
		xCoord = x; 
		yCoord = y; 
//				super.test = new JButton("touch me");
//				
//				//setLayout (new FlowLayout());
//			
//				
//				super.setVisible(true);
//				super.setLocation(200,200);
//				super.setSize(100,100);
//				super.setBackground(Color.BLUE);
//				super.setDefaultCloseOperation(EXIT_ON_CLOSE);
				
				
				

	}

	@Override

	public void changePoints() { 
		
		points+=10;
		
	}




	public double returnPoints() { 

		// TODO Auto-generated method stub
		return 0;

	}

	@Override





	public double giveX() {
		
		return xCoord;
	}

	@Override
	public double giveY() {

		// TODO Auto-generated method stub
		return yCoord;
	}
	
	@Override


	public int getY() {

		// TODO Auto-generated method stub
		return 0;
	}

	@Override

	

	public double createPath() {

		// TODO Auto-generated method stub
		return 0;
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


