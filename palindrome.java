import java.util.Scanner;

public class palindrome {

	String a = "";		//original variable
	static String rev = "";	//reverse variable
	
	public static boolean palindrome(String x) {
		
		for (int i = x.length()-1; i>-1; i--) {
		rev += x.charAt(i);
		
		}
		
		System.out.println("rev:" + rev);
		
		if (rev.equals(x)) {
			System.out.print("is a palindrome");
				return true;
		}
		else {
			System.out.print("not a palindrome");
			return false;
		}
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		
		palindrome.palindrome(a);
		
	}

}
