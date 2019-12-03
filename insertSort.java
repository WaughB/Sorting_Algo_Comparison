/*
 * Brett Waugh
 * 3 December 2019
 * insertSort.java
 * Insertion Sort algorithm. 
 * 
 */

public class insertSort {

	/*
	 * Logic for Insertion Sort.
	 */
	public static void sort(int[] data) {

		int i = 0;
		int j = 0;
		int temp = 0;

		for (i = 1; i < data.length; ++i) {
			j = i;

			while (j > 0 && data[j] < data[j - 1]) {
				temp = data[j];
				data[j] = data[j - 1];
				data[j - 1] = temp;
				--j;
			}
		}
	}

	/*
	 * Display method for the Insertion Sort results.
	 */
	public static void display(int filesize, int[] data) {
		for (int i = 0; i < filesize; i++) {

			System.out.print(data[i] + ", ");
		}

		System.out.println("\n");
	}
}
