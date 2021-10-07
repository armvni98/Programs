import java.util.Scanner;
public class DateConverter {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		int dayNum;
		int monthNum;
		int date;
		int year;
		String monthName = "";
		
		
		System.out.println("Enter four integers representing dayNumber monthNumber date year:");
		dayNum = scnr.nextInt();
		monthNum = scnr.nextInt();
		date = scnr.nextInt();
		year = scnr.nextInt();
		
		
		
	{
		 if (monthNum == 1) 	 {
			monthName = ("January");
	}
		else if (monthNum == 2)  {
			monthName = ("February");
	}
		else if (monthNum == 3)  {
			monthName = ("March");
	}
		else if (monthNum == 4)  {
			monthName = ("April");
	}
		else if (monthNum == 5)  {
			monthName = ("May");
	}
		else if (monthNum == 6)  {
			monthName = ("June");
	}
		else if (monthNum == 7)  {
			monthName = ("July");
	}
		else if (monthNum == 8)  {
			monthName = ("August");
	}
		else if (monthNum == 9)  {
			monthName = ("September");
	}
		else if (monthNum == 10) {
			monthName = ("October");
	}
		else if (monthNum == 11) {
			monthName = ("November");
	}
		else if (monthNum == 12) {
			monthName = ("December");
	}	
		}
		
		
		 
// ALL INVALID STATEMENTS
		
		//LEAP YEAR CALCULATION : (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
		 if ((monthNum == 2) && (date == 29) && (!(((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)))) {
		 	System.out.println("Invalid date: " + year + " is not a leap year, February does not have 29 days, please enter a valid date.");
		 	return;
	}
		
		 
		 
		 
		//Invalid dayNum
		 else if ((dayNum >7) || (dayNum<=0)) {
			System.out.println("Invalid day number: " + dayNum + ", please enter a number from 1..7.");
			return;
	}	
		
		
		 
		
		//Invalid monthNum
		else if ((monthNum > 12 ) || (monthNum < 1)) {
			System.out.println("Invalid month number: " + monthNum + ", please enter a number from 1..12.");
			return;
	}
		
		 
		 
		 
		//Invalid monthNum and Dates
		else if ((monthNum == 2) && (date >= 30))  {
			System.out.println("Invalid date: " + monthName + ", does not have " + date + " days, please enter a valid date.");
			return;
	}

		else if ((monthNum == 4) && (date >=31 ))  {
			System.out.println("Invalid date: " + monthName + ", does not have " + date + " days, please enter a valid date.");
			return;
	}

		else if ((monthNum == 6) && (date >=31 ))  {
			System.out.println("Invalid date: " + monthName + ", does not have " + date + " days, please enter a valid date.");
			return;
	}

		else if ((monthNum == 9) && (date >=31 ))  {
			System.out.println("Invalid date: " + monthName + ", does not have " + date + " days, please enter a valid date.");
			return;
	}

		else if ((monthNum == 11) && (date>=31))   {
			System.out.println("Invalid date: " + monthName + ", does not have " + date + " days, please enter a valid date.");
			return;
	}

		 

		 
		//Invalid date number
		else if (date > 31) {
			System.out.println("Invalid date number: " + date + ", please enter a number from 1..31.");
			return;
	}
		else if (date <=0)   {
			System.out.println("Invalid date number: " + date + ", please enter a number from 1..31.");
			return;
	}

		
		
		
		System.out.print(dayNum + " " + monthNum + " " + date + " " + year + " is ");
		
		
		//Printing the day of the week (dayNum)
				
		if      (dayNum == 1) {
			System.out.print("Sunday");
	}
		else if (dayNum == 2) {
			System.out.print("Monday");
	}
		else if (dayNum == 3) {
			System.out.print("Tuesday");
	}
		else if (dayNum == 4) {
			System.out.print("Wednesday");
	}
		else if (dayNum == 5) {
			System.out.print("Thursday");
	}
		else if (dayNum == 6) {
			System.out.print("Friday");
	}
		else if (dayNum == 7) {
			System.out.print("Saturday");
	}
	

		
		//FINAL PRINT STATEMENT
			System.out.println(" " + monthName + " " + date + ", " + year);
		}
		

}       