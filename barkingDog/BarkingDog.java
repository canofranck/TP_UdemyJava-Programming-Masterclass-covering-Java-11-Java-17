package barkingDog;

public class BarkingDog {

	public static void main(String[] args) {

		shouldWakeUp(true, 1);

		System.out.println(shouldWakeUp(true, 1));
		System.out.println(shouldWakeUp(false, 2));
		System.out.println(shouldWakeUp(true, 8));
		System.out.println(shouldWakeUp(true, -1));
		System.out.println(shouldWakeUp(false, 24));
	}

    public static boolean shouldWakeUp(boolean barking , int hourOfDay){
        if (hourOfDay >= 0 && hourOfDay <= 23) {        // to check right hour number
             if (hourOfDay <= 7 || hourOfDay >= 23) {       // to check barking hours
                 return barking;      //flag to true if its during bark hours
             }
         }else{
             return false;       //out barking hours entry flag false
         }
         return false;          // flag false if invalid hour 
     }
}
