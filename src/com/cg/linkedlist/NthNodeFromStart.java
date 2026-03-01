package com.cg.linkedlist;

public class NthNodeFromStart {

	static int getNthNode(Node head, int pos) {
		if (head == null)
			return -1;
		if (pos == 1)
			return head.data;

		return getNthNode(head.next, pos - 1);
	}

	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);

		int pos = 3;
		int value = getNthNode(head, pos);
		System.out.println(value);
	}

}
