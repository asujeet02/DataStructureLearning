package com.cg.linkedlist;

import java.util.Stack;

public class ReverseLinkedListStack {

	static Node reverseList(Node head) {
		Stack<Node> stack = new Stack<>();

		Node temp = head;

		while (temp != null) {
			stack.push(temp);
			temp = temp.next;
		}

		if (!stack.isEmpty()) {
			head = stack.pop();
			temp = head;

			while (!stack.isEmpty()) {
				temp.next = stack.pop();
				temp = temp.next;
			}

			temp.next = null;
		}

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
		head.next.next.next.next = new Node(5);

		head = reverseList(head);
		printList(head);
	}
}
