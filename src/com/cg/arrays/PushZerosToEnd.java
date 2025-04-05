package com.cg.arrays;

import java.util.Arrays;

public class PushZerosToEnd {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 0, 5, 0, 0, 4, 0 };
		int i = 0;
		int n = array.length;
		int temp[] = new int[n];
		for (int x : array) {
			if (x != 0) {
				temp[i] = x;
				i++;
			}
		}

		for (int j = i; j < n; j++)
			temp[j] = 0;

		array = Arrays.copyOf(temp, n);

		for (int y : array)
			System.out.print(y + " ");
	}

}
