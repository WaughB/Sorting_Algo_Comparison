
/*
 * Brett Waugh
 * 3 December 2019
 * outputData.java
 * Runs each algorithm and displays the results.
 * There is an option to uncomment some lines to 
 * see the results of each algorithm. 
 */

public class outputData {

	static void writeDat(int data[], linked li, Heap theHeap, int max) {

		// Duplicate data for different sorting algorithms.
		int[] data_b = data.clone();
		int[] data_s = data.clone();
		int[] data_i = data.clone();
		int[] data_q = data.clone();

		/****************************/
		/* Beginning of Bubble Sort */
		/****************************/

		int start_b = getTime.time();

		BubbleSort.sort(data_b);

		int end_b = getTime.time();
		int time_b = end_b - start_b;

		// Troubleshooting, displays to console.
		// System.out.println("Bubble Sort: ");
		// BubbleSort.display(max, data_b);

		System.out.println("Bubble Sort    : " + time_b + " milliseconds.");

		/****************************/
		/* Beginning of Insert Sort */
		/****************************/

		int start_i = getTime.time();

		insertSort.sort(data_i);

		int end_i = getTime.time();
		int time_i = end_i - start_i;

		// Troubleshooting, displays to console.
		// System.out.println("Insert Sort: ");
		// insertSort.display(max, data_i);

		System.out.println("Insertion Sort : " + time_i + " milliseconds.");

		/*******************************/
		/* Beginning of Selection Sort */
		/*******************************/

		int start_s = getTime.time();

		selectSort.sort(data_s, max);

		int end_s = getTime.time();
		int time_s = end_s - start_s;

		// Troubleshooting, displays to console.
		// System.out.println("Selection Sort: ");
		// selectSort.display(data_s, max);

		System.out.println("Selection Sort : " + time_s + " milliseconds.");

		/**************************/
		/* Beginning of Heap Sort */
		/**************************/

		int start_h = getTime.time();

		Heap.heapCall(max, theHeap);

		int end_h = getTime.time();
		int time_h = end_h - start_h;

		// Troubleshooting, displays to console.
		// System.out.println("Heap Sort: ");
		// Heap.display(max);

		System.out.println("Heap Sort      : " + time_h + " milliseconds.");

		/***************************/
		/* Beginning of Merge Sort */
		/***************************/

		int start_m = getTime.time();

		li.head = li.mergSort(li.head);

		int end_m = getTime.time();
		int time_m = end_m - start_m;

		// Troubleshooting, displays to console.
		// System.out.println("Merge Sort: ");
		// linked.display(li);

		System.out.println("Merge sort     : " + time_m + " milliseconds.");

		/**************************************************/
		/* Beginning of Quicksort, median-of-three method */
		/**************************************************/

		// Partitions for quicksort should be of no more than two.
		int partSize = 2;

		int start_q = getTime.time();

		quickSort.quickSortCall(max, data_q, partSize);

		int end_q = getTime.time();
		int time_q = end_q - start_q;

		// Troubleshooting, displays to console.
		// System.out.println("Quicksort: ");
		// quickSort.display(max, data_q);

		System.out.println("Quicksort      : " + time_q + " milliseconds.");

	}
}
