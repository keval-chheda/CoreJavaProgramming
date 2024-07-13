package com.infra.dsa.linkedlist;

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public class LinkedList {

	// Function to check if the linked list is circular
	public static int isCircular(Node head) {
		if (head == null) {
			return 1; // An empty list is considered circular
		}

		Node slow = head;
		Node fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast) {
				return 1; // Circular list detected
			}
		}

		return 0; // No cycle detected
	}

	// Helper function to create a linked list
	public static Node createLinkedList(int[] arr, int pos) {
		if (arr.length == 0) {
			return null;
		}
		Node head = new Node(arr[0]);
		Node current = head;
		Node loopNode = null;

		if (pos == 0) {
			loopNode = head;
		}

		for (int i = 1; i < arr.length; i++) {
			current.next = new Node(arr[i]);
			current = current.next;
			if (i == pos) {
				loopNode = current;
			}
		}

		if (loopNode != null) {
			current.next = loopNode; // Creating the cycle
		}

		return head;
	}

	// Main method to test the function
	public static void main(String[] args) {
		// Example 1: List: 1->2->3->4->5, with the last node pointing back to the first
		// node (forming a cycle)
		Node head1 = createLinkedList(new int[] { 1, 2, 3, 4, 5 }, 0);
		System.out.println(isCircular(head1)); // Output: 1

		// Example 2: List: 2->4->6->7->5->1, no cycle
		Node head2 = createLinkedList(new int[] { 2, 4, 6, 7, 5, 1 }, -1);
		System.out.println(isCircular(head2)); // Output: 0
	}

}
