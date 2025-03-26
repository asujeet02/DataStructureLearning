package com.cg.arrays;

import java.util.ArrayList;
import java.util.Collections;

public class LeadersOfArray {

	public static void main(String[] args) {
		ArrayList<Integer> resultArray = new ArrayList<Integer>();

		int[] array = { 16, 17, 4, 3, 5, 2 };
		int n = array.length;
		int rightLeader = array[n - 1]; // Rightmost element in the array will always be a leader
		resultArray.add(rightLeader);

		for (int i = n - 2; i >= 0; i--) {
			if (array[i] >= rightLeader) {
				rightLeader = array[i];
				resultArray.add(rightLeader);
			}
		}

		Collections.reverse(resultArray);

		System.out.println(resultArray);

	}

}
