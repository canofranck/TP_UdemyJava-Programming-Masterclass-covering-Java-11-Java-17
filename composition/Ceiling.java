package composition;

public class Ceiling {
private int  paintedColor;
private int height;
/**
 * @param paintedColor
 * @param height
 */
public Ceiling(int paintedColor, int height) {
	super();
	this.paintedColor = paintedColor;
	this.height = height;
}
/**
 * @return the paintedColor
 */
public int getPaintedColor() {
	return paintedColor;
}
/**
 * @return the height
 */
public int getHeight() {
	return height;
}


	
}
