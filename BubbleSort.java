/* 
 * Brett Waugh
 * 3 December 2019
 * BubbleSort.java
 * Bubble Sort algorithm.
 * Bubble Sort is known for its simplicity
 * but often performs poorly. 
 * 
 */

public class BubbleSort {

	/*
	 * Bubble Sort logic.
	 */
	public static int[] sort(int[] data) {

		int temp = 0;

		for (int i = 0; i < data.length - 1; i++) {
			for (int j = 0; j < data.length - i - 1; j++) {
				if (data[j] > data[j + 1]) {
					temp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = temp;
				}
			}
		}

		return data;
	}

	/*
	 * Display function for Bubble Sort.
	 */
	public static void display(int filesize, int[] data) {
		for (int i = 0; i < filesize; i++) {

			System.out.print(data[i] + ", ");
		}

		System.out.println("\n");
	}

}
