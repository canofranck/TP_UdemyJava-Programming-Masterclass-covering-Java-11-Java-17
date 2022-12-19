package sumFirstAndLastDigit;

public class SumFirstAndLastDigit {

	public static void main(String[] args)
	{
		System.out.println(sumFirstAndLastDigit(252));
		System.out.println(sumFirstAndLastDigit(257));
		System.out.println(sumFirstAndLastDigit(0));
		System.out.println(sumFirstAndLastDigit(5));
		System.out.println(sumFirstAndLastDigit(-10));
	}

	

	

	    public static int sumFirstAndLastDigit(int number) {
	        int numberCopy = number;

	        if (number < 0) {
	            return -1;
	        } else {
	            int lastDigit = 0, firstDigit = 0, count = 0;
	            lastDigit = number % 10;
	            while (numberCopy > 0) {
	                numberCopy /= 10;
	                count++;
	            }
	            firstDigit = (int) (number / (Math.pow(10, count - 1)));
	            return firstDigit + lastDigit;
	        }
	    }
	}


