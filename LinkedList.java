/**
 * This class implements a singly linked list data structure.
 * 
 * @author Michael Ida
 *
 */
public class LinkedList {

	private Node head;

	/*
	 * The constructor creates an empty list.
	 */
	public LinkedList() {
		head = null;
	}

	/*
	 * This method creates a new node and adds it to the head of the list.
	 */
	public void insertFirst(String data) {
		Node newNode = new Node();
		newNode.record = data;
		newNode.next = head;
		head = newNode;
	}

	/*
	 * This method deletes the first node in the list.
	 */
	public void deleteFirst() {
		head = head.next;
	}

	/*
	 * This method should create a new node containing data and add it following the
	 * node 'after'. If after is null, then it should do nothing.
	 */
	public void insertAfter(String data, Node after) {

		if (after == null) {
			after = after;
		} else {
			Node newNode = new Node();
			newNode.record = data;
			newNode.next = after.next;
			after.next = newNode;
		}

	}

	/*
	 * This method should find the node containing the string data and return a
	 * pointer to that node. If not found, then it should return null.
	 */
	public Node findNode(String data) {
		Node point = head;
		Node it = point;
		while (point != null) {
			if (point.record == data) {
				return point;
			} else {

				point = point.next;
				// System.out.println("i!i!i!i!i!i!i!i!i");
				// point = null;
			}
		}
		return point;

	}

	/*
	 * This method should delete the node trash. If trash is null, then it does
	 * nothing.
	 */
	public void deleteNode(Node trash) {

		// Node point = trash;
		Node before = head;
		while (before.next != trash) {
			before = before.next;
		}
		before.next = trash.next;

		// point.record = .record;
		// point.next = after.next;
		// trash = point;
	}

	/*
	 * This method should create a new node and insert it at the end of the list.
	 */
	public void insertLast(String data) {
		Node point = head;
		Node newN = new Node();
		newN.record = data;
		if (head == null) {
			head = newN;
		} else {
			while (point.next != null) {
				point = point.next;
			}
			point.next = newN;
			newN.record = data;
		}
	}

	/*
	 * This method deletes the last node in the list. If the list is empty, then it
	 * does nothing.
	 */
	public void deleteLast() {
		Node before = head;
		Node del = head;
		while (del.next != null) {
			del = del.next;
		}
		while (before.next != del) {
			before = before.next;
		}
		before.next = null;

		// point.record = .record;
		// point.next = after.next;
		// trash = point;
	}

	/*
	 * This method transverses the list and prints out the record in each node.
	 */
	public void traverseAndPrint() {
		Node pointer = head;
		while (pointer != null) {
			System.out.println(pointer.record);
			pointer = pointer.next;
		}
		System.out.println();
	}

}
