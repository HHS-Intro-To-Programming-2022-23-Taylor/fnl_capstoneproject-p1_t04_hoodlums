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
