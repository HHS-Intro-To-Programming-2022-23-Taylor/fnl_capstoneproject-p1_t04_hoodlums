
import java.awt.Image;
import java.awt.FlowLayout;
import java.awt.Image;
import javax.swing.JButton; 
import javax.swing.JFrame; 
import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;

public class GoodResource extends JFrame implements Resources {

	private int points;

	private double xCoord, yCoord;

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



	public double returnPoints() { 

		// TODO Auto-generated method stub
		return 0;
	}

	@Override





	public double giveX() {
		
		return 0;
	}

	@Override
	public double giveY() {

		// TODO Auto-generated method stub
		return 0;
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

}


