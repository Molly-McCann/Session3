
// Molly McCann
// 01.26.2024

public class ArrayExample {
	public static void main(String[] args) {
		// Create an array of integers
		int[] numbers = { 10, 20, 30, 40, 50 }; // No need to do new int[size]

		// Print the 4th element (index 3)
		int fourthElement = numbers[3];
		System.out.println("The 4th element is: " + fourthElement);

		// Find the length of the array
		int length = numbers.length; // The length is the property of array
		System.out.println("The length of the array is: " + length);
	}
}
