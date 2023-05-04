import java.awt.FlowLayout;
import java.awt.Image;
import javax.swing.JButton; 
import javax.swing.JFrame; 

public class GoodResource extends JFrame implements Resources{
	
	private int points;
	
	private double xCoord, yCoord;
	
	private Image solar, wind, hydro;
	
	JButton test;

	
	
	
	public GoodResource() {
		
//		test = new JButton("touch me");
//		
//		setLayout (new FlowLayout());
//		add(test);
//		
//		setVisible(true);
//		setSize(100,100);
//		setLocation(100,100);
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
//		
	
	}
	
	@Override
	public int returnPoints() { 
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int createPath() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Image returnPic() {
		// TODO Auto-generated method stub
		return null;
	}

}
