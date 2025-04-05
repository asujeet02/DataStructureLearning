package com.cg.arrays;

public class SingleTraversalForNonZero {

	/*
	 * static void swap(int a, int b) { int temp = a; a = b; b = temp; }
	 */

	public static void main(String[] args) {
		int[] array = { 1, 2, 0, 3, 0, 4, 0, 0, 5, 6, 7, 8, 9 };
		int n = array.length;
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (array[i] != 0) {
				int temp = array[i];
				array[i] = array[count];
				array[count] = temp;
				count++;
			}
		}

		for (int x : array)
			System.out.print(x + " ");
	}
}
