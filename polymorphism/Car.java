package polymorphism;

public class Car {
private boolean engine;
private int cylinders;
private String name;
private int wheels;
/**
 * @param cylinders
 * @param name
 */
public Car(int cylinders, String name) {
	super();
	this.cylinders = cylinders;
	this.name = name;
}

public String startEngine () {
	return "Car -> startEngine()";
}
public String accelerate () {
	return "Car -> accelerate()";
}
public String brake () {
	return "Car -> brake()";
}

/**
 * @return the cylinders
 */
public int getCylinders() {
	return cylinders;
}

/**
 * @return the name
 */
public String getName() {
	return name;
}

}
