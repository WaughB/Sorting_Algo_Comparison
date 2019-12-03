/*
 * Brett Waugh
 * 3 December 2019
 * quickSort.java
 * The program is the logic for the Quicksort
 * algorithms. There are four different
 * Quicksort implementations for this project.
 * All of the Quicksort implementations use
 * recursion and arrays.
 */

public class quickSort {

	// Displays the contents of an array.
	// Used in troubleshooting but not in final program.
	public static void display(int max, int[] data) {
		for (int i = 0; i < max; i++) {

			System.out.print(data[i] + ", ");
		}

		System.out.println("\n");
	}

	// The call to the recursive quicksort function.
	public static void quickSortCall(int max, int[] data, int partSize) {
		recurQuickSort(0, max - 1, data, partSize);
	}

	// The recursive quicksort function.
	// Ended up including an additional argument to do the median-of-three
	// part instead of creating a separate function.
	public static void recurQuickSort(int left, int right, int[] data, int partSize) {

		if (left >= right) {
			return;
		}

		int median = medOf3(left, right, data);
		int partition = partitionItMed3(left, right, median, data);
		recurQuickSort(left, partition - 1, data, partSize);
		recurQuickSort(partition + 1, right, data, partSize);
	}

	// Similar to the above function with some slight differences
	// to the pointers. For use with the median-of-three case.
	public static int partitionItMed3(int left, int right, int pivot, int[] data) {
		int lpoint = left - 1;
		int rpoint = right;
		while (lpoint < rpoint) {
			while (data[++lpoint] < pivot)
				;

			// Search for a smaller entry.
			while (rpoint > 0 && data[--rpoint] > pivot)
				;

			// If the pointers run into each other, swapping stops.
			if (lpoint >= rpoint) {
				break;
			} else {
				swap(lpoint, rpoint, data);
			}
		}
		swap(lpoint, right, data);

		// Returns the location of the pivot.
		return lpoint;
	}

	// Swaps two elements in the array.
	public static void swap(int index1, int index2, int[] data) {
		int temp = data[index1];
		data[index1] = data[index2];
		data[index2] = temp;
	}

	// Median-of-three function.
	public static int medOf3(int left, int right, int[] data) {
		int cent = (left + right) / 2;

		// Case for left and center.
		if (data[left] > data[cent]) {
			swap(left, cent, data);
		}

		// Case for left and right.
		if (data[left] > data[right]) {
			swap(left, right, data);
		}

		// Case for center and right.
		if (data[cent] > data[right]) {
			swap(cent, right, data);
		}

		// Puts pivot value to the right.
		swap(cent, right, data);

		// Returns the median value.
		return data[right];
	}
}
