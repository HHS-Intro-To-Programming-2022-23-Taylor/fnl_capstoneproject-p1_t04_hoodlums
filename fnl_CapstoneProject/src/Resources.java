import java.awt.*;
/*Authors: Ojas Khandelwal 
 *Date: 5/24
 *Rev:64
 *Notes:
 */

//interface, all methods used to use polymorphism in gamedisplay
public interface Resources {
	
	//changes point tally
	public void changePoints();
	
	//methods related to mutating/accessing parabolic path
	public double giveSlope();
	public int giveVertex();
	public void makeSlope();
	public void makeVertex();

	//methods related to mutating/accessing image being drawn
	public void shufflePic();
	public Image getPic();
	
	//methods related to mutating/accessing coordinates of moving object
	public double giveX();
	public double giveY();
	public void changeX(double x);
	public void changeY(double y);

	//methods related to mutating/accessing reaction to when object is clicked
	public void setClickState(boolean x);
	public boolean returnClickState();
	public void setClickedTime(int x);
	public int getClickedTime();
	public Image clickedDrawing();
	
	//methods related to mutating/accessing coordinates of the clicked location
	public void setClickedX(int x);
	public void setClickedY(int y);
	public int getClickedX();
	public int getClickedY();
	
	//shuffles properties of object when needed
	public void resetObj();
	

}
