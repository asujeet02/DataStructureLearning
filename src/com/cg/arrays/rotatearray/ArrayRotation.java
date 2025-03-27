package com.cg.arrays.rotatearray;

public class ArrayRotation {

	public static void rotateRightArray(int[] arr, int d) {
		int n = arr.length;
		for (int i = 0; i < d; i++) {
			int last = arr[n - 1];
			for (int j = n - 1; j > 0; j--) {
				arr[j] = arr[j - 1];
			}
			arr[0] = last;
		}
	}

	public static void main(String[] args) {
		int arrayToRotate[] = { 1, 23, 45, 32, 56, 7 };
		rotateRightArray(arrayToRotate, 2);
		int i = 0;
		while (i != arrayToRotate.length) {
			System.out.print(arrayToRotate[i] + " ");
			i++;
		}
	}
}
