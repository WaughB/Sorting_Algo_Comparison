/*
 * Brett Waugh
 * 3 December 2019
 * selectSort.java
 * The logic and display function for Selection Sort.
 */

public class selectSort {

	/*
	 * Logic for Selection Sort.
	 */
	public static void sort(int[] data, int max) {

		int min, temp;

		for (int i = 0; i < max - 1; i++) {
			
			min = i;
			for (int j = i + 1; j < max; j++) {
				if (data[j] < data[min]) {
					min = j;
				}
			}

			// Swap the new minimum with the first element.
			temp = data[min];
			data[min] = data[i];
			data[i] = temp;
		}
	}

	/*
	 * Display function for Selection Sort.
	 */
	public static void display(int[] data, int max) {
		for (int i = 0; i < max; ++i) {
			System.out.print(data[i] + ", ");
		}

		System.out.println("\n");
	}
}
