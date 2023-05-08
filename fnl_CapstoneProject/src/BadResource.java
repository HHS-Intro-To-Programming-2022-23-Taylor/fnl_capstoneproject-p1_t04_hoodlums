import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JButton; 
import javax.swing.JFrame; 

public class BadResource implements Resources{
	private int points;

	private double xCoord, yCoord;

	private Image solar, wind, hydro, picturep;
	

	
	
	
	public BadResource(int x, int y, Image pic) {
		// TODO Auto-generated constructor stub
		
		picture = pic;
		xCoord = x;
		yCoord = y; 
	}
	




	

	
	public double returnPoints() {

		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public double giveX() {

		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double giveY() {
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

	public void draw(Graphics g) {
	
	}
}
