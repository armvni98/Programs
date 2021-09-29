
public class bubbleSort {

	//Code for bubble sort
	public static void bubbleSort(int[] a) {
	    boolean sorted = false;
	    int temp;
	    while(!sorted) {
	        sorted = true;
	        for (int i = 0; i < a.length - 1; i++) {
	            if (a[i] > a[i+1]) {
	                temp = a[i];
	                a[i] = a[i+1];
	                a[i+1] = temp;
	                sorted = false;
	            }
	        }
	    }
	}
	//Code ends here
	
	public static void main(String[]args) {
		int a[] = {4,3,1,5,6};
		bubbleSort.bubbleSort(a);
		
		for (int i=0; i<a.length; i++) {
			System.out.print(a[i]);
		}
	}
	
	
}
