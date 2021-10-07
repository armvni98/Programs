import java.util.Scanner;
public class Switch {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter A Number From 1..4: ");
		int num = scnr.nextInt();
		switch (num) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
		default:
			System.out.println ("Invalid Number" );
		}
		return;
	}
}