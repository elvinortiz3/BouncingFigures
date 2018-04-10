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
			//If there is a collision 
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
    

	}
}
