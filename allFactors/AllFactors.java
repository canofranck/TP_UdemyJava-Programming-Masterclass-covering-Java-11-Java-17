package allFactors;

public class AllFactors {

	public static void main(String[] args) {
		
		printFactors(6);
		System.out.println();
		 printFactors(32);
		 System.out.println();
		 printFactors(10);
		 System.out.println();
		 printFactors(-1);
		
	}

	  public static void printFactors(int number) {
	        if (number >= 1) {
	            for (int i = number; i > 0; i--) {
	                int factor = number / i;
	                if (number % i == 0) {
	                    System.out.print(factor+" ");
	                }
	            }
	        } else {
	            System.out.println("Invalid Value");
	        }
	    }
		
	}


