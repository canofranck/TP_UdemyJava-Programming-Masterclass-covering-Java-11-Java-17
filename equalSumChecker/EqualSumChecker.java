package equalSumChecker;

public class EqualSumChecker {

	public static void main(String[] args) 
	{
		System.out.println( hasEqualSum(1,1,1));
		System.out.println( hasEqualSum(1,1,2));
		System.out.println( hasEqualSum(1,-1,0));
	}

	private static boolean hasEqualSum(int i, int j, int k) {
		int somme = i + j;
		if (somme == k)
			return true;
		return false;
		
	}

}
