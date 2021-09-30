public class palindrome {

	String a = "";		//original variable
	static String rev = "";	//reverse variable
	
	public static boolean palindrome(String x) {
		
		for (int i = x.length()-1; i>-1; i--) {
		rev += x.charAt(i);
		
		}
		
		if (rev.equals(x)) {
				return true;
		}
		else {
			return false;
		}
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.print(palindrome("racecar"));
		
	}

}
