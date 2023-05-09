import java.awt.Image;
import javax.swing.JButton; 
import javax.swing.JFrame; 

public class BadResource implements Resources{
	
	static int points;
	
	private double xCoord, yCoord, slope;
	
	private Image coal, oil, gas;
	
	private int vertex;
	
	public BadResource() {
		
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
