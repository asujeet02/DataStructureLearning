package com.cg.arrays;

public class AlternateElements {

	public static void main(String[] args) {
		int[] array = { 12, 45, 36, 78, 90, 54, 34, 56, 43 };
		for (int i = 0; i <= array.length; i += 2)
			System.out.print(array[i] + " ");
	}

}
