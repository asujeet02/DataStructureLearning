package com.cg.hashingprob;

public class OneToNMinusOneRepeatingItem {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 2, 3, 4 };

		int slow = arr[0];
		int fast = arr[0];

		do {
			slow = arr[slow];
			fast = arr[arr[fast]];
		} while (slow != fast);

		fast = arr[0];
		while (slow != fast) {
			slow = arr[slow];
			fast = arr[fast];
		}

		System.out.println("The repeatitive element is: " + slow);
	}

}
