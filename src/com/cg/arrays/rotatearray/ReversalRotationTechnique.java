package com.cg.arrays.rotatearray;

import java.util.Scanner;

public class ReversalRotationTechnique {
	public static void main(String[] args) {
		int[] arrayToBeRotated = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int n = arrayToBeRotated.length;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rotations!");
		int d = sc.nextInt();
		if (d > n)
			d %= n;

		reverse(arrayToBeRotated, 0, n - 1);
		reverse(arrayToBeRotated, 0, d - 1);
		reverse(arrayToBeRotated, d, n - 1);

		for (int x : arrayToBeRotated)
			System.out.print(x + " ");
	}

	private static void reverse(int[] array, int start, int end) {
		while (start < end) {
			int temp = array[start];
			array[start] = array[end];
			array[end] = temp;
			start++;
			end--;
		}
	}
}
