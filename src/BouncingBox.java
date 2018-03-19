import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JComponent;

/**
 * A class that act as a container for all the added figures
 * Note: This is a dynamic class without a constructor
 */
public class BouncingBox extends JComponent {

	//ArrayList containing all the added figures
	private ArrayList<BouncingFigure> figures = new ArrayList<BouncingFigure>();

	/**
	 * add - A method that adds a new figure to the list
	 * @param f - the figure to be added
	 */
	public void add(BouncingFigure f) {
		figures.add(f);
	}
	
	public boolean onCollision(BouncingFigure f) {
		int fX = f.getXLeft();
		int fY = f.getYTop();
		int fIndex = figures.indexOf(f);
		int indexC = 0;
		for (BouncingFigure f2 : figures) {

			if (indexC != fIndex) {
				/*//For left-right Collision
				if ((fX == f2.getXLeft()) && ((f2.getYTop() > fY) && (f2.getYTop() < (fY+f.getHeight()))) ){
					return true;
				}
				//For right-left Collision
				if ((fX+f.getWidth() == f2.getXLeft()) && ((f2.getYTop() > fY) && (f2.getYTop() < (fY+f.getHeight()))) ){
					return true;
				}
				//For Top-Bottom Collision
				if ((fY == f2.getYTop()) && ((f2.getXLeft() > fX) && (f2.getXLeft() < (fX+f.getWidth()))) ){
					return true;
				}
				//For Bottom-Top Collision
				if ((fY+f.getHeight() == f2.getYTop()) && ((f2.getXLeft() > fX) && (f2.getXLeft() < (fX+f.getWidth()))) ){
					return true;
				}*/
				if(((f2.getXLeft() >= fX) && f2.getXLeft() <= fX + f.getWidth()) && ((f2.getYTop() >= fY) && (f2.getYTop() <= fY+f.getHeight()))) {
					return true;
				}
				
			} 
			indexC++;
		}
		return false;
	}

	/**
	 * paintComponent - a method to initialize the drawing of each figure added
	 * @param g - the graphics to draw 
	 */
	public void paintComponent(Graphics g) {
		 for (BouncingFigure f : figures) {
	            f.draw(g); f.move();
	            if(f.rightBorderCollision(this.getWidth())){
	                f.setTrajectory(-1*f.getXLeft());
	            }
	            if(f.leftBorderCollision()==true){
	                f.setTrajectory(-1*f.getXLeft());
	            }
	            if(f.upperBorderCollision()==true){
	                f.setTrajectory(f.getTrajectory()*-1);
	            }
	            if(f.lowerBorderCollision(this.getHeight())==true){
	                f.setTrajectory(f.getTrajectory()*-1);
	            }
	        
           
        }
    
			
		
		/*for (BouncingFigure f : figures) {
			f.draw(g);
			
			if(onCollision(f)) {
				f.setTrajectory(-f.getTrajectory());
			}
			
			if (f.rightBorderCollision(600-1)) {
				double cAngle = f.getTrajectory();
				double adjustedCAngle = cAngle % 360;
				if (adjustedCAngle >= 90) {
					double newAngle = adjustedCAngle + (90 - adjustedCAngle)*2;
					f.setTrajectory(newAngle % 360);
				} else {
					double newAngle = adjustedCAngle - (adjustedCAngle - 270)*2;
					f.setTrajectory(newAngle % 360);
				}
				
			}else if (f.leftBorderCollision()) {
				double cAngle = f.getTrajectory();
				double adjustedCAngle = cAngle % 360;
				if (adjustedCAngle >= 270) {
					double newAngle = adjustedCAngle + (270 - adjustedCAngle)*2;
					f.setTrajectory(newAngle % 360);
				} else {
					double newAngle = adjustedCAngle - (adjustedCAngle - 90)*2;
					f.setTrajectory(newAngle);
				}
				
			}else if (f.lowerBorderCollision(620)) {
				double cAngle = f.getTrajectory();
				double adjustedCAngle = cAngle % 360;
				if (adjustedCAngle >= 360) {
					double newAngle = adjustedCAngle + (360 - adjustedCAngle)*2;
					f.setTrajectory(newAngle % 360);
				} else {
					double newAngle = adjustedCAngle - (adjustedCAngle - 180)*2;
					f.setTrajectory(newAngle % 360);
				}
				
			}else if (f.upperBorderCollision()) {
				double cAngle = f.getTrajectory();
				double adjustedCAngle = cAngle % 360;
				if (adjustedCAngle >= 180) {
					double newAngle = adjustedCAngle + (180 - adjustedCAngle)*2;
					f.setTrajectory(newAngle % 360);
				} else {
					double newAngle = adjustedCAngle - (adjustedCAngle - 0)*2;
					f.setTrajectory(newAngle % 360);
				}
			}
			
			
			f.move();
		}*/
	}
}
