/*
 * Brett Waugh
 * 3 December 2019
 * linked.java
 * The program is the backbone for the
 * linked list operations. Only one algorithm
 * uses linked lists, so this function did not 
 * have to include much. 
 * The logic for the Merge Sort is also included 
 * in this file. The Merge Sort is done 
 * recursively using linked lists. 
 */

public class linked {

	node head = null;

	/*
	 * Defines the node class.
	 */
	public static class node {
		node next;
		int value;

		public node(int value) {
			this.value = value;
		}
	}

	/*
	 * Recursively performs the Merge sort.
	 */
	public static node recurMergSort(node i, node j) {

		node product = null;

		if (i == null) {
			return j;
		}

		if (j == null) {
			return i;
		}

		// Selects either i or j, then uses recursion.
		if (i.value <= j.value) {
			product = i;

			product.next = recurMergSort(i.next, j);

		} else {
			product = j;

			product.next = recurMergSort(i, j.next);
		}
		return product;
	}

	/*
	 * Returns the sorted list of data.
	 */
	public node mergSort(node head) {

		// If the head is null or not.
		if (head == null || head.next == null) {
			return head;
		}

		// Grabs the middle.
		node middle = getMid(head);
		node nextofmiddle = middle.next;

		middle.next = null;

		node left = mergSort(head);
		node right = mergSort(nextofmiddle);

		node sortedlist = recurMergSort(left, right);
		return sortedlist;
	}

	/*
	 * Returns the middle of the linked list.
	 */
	public static node getMid(node head) {
		if (head == null) {
			return head;
		}

		node middle = head;
		node check = head;

		while (check.next != null && check.next.next != null) {
			middle = middle.next;
			check = check.next.next;
		}
		return middle;
	}

	/*
	 * Allows data to be placed into nodes.
	 */
	public void push(int new_data) {

		// Creates the new node.
		node new_node = new node(new_data);

		// Links the old list to the new.
		new_node.next = head;

		// Moves the head to point to the new node.
		head = new_node;
	}

	/*
	 * Display function for linked list operations.
	 */
	public static void display(linked li) {
		while (li.head != null) {
			System.out.print(li.head.value + ", ");
			li.head = li.head.next;
		}
	}
}