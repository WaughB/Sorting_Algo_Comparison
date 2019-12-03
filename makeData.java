/*
 * Brett Waugh
 * 3 December 2019
 * makeData.java
 * Creates random data in both 
 * arrays and linked lists. 
 */

public class makeData {

	/*
	 * Creates random data and fills it into an array.
	 */
	public static int[] randomArr(int max) {

		// Allocate space for array data.
		int[] data = new int[max];

		// Creates the maximum number of random data points from one to one-thousand.
		for (int i = 0; i < data.length; i++) {

			data[i] = (int) (Math.random() * 1000 + 1);

		}

		return data;
	}

	/*
	 * Takes the random data from the array and fills it into a linked list.
	 */
	public static linked randomLi(int[] data) {
		linked li = new linked();

		for (int i = 0; i < data.length; i++) {
			li.push(data[i]);
		}

		return li;
	}
}
