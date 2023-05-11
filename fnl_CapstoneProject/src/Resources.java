import java.awt.*;

public interface Resources {
	

	public void changePoints();
	public double giveSlope();
	public int giveVertex();
	public void makeSlope();
	public void makeVertex();






	public double returnPoints();
	public double createPath();


	public Image returnPic();

	public Image returnImage();


	public double giveX();
	public double giveY();
	public void changeX(double x);
	public void changeY(double y);
	public void setClickState(boolean x);
	public boolean returnClickState();
	

}
