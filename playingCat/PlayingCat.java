package playingCat;

public class PlayingCat {

	public static void main(String[] args)
	{
		System.out.println(isCatPlaying(true, 10));
		System.out.println(isCatPlaying(false, 36));
		System.out.println(isCatPlaying(false, 35));
		System.out.println(isCatPlaying(true, 25));
		System.out.println(isCatPlaying(true, 45));
		System.out.println(isCatPlaying(false,24));
	}

	public static boolean isCatPlaying(boolean  summer, int  temperature) 
	{
		if ((summer&& temperature<46)&&temperature>24)
			return true;
		else if (((!summer&&temperature<36)&&(temperature>24))) 
			return true;
		
		else return false;
		
		
		
	}

}
