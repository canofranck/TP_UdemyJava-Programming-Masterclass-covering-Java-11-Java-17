package composition;

public class Bed {
private String style;
private int pillows;
private int height;
private int sheets;
private int quilt;
/**
 * @param style
 * @param pillows
 * @param height
 * @param sheets
 * @param quilt
 */
public Bed(String style, int pillows, int height, int sheets, int quilt) {
	super();
	this.style = style;
	this.pillows = pillows;
	this.height = height;
	this.sheets = sheets;
	this.quilt = quilt;
}

public void make() {
	System.out.println("Bedroom -> Making bed | ");
	}

/**
 * @return the style
 */
public String getStyle() {
	return style;
}

/**
 * @return the pillows
 */
public int getPillows() {
	return pillows;
}

/**
 * @return the height
 */
public int getHeight() {
	return height;
}

/**
 * @return the sheets
 */
public int getSheets() {
	return sheets;
}

/**
 * @return the quilt
 */
public int getQuilt() {
	return quilt;
}

	
}
