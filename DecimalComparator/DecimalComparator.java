package DecimalComparator;

public class DecimalComparator {


	public static void main(String[] args) 
	{
		
		System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
		System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
		System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
		System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
		
		
		
	}
	public static boolean areEqualByThreeDecimalPlaces(double num1,double num2) 
	{
		double num3 = num1-num2;
		if (Math.abs(num3)<= 0.0009)
			return true;
		else return false;
	}
}
