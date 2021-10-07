import java.util.Scanner;

public class temperature {
public static void main(String[] args) {
	Scanner scnr = new Scanner(System.in);
	
	double Celsius;
	double Fahrenheit;
	
	System.out.println("Enter the degrees in Fahrenheit");
	Fahrenheit = scnr.nextDouble();
	
	Celsius = ((Fahrenheit - 32) * 5) / 9;
	System.out.print(Fahrenheit + " degrees fahrenheit: ");
	System.out.printf("%.1f degrees celsius" , Celsius);
}
}
