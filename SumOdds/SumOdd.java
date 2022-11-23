package SumOdds;

public class SumOdd {

	public static void main(String[] args)
	{
		System.out.println(isOdd(10));
		System.out.println(sumOdd(1, 100));
		System.out.println(sumOdd(-1, 100));
		System.out.println(sumOdd(100, 100));
		System.out.println(sumOdd(13, 13));
		System.out.println(sumOdd(100, -100));
		System.out.println(sumOdd(100, 1000));
	}

	public static int sumOdd(int start, int end)
	{
		int somme=0;
		 if (start > 0 && end > 0 && end >= start) 
		 {
			 for (int i = start; i <= end; i++)
			 {
				 if (isOdd(i))
				 	{
	                    somme = somme + i;
				 	  }
	            }
	            return somme;
	        } else {
	            return -1;

	        }
	}
	public static boolean isOdd (int number)
	{
		 if((number > 0) && (number % 2 != 0))
			return true;
		return false;
		
		
	}
	}

