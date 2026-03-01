package com.cg.linkedlist;

public class RemoveKthNodes {

	static Node removeKthNodes(Node head, int k) {

		if (head == null || k <= 0)
			return head;
		int count = 0;
		Node curr = head;
		Node prev = null;

		while (curr != null) {
			count++;
			if (count % k == 0) {
				if (prev != null)
					prev.next = curr.next;
				else
					head = curr.next;
			} else
				prev = curr;

			curr = curr.next;
		}
		return head;
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
		head.next.next.next.next.next = new Node(6);

		int k = 2;
		Node value = removeKthNodes(head, k);
		printList(value);
	}
}
