package composition;

public class Lamp {
private boolean battery;
private int  globRating;
private String style;
/**
 * @param battery
 * @param globRating
 * @param styleString
 */
public Lamp(String style,boolean battery, int globRating ) {
	super();
	this.battery = battery;
	this.globRating = globRating;
	this.style = style;
}
public void turnOn() {
	System.out.println("Lamp -> Turning on");
}
/**
 * @return the globRating
 */
public int getGlobRating() {
	return globRating;
}
/**
 * @return the styleString
 */
public String getStyle() {
	return style;
}
public boolean isBattery() {
	return isBattery();
}

}
