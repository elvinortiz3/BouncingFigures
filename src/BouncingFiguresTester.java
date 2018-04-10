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
		//Initialize the frame
		JFrame frame= new JFrame();
		frame.setTitle("Inheritance show");
		frame.setSize(600, 620);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Create a box to put all the figure objects in
		BouncingBox box = new BouncingBox();
		
		// Add all the components to the box
//		BouncingFigure figure1 = new BouncingRectangle(250, 250, 10, 10, 0, 100);
//		box.add(figure1);
		

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
