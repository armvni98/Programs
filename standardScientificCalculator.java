import java.util.Scanner;
public class standardScientificCalculator {

	public static void main(String[] args) {

	Scanner scnr = new Scanner(System.in);
	
	System.out.println("Enter the calculator mode: Standard/Scientific?");
	String calcMode;
	calcMode = scnr.next();
	
	if (calcMode.equals("standard")) {
		System.out.println("The calculator will operate in standard mode.");
		System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division");
	
	String calcOp;
	calcOp = scnr.next();
	if (!((calcOp.equals("+")) || (calcOp.equals("-")) || (calcOp.equals("*")) || (calcOp.equals("/")))) {
		System.out.println("Invalid operation entered\n" + 
				"\n" + 
				"Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division");
		calcOp = scnr.next();
	}
	
	
		if (calcOp.equals("+")) {{
			System.out.println("How many numbers do you want to add?");
			int numValues = scnr.nextInt();
			System.out.println("Enter " +numValues+ " numbers:");
			
			int i;
			double result = 0;
			int currValue;
		
			
			for (i = 0; i < numValues; i++) {
		         currValue = scnr.nextInt();
		         result = result + currValue;
			}
		
		System.out.println(result);
		}
		}
		
		
		
		
		
		
		if (calcOp.equals("-")) {{ // STILL NEED TO SOLVE
			System.out.println("How many numbers do you want to subtract?");
			int numValues = scnr.nextInt();
			System.out.println("Enter " +numValues+ " numbers:");
			
			
			int i;			
			double currValue;
			double result = 0;
			
			for (i = 0; i < numValues; ++i) {
		         currValue = scnr.nextInt();
		         result = result + currValue;
		
		System.out.println(result);
				}
		}
		}
		
		
		
		
		
		
		else if (calcOp.equals("*")) {{ //MULTIPLICATION 
			System.out.println("How many numbers do you want to Multiply?");
			int numValues = scnr.nextInt();
			System.out.println("Enter " +numValues+ " numbers:");
			
			int i;
			double result = 1;
			int currValue;
			
			
			for (i = 0; i < numValues; ++i) {
		         currValue = scnr.nextInt();
		         result = result * currValue;
			}
			System.out.println(result);
		}					
	}
		
		
		
		
		
		else if (calcOp.equals("/")) {{ //division //NEED TO STILL FIX
			System.out.println("How many numbers do you want to divide?");
			int numValues = scnr.nextInt();
			System.out.println("Enter " +numValues+ " numbers:");
			
			
			
			int i;
			double result = 1;
			int currValues = 1;
			
			for (i = 0; i < numValues; ++i) {
			currValues = scnr.nextInt();
		    result = (currValues/result) ; 
		
			
			System.out.println(result);
			}
		}					
	}
			
	
	}
	
	
	
	
	if (calcMode.equals("Scientific")) {
		System.out.print("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division, 'sin' for sin x, 'cos' for cos x, 'tan' for tan x:");
	}
		
	}
}

