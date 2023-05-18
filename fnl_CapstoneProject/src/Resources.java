import java.awt.*;
/*Authors: Ojas Khandelwal 
 *Date: 5/16
 *Rev:01
 *Notes:
 */
public interface Resources {
	

	public void changePoints();
	
	public double giveSlope();
	public int giveVertex();
	public void makeSlope();
	public void makeVertex();

	public void shufflePic();
	public Image getPic();
	
	public double giveX();
	public double giveY();
	public void changeX(double x);
	public void changeY(double y);
	
	public void setClickState(boolean x);
	public boolean returnClickState();
	public void setClickedTime(int x);
	public int getClickedTime();
	public Image clickedDrawing();
	
	public void setClickedX(int x);
	public void setClickedY(int y);
	public int getClickedX();
	public int getClickedY();
	
	public void resetObj();
	

}
