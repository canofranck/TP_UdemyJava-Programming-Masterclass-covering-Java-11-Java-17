package MegaBytes_Converter;

public class MegaBytes_Converter {


	public static void main(String[] args)
	{
		printMegaBytesAndKiloBytes(2500);
	
	}
	
	    public static void printMegaBytesAndKiloBytes(int kiloBytes){

	        if (kiloBytes < 0){
	            System.out.println("Invalid Value");
	        } else {
	            int megabytes = (kiloBytes/1024);
	            int kiloRemainder = kiloBytes%1024;
	            System.out.println(kiloBytes+" KB = "+megabytes+" MB and "+kiloRemainder+" KB");
	        }

	    }
	    
	}
	

	


