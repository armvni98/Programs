//Added changes here

import java.util.Scanner;
public class AgeLabel {

	public static void main(String[] args) {
		int ageYears;
		int ageDays;

		Scanner scnr = new Scanner(System.in);

		System.out.println("Enter an age in number of days :");
		ageDays = scnr.nextInt();
		ageYears = ageDays / 365;

		if (ageYears <= 1) {
			System.out.println("You are an infant");
		}
		else if ((ageYears > 1) && (ageYears <=3)) {
			System.out.println("You are a toddler");
		}
		else if ((ageYears > 3) && (ageYears <=12)) {
			System.out.println("You are a child");
		}
		else if ((ageYears > 12) && (ageYears <=19)) {
			System.out.println("You are a teenager");
		}
		else if ((ageYears > 19) && (ageYears <=21)) {
			System.out.println("You are a young adult");
		}
		else if ((ageYears > 21) && (ageYears <=50)) {
			System.out.println("You are an adult");
		}
		else if ((ageYears > 50) && (ageYears <=65)) {
			System.out.println("You are middle aged");
		}
		else if (ageYears > 65) {
			System.out.println("You are a senior citizen");
		}
	}

}
