import javax.swing.JFrame;

/**
 * A class that tests the BouncingFigures' class
 * 
 */

public class BouncingFiguresTester {

	/**
	 * main - Initial main method
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		//Understand this method to do Q3, Q6 and Q8
		//Initialize the frame
		JFrame frame= new JFrame();
		frame.setTitle("Mr Fresh Window");
		frame.setSize(600, 620);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Create a box to put all the figure objects in
		BouncingBox box = new BouncingBox();
		
		// Add all the components to the box
		BouncingFigure figure1 = new BouncingRectangle(250, 250, 10, 10, 0, 100);
		box.add(figure1);
		BouncingFigure figure2 = new BouncingRectangle(250, 250, 10, 10, 45.0, 100);
		box.add(figure2);
		BouncingFigure figure3 = new BouncingRectangle(250, 250, 10, 10, 90.0, 100);
		box.add(figure3);
		BouncingFigure figure4 = new BouncingRectangle(250, 250, 10, 10, 60.0, 100);
		box.add(figure4);
		BouncingFigure figure5 = new BouncingRectangle(250, 250, 10, 10, 30.0, 100);
		box.add(figure5);
		BouncingFigure figure6 = new BouncingRectangle(250, 250, 10, 10, 120.0, 100);
		box.add(figure6);
		BouncingFigure figure7 = new BouncingCircles(20, 50, 10, 30.0, 100);
		box.add(figure7);
		BouncingFigure figure8 = new BouncingCircles(50, 20, 10, 120.0, 100);
		box.add(figure8);
		BouncingFigure figure9 = new BouncingSquare(50, 500, 10, 90.0, 100);
		box.add(figure9);
		BouncingFigure figure10 = new BouncingSquare(50, 500, 10, 60.0, 100);
		box.add(figure10);
		// Add the box to the frame
		frame.add(box);
		
		// Make the frame visible
		frame.setVisible(true);
		
		// Continuously update the frame since some components will change position
		while(true) {
			try{
				Thread.sleep(100); // Wait for 0.1 seconds = 100 milliseconds
			}
			catch(InterruptedException e){}
			
			frame.repaint();
			
		} // end while

	}//end main

}//end class
