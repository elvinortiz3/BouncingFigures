import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

/**
 * BouncingRectangle - A class that represents a rectangle that can bounce
 * 
 */
public class BouncingRectangle {

	//Sides of object
	private int height;
	private int width;
	private Color color = Color.RED;

	/**
	 * BouncingRectangle - Constructor method that creates the object
	 * @param xLeft - x part of coordinate for the object
	 * @param yTop - y part of coordinate for the object
	 * @param height - height of object
	 * @param width - width of object
	 * @param trajectory - angle of trajectory
	 * @param speed - speed of movement
	 */
	BouncingRectangle(int xLeft, int yTop, int height, int width, double trajectory, int speed) {
		setXLeft(xLeft);
		setYTop(yTop);
		setTrajectory(trajectory);
		setSpeed(speed);
		this.height=height;
		this.width=width;
		setHeight(height);
		setWidth(width);
	}

	/**
	 * draw - Creates the graphics of the rectangle it's self
	 * @param g - the graphic object to create the rectangular object
	 */
	public void draw(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		Rectangle rectangle = new Rectangle(getXLeft(),getYTop(), this.height, this.width);
		g2.setColor(color);
		g2.fill(rectangle);
		g2.draw(rectangle);
	}
	public void setColor(Color color) {
		this.color = color;
	}

	/**
	 * rightBorderCollision - verifies if the rectangle object is touching the right frame border
	 * @param screenLimit - The width of the window
	 */
	public boolean rightBorderCollision(int screenLimit){
		return true; //Dummy Return
	}

	/**
	 * rightBorderCollision - verifies if the rectangle object is touching the left frame border
	 */
	public boolean leftBorderCollision(){
		if(getXLeft() < 0)
			return true;
		return false;
	}

	/**
	 * rightBorderCollision - verifies if the rectangle object is touching the top frame border
	 */
	public boolean upperBorderCollision(){
		return true; //Dummy Return
	}

	/**
	 * rightBorderCollision - verifies if the rectangle object is touching the bottom frame border
	 * @param screenLimit - The height of the window 
	 */
	public boolean lowerBorderCollision(int screenLimit){
		if(getYTop()+this.height > screenLimit)
			return true;
		return false;
	}
}
