package com.cg.linkedlist;

public class NthNodeFromEnd {

	static int nthNodeFromEnd(Node head, int n) {
		Node mainPointer = head;
		Node refPointer = head;

		for (int i = 1; i < n; i++) {
			refPointer = refPointer.next;
			if (refPointer == null)
				return -1;
		}

		while (refPointer.next != null) {
			refPointer = refPointer.next;
			mainPointer = mainPointer.next;
		}

		return mainPointer.data;
	}
	
	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);

		int pos = 3;
		int value = nthNodeFromEnd(head, pos);
		System.out.println(value);
	}
}
