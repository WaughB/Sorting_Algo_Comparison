
/*
 * Brett Waugh
 * 3 December 2019
 * sortTest.java
 * Program creates a set of random data,
 * then runs various sorting algorithms
 * against the data to see how efficient
 * each algorithm is. Times are reported
 * in milliseconds at the end. 
 */

public class sortTest {

	public static void main(String[] args) {

		int start = getTime.time();

		// START PROCESS HERE !!!
		int max = 10000;
		System.out.println("Number of entries to sort: " + max);

		// Creates datasets.
		int[] data = makeData.randomArr(max);
		linked li = makeData.randomLi(data);

		outputData.writeDat(data, li, max);

		int end = getTime.time();
		int elapsed = end - start;

		System.out.println("Time for entire program was " + elapsed + " milliseconds.");

	}
}
