package poolArea;

public class Cuboid extends Rectangle {

	private double  height ;

	/**
	 * @param width
	 * @param length
	 * @param height
	 */
	public Cuboid(double width, double length, double height) {
		super(width, length);
		if (height<0) this.height=0;
		else 
			this.height = height;
	}
	public double getVolume() {
		return getArea()*this.height;
	}
	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}
	
}
