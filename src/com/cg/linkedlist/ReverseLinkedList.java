package com.cg.linkedlist;

public class ReverseLinkedList {

	static Node reverseLinkedList(Node head) {
		Node curr = head, prev = null, next;

		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}

		return prev;
	}

	static void printList(Node node) {
		while (node != null) {
			System.out.print(node.data);
			if (node.next != null) {
				System.out.print("->");
			}
			node = node.next;
		}
	}

	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);

		head = reverseLinkedList(head);
		printList(head);
	}

}
