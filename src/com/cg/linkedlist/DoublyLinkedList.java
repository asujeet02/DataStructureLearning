package com.cg.linkedlist;

class NodeTwo {
	int data;
	NodeTwo next;
	NodeTwo prev;

	public NodeTwo(int data) {
		this.data = data;
		this.next = null;
		this.prev = null;
	}
}

public class DoublyLinkedList {

	public static void main(String[] args) {
		NodeTwo head = new NodeTwo(10);
		head.next = new NodeTwo(20);
		head.next.prev = head;

		head.next.next = new NodeTwo(30);
		head.next.next.prev = head.next;

		head.next.next.next = new NodeTwo(40);
		head.next.next.next.prev = head.next.next;

		NodeTwo temp = head;

		while (temp != null) {
			System.out.print(temp.data);
			if (temp.next != null)
				System.out.print("<->");
			temp = temp.next;
		}
	}
}
