
/*
 * Brett Waugh
 * 3 December 2019
 * Heap.java
 * Contains the logic for the Heap Sort. 
 * This program is based off of heapSort.java from 
 * "Data Structures & Algorithms in Java" Second
 * Edition by Robert Lafore. 
 * 
 */

public class Heap {
	private static Hnode[] heapArray;
	private int maxSize;
	private int currentSize;

	public Heap(int max) {
		maxSize = max;
		currentSize = 0;
		heapArray = new Hnode[maxSize];
	}

	/*
	 * Deletes the item with the max key.
	 */
	public Hnode remove() {
		// (assumes non-empty list)
		Hnode root = heapArray[0];
		heapArray[0] = heapArray[--currentSize];
		trickleDown(0);
		return root;
	}

	/*
	 * Logic for the Heap Sort.
	 */
	public void trickleDown(int index) {
		int largerChild;

		Hnode top = heapArray[index];

		// Not on bottom row.
		while (index < currentSize / 2) {
			int leftChild = 2 * index + 1;
			int rightChild = leftChild + 1;

			// Find larger child.
			if (rightChild < currentSize && heapArray[leftChild].getKey() < heapArray[rightChild].getKey()) {
				largerChild = rightChild;
			} else {
				largerChild = leftChild;
			}

			if (top.getKey() >= heapArray[largerChild].getKey()) {
				break;
			}

			// Shift child up.
			heapArray[index] = heapArray[largerChild];

			// Go down.
			index = largerChild;
		}

		// Root to index.
		heapArray[index] = top;
	}

	/*
	 * Display function for Heap Sort. 
	 */
	public static void display(int max) {
		for (int i = 0; i < max; i++) {
			System.out.print(heapArray[i].getKey() + ", ");
		}

		System.out.println("\n");
	}

	/*
	 * Inserts the data point into the heapArray. 
	 */
	public void insertAt(int index, Hnode newNode) {
		heapArray[index] = newNode;
	}

	/*
	 * Increments the size of the heap. 
	 */
	public void incrementSize() {
		currentSize++;
	}

	/*
	 * Starts the Heap Sort process. 
	 */
	public static Heap heapCall(int max, Heap theHeap) {

		// make random array into heap
		for (int i = max / 2 - 1; i >= 0; i--) {
			theHeap.trickleDown(i);
		}

		// Remove from heap and store at array end.
		for (int j = max - 1; j >= 0; j--) {
			Hnode biggestNode = theHeap.remove();
			theHeap.insertAt(j, biggestNode);
		}

		return theHeap;
	}
}
