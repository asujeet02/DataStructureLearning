package com.cg.arrays;

public class ReverseArrayElements {

	public static void main(String[] args) {
		int[] array = { 1, 2, 34, 5, 6, 7, 8, 3, 4 };
		int i = 0;
		int left = 0;
		int right = array.length - 1;
		while (left < right) {
			int temp = array[left];
			array[left] = array[right];
			array[right] = temp;
			left++;
			right--;
		}
		while (i != array.length) {
			System.out.print(array[i] + " ");
			i++;
		}
	}
}
