import java.util.Arrays;

public class ArrayMatch {

	public static void main(String[] args) {
		
		int[] arr1 = {1,2,3};
		int[] arr2 = {3,2,1};
		
		System.out.print(isMatch(arr1, arr2));
		

	}

	
	
	public static boolean isMatch(int[] a, int[] b) {
		
		if (a.length != b.length) {
			return false;
		}
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		
		for (int i=0; i<a.length; i++) {
			if (a[i] != b[i]) {
				return false;
			}
		}
		
		return true;
	}
	
	
	
}
