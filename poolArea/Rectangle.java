package poolArea;

public class Rectangle {
	
	private double width;
	private double length;
	
	

	/**
	 * @param width
	 * @param length
	 */
	public Rectangle(double width, double length) {
		super();
		if (width<0) this.width=0;
		else this.width = width;
		if (length<0) this.length=0;
		else this.length = length;
	}

	/**
	 * @return the width
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * @return the length
	 */
	public double getLength() {
		return length;
	}

public double getArea  () {
	return width*length;
}

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(5, 10);
		System.out.println("rectangle.width= " + rectangle.getWidth());
		System.out.println("rectangle.length= " + rectangle.getLength());
		System.out.println("rectangle.area= " + rectangle.getArea());
		Cuboid cuboid = new Cuboid(5,10,5);
		System.out.println("cuboid.width= " + cuboid.getWidth());
		System.out.println("cuboid.length= " + cuboid.getLength());
		System.out.println("cuboid.area= " + cuboid.getArea());
		System.out.println("cuboid.height= " + cuboid.getHeight());
		System.out.println("cuboid.volume= " + cuboid.getVolume());

	}

}
