package teeNumberChecker;

public class TeeNumberChecker {

	public static void main(String[] args) {
		System.out.println(hasTeen(9, 99, 19));
		System.out.println(hasTeen(23, 15, 42));
		System.out.println(hasTeen(22, 23, 34));
		System.out.println(isTeen(9));
		System.out.println(isTeen(13));
	}

	public static boolean hasTeen(int i, int j, int k) {
		if (i > 12 && i < 20) {
			System.out.println("since " + i + " is in range 13 - 19");
			return true;
		}
		if (j > 12 && j < 20) {
			System.out.println("since " + j + " is in range 13 - 19");
			return true;
		}
		if (k > 12 && k < 20) {
			System.out.println("since " + k + " is in range 13 - 19");
			return true;
		}
		System.out.println("since numbers " + i + "," + j + "," + k + " are not in range");
		return false;
	}

	public static boolean isTeen(int i) {

		if (!(i <12 && i < 20)) {
			System.out.println("since " + i + " is in range 13 - 19");
			return true;
		}
		System.out.println("since " + i + " is in not range 13 - 19");
		return false;

	}

}
