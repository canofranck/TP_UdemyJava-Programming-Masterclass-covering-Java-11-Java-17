package minutesToYearsandDaysCalculator;

import java.awt.Choice;

public class MinutesToYearsandDaysCalculator {

	public static void main(String[] args) {
		printYearsAndDays(525600);
		printYearsAndDays(1051200);
		printYearsAndDays(561600);

	}

	public static void  printYearsAndDays(long minutes) 
	{
		long dayCalcul=0;
		if (minutes> -1)
		{
			long minutesenhours=minutes/60;
			long hoursenday=minutesenhours/24;
			long dayenyears=hoursenday/365;
			long verifdayinyears=hoursenday/365;
			long test=hoursenday%365;
			if ((verifdayinyears>0)&&(test==0))
					 {
						dayCalcul=test;
					 }
			else {dayCalcul=test;
		}
			System.out.println(minutes+" min = "+dayenyears+" y and "+dayCalcul+" d");
		}
		else System.out.println("Invalid Value");
	}
}
