package session2;

import java.util.Scanner;

public class ACD_JAVAB_Session_2_Assignment_4_Main {

	public static void main(String[] args)
	{
		int month, year;
		System.out.println("Enter the Month Number : ");
		System.out.println("------------------------------------------------------");
		System.out.println("JAN = 1; FEB = 2; MAR = 3; APR = 4; MAY = 5; JUN = 6");
		System.out.println("JUL = 7; AUG = 8; SEP = 9; OCT = 10;NOV = 11; DEC = 12");
		System.out.println("------------------------------------------------------");
		Scanner s = new Scanner(System.in);
		month = s.nextInt();
		switch(month)
		{
			case 1: 
			case 3:
			case 5:	
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println(" No. of Days in the given month : 31"); break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("No. of Days in the given month : 30"); break;
			case 2:
				System.out.println("Enter the Year (Eg: 2016): ");
				year = s.nextInt();
				s.close();
				if (year % 4 == 0)
					System.out.println("No. of Days in the given month : 29");
				else
					System.out.println("No. of Days in the given month : 28");
				break;
			default:
				System.out.println("Invalid Entry");break;
		}
		
	}

}
