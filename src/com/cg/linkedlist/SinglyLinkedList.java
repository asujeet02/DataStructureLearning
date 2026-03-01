package com.cg.linkedlist;

class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}

	public Node() {

	}
}

public class SinglyLinkedList {

	public static void main(String[] args) {
		int count = 0;
		Node head = new Node(10);
		head.next = new Node(20);
		head.next.next = new Node(30);
		head.next.next.next = new Node(40);

		Node temp = head;
		while (temp != null) {
			count++;
			System.out.print(temp.data + " ");
			temp = temp.next;
		}

		System.out.println();
		System.out.println("Count of nodes is: " + count);
	}
}
