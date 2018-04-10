import java.awt.Graphics;

import javax.swing.JComponent;

/**
 * A class that represents a figure that can bounce
 * Note: This class doesn't have a constructor and it has abstract methods
 */
public abstract class BouncingFigure {

	// Variables to contain some of the figure's properties
	private int height = 0;
	private int width = 0;
	private int xLeft = 0;
	private int yTop = 0;
	private int speed = 10;          // Speed in pixels per second
	private double trajectory = 0.0; // An trajectory angle in degrees 90 is vertical up, 0 is horizontal right

	// No constructors since will never create an object of this class

	// Getters
	public int getXLeft() {
		return this.xLeft;
	}

	public int getYTop() {
		return this.yTop;
	}
	public int getHeight() {
		return this.height;
	}

	public int getWidth() {
		return this.width;
	}

	public double getTrajectory() {
		return trajectory;
	}

	public int getSpeed() {
		return speed;
	}

	// Setters
	public void setXLeft(int xleft){
		this.xLeft=xleft;
	}

	public void setYTop(int ytop){
		this.yTop=ytop;
	}

	public void setTrajectory(double trajectory) {
		this.trajectory = trajectory;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void setHeight(int h) {
		this.height = h;
	}

	public void setWidth(int w) {
		this.width = w;
	}

	// Instance methods
	/**
	 * move - protected method to be called from paintComponent() in the subclass
	 */
	protected void move() { 
		moveAtAngle(getTrajectory(),getSpeed());
		// Change trajectory upon collision with border
	}

	/**
	 * moveAtAngle - updates the new position of the figure
	 * @param angle - angle in which the figure moves to
	 * @param pixelsPerSec - speed in which the figure moves
	 */
	public void moveAtAngle(double angle,int pixelsPerSec){

		// Divide speed by 10 because frame is repainted every 0.1 sec
		int magnitude = Math.max(pixelsPerSec / 10,1);

		//Q1:
		int xVector= 0;
		int yVector= 0; 

		//moving to the new coordinates by addition
		this.xLeft=0;
		this.yTop=0;


	}

	// Abstract methods to be implemented by subclasses (Do Not Modify!)
	public abstract void draw(Graphics g);
	public abstract boolean rightBorderCollision(int screenLimit);
	public abstract boolean leftBorderCollision();
	public abstract boolean upperBorderCollision();
	public abstract boolean lowerBorderCollision(int screenLimit);
}
