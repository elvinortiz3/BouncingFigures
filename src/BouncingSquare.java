import java.awt.Color;

public class BouncingSquare extends BouncingRectangle{

	BouncingSquare(int xLeft, int yTop, int dimension, double trajectory, int speed) {
		super(xLeft, yTop, dimension, dimension, trajectory, speed);
		super.setColor(Color.BLUE);
		// TODO Auto-generated constructor stub
	}

}
