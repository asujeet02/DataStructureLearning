package com.cg.arrays;

public class MinCostOfArray {

	public static void main(String[] args) {
		int arr[] = { 4, 3, 2 };
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min)
				min = arr[i];
		}
		System.out.println("Minimun cost to make array size 1 is: " + (arr.length - 1) * min);
	}

}
