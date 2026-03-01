package com.cg.linkedlist;

public class DeleteNode {

	static Node deleteNode(Node head, int position) {
		Node temp = head;
		if (position == 1) {
			head = temp.next;
			return head;
		}

		Node prev = null;
		for (int i = 1; i < position; i++) {
			prev = temp;
			temp = temp.next;
		}

		prev.next = temp.next;

		return head;
	}

	static void printList(Node node) {
		while (node != null) {
			System.out.print(node.data);
			if (node.next != null)
				System.out.print("->");
			node = node.next;
		}
	}

	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);

		int pos = 3;
		head = deleteNode(head, pos);
		printList(head);
	}
}
