package flourPackProblem;

public class FlourPackProblem {

	public static void main(String[] args) {
	System.out.println(canPack (1, 0, 4));
	System.out.println(canPack (1, 0, 5));
	System.out.println(canPack (0, 5, 4));
	System.out.println(canPack (2, 2, 11));
	System.out.println(canPack (-3, 2, 12));
	
	}

	public static boolean canPack(int bigCount, int smallCount, int goal) {
		  boolean result = false;
	        if (bigCount < 0 || smallCount < 0 || goal < 0) {
	            return result;
	        }
	        if ((bigCount * 5) + (smallCount) >= goal) {
	            result = true;
	            while (goal > 0) {
	                if (goal >= 5) {
	                    if(bigCount >= 1) {
	                        goal -= 5;
	                        bigCount--;
	                    }
	                    else if (smallCount >= goal) {
	                        goal = 0;
	                        return true;
	                    } else {
	                        return false;
	                    }
	                }
	                else if (goal < 5) {
	                    if (smallCount >= goal) {
	                        goal = 0;
	                        return true;
	                    } else {
	                        return false;
	                    }
	                }
	            }
	            return result;
	        } else {
	            return false;
	        }
	}

	
}
