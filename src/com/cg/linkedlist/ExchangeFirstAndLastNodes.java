package com.cg.linkedlist;

public class ExchangeFirstAndLastNodes {

	static Node addToEmpty(Node head, int data) {
		if (head != null)
			return head;

		Node temp = new Node();

		temp.data = data;
		head = temp;

		head.next = head;
		return head;
	}

	static Node addBegining(Node head, int data) {
		if (head == null)
			return addToEmpty(head, data);

		Node temp = new Node();
		temp.data = data;
		temp.next = head.next;
		head.next = temp;

		return head;
	}

	static void traverse(Node head) {
		Node p;

		if (head == null) {
			System.out.print("List is empty!");
			return;
		}

		p = head;

		do {
			System.out.print(p.data + " ");
			p = p.next;
		} while (p != head);
	}

	static Node exchangeNodes(Node head) {
		if (head.next.next == head) {
			head = head.next;
			return head;
		}

		Node p = head;
		while (p.next.next != head)
			p = p.next;

		p.next.next = head.next;
		head.next = p.next;
		p.next = head;
		head = head.next;

		return head;
	}

	public static void main(String[] args) {
		int i;

		Node head = null;
		head = addToEmpty(head, 6);

		for (i = 5; i >= 1; i--)
			head = addBegining(head, i);

		System.out.print("List before: ");
		traverse(head);

		System.out.println();

		System.out.print("List after: ");
		head = exchangeNodes(head);
		traverse(head);
	}
}
