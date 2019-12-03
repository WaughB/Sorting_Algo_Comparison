
/*
 * Brett Waugh
 * 3 December 2019
 * Hnode.java
 * This is the node class for use with Heap Sort.
 * This program is based off of heapSort.java from 
 * "Data Structures & Algorithms in Java" Second
 * Edition by Robert Lafore. 
 */

public class Hnode {
	private int iData; // data item (key)

	public Hnode(int key) {
		iData = key;
	}

	public int getKey() {
		return iData;
	}
}
