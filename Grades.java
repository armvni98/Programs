import java.util.Scanner;
public class Grades {

	public static int readGrades() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a grade :");

		return sc.nextInt();

	}
	public static int sum(int[] arr)
	{

		int sum=0;
		for(int i=0;i<arr.length;i++)
			sum=sum+arr[i];
		return sum;
	}
	public static int sum(int[] arr, int firstIndex, int lastIndex)
	{
		int sum=0;
		for(int i=firstIndex;i<=lastIndex;i++)
			sum=sum+arr[i];
		return sum;
	}
	public static double average(int[] arr)
	{
		int n = sum(arr);
		return (double)n/arr.length;
	}
	public static int maxValue(int[] arr) {

		if (arr.length == 0) return -1;

		int max = arr[0];

		for (int i=1; i<arr.length; i++) {

			max = arr[i] > max ? arr[i] : max;

		}

		return max;

	}

	public static int maxValue(int[] arr, int firstIndex, int lastIndex) {

		if (arr.length == 0) return -1;

		int max = arr[firstIndex];

		for (int i=firstIndex + 1; i<lastIndex; i++) {

			max = arr[i] > max ? arr[i] : max;

		}

		return max;

	}

	public static int indexOfFirstMaxValue(int[] arr) {

		if (arr.length == 0) return -1;

		int max = arr[0];

		int index = 0;

		for (int i=1; i<arr.length; i++) {

			if (max < arr[i]) {

				index = i;

				max = arr[i];

			}

		}

		return index;

	}

	public static int minValue(int[] arr) {

		if (arr.length == 0) return -1;

		int min = arr[0];

		for (int i=1; i<arr.length; i++) {

			min = arr[i] < min ? arr[i] : min;

		}

		return min;

	}

	public static int numberOfBelowAverageElements(int[] arr) {
		double avg = 0;
		for (int i = 0; i < arr.length; i++) {
			avg += arr[i];
		}
		avg /= arr.length;

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < avg)
				++count;
		}
		return count;
	}

	public static int numberOfAboveAverageElements(int[] arr) {
		double avg = 0;
		for (int i = 0; i < arr.length; i++) {
			avg += arr[i];
		}
		avg /= arr.length;

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > avg)
				++count;
		}
		return count;
	}

	public static void main(java.lang.String[] args) {
		readGrades();
	}
}