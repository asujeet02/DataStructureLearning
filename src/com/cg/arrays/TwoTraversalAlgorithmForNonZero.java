package com.cg.arrays;

public class TwoTraversalAlgorithmForNonZero {

	public static void main(String[] args) {
		int[] array = { 1, 2, 0, 4, 5, 0, 0, 5, 3, 0, 6 };
		int count = 0;
		int n = array.length;
		for (int i = 0; i < n; i++) {
			if (array[i] != 0) {
				array[count] = array[i];
				count++;
			}
		}

		while (count < n) {
			array[count] = 0;
			count++;
		}

		for (int x : array)
			System.out.print(x + " ");
	}

}
