import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

import javafx.scene.shape.Circle;

/**
 * BouncingRectangle - A class that represents a rectangle that can bounce
 * 
 */
public class BouncingCircles extends BouncingFigure {
	
	//Sides of object
	private int radius;

	/**
	 * BouncingRectangle - Constructor method that creates the object
	 * @param xLeft - x part of coordinate for the object
	 * @param yTop - y part of coordinate for the object
	 * @param height - height of object
	 * @param width - width of object
	 * @param trajectory - angle of trajectory
	 * @param speed - speed of movement
	 */
	BouncingCircles(int xLeft, int yTop, int radius, double trajectory, int speed) {
		//Understand this constructor to answer Q2
		setXLeft(xLeft);
		setYTop(yTop);
		setTrajectory(trajectory);
		setSpeed(speed);
		this.radius = radius;
		setHeight(radius);
		setWidth(radius);
	}

	/**
	 * draw - Creates the graphics of the rectangle it's self
	 * @param g - the graphic object to create the rectangular object
	 */
	public void draw(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		Ellipse2D.Double circle = new Ellipse2D.Double(getXLeft(), getYTop(), radius, radius);
		g2.fill(circle);
		g2.setColor(Color.GREEN);
		g2.fill(circle);
		g2.draw(circle);
	}

	/**
	 * rightBorderCollision - verifies if the rectangle object is touching the right frame border
	 * @param screenLimit - The width of the window
	 */
	public boolean rightBorderCollision(int screenLimit){
		if(getXLeft()+(this.radius*2) > screenLimit)
			return true;
		return false;
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
		if(getYTop() < 0)
			return true;
		return false;
	}

	/**
	 * rightBorderCollision - verifies if the rectangle object is touching the bottom frame border
	 * @param screenLimit - The height of the window 
	 */
	public boolean lowerBorderCollision(int screenLimit){
		if(getYTop()+(this.radius*2) > screenLimit)
			return true;
		return false;
	}
}
