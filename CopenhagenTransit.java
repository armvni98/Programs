import java.util.Scanner;

public class CopenhagenTransit {
public static void main(String[] args) {

	Scanner scnr = new Scanner(System.in);
	String passengerType ;
	
	int zone;
	double fare = 0;
	
	System.out.println("Enter zone number :");	
	zone = scnr.nextInt();
	
	System.out.println("Enter adult or child :" );
	passengerType = scnr.next();
	
	
	if ((zone<=2) && passengerType.equals("adult")) {
		fare = 23.0;
}
	else if ((zone<=2) && (passengerType.equals("child"))) {
		fare = 11.5;
}
	else if ((zone==3) && (passengerType.equals("adult"))) {
		fare = 34.5;
}
	else if ((zone==3) && (passengerType.equals("child"))) {
		fare = 23.0;
}
	else if ((zone==4) && (passengerType.equals("child"))) {
		fare = 23.0;
}
	else if ((zone==4) && (passengerType.equals("adult"))) {
		fare = 46.0;
}
	else if (zone>4) 									   {
		fare = -1.00;
}
	System.out.print("The fare for " + passengerType);
	System.out.println(" to zone number " + zone + " is " + fare + ".");
	}
}