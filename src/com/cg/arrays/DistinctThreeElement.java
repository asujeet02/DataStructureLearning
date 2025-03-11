package com.cg.arrays;

import java.util.ArrayList;
import java.util.List;

public class DistinctThreeElement {

	static List<Integer> findThreeDistinctGreatest(int[] arr) {
		int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > first) {
				third = second;
				second = first;
				first = arr[i];
			} else if (arr[i] > second && arr[i] != first) {
				third = second;
				second = arr[i];
			} else if (arr[i] > third && arr[i] != first && arr[i] != second)
				third = arr[i];
		}

		List<Integer> distinctList = new ArrayList<Integer>();
		if (first != Integer.MIN_VALUE)
			distinctList.add(first);
		if (second != Integer.MIN_VALUE)
			distinctList.add(second);
		if (third != Integer.MIN_VALUE)
			distinctList.add(third);
		return distinctList;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 9, 9 };

		System.out.println(findThreeDistinctGreatest(arr));
	}

}
