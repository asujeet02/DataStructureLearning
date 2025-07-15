package com.cg.sortingalgorithm.compsorting;

import java.util.Arrays;
import java.util.Collections;

public class ArraySortDescendingOrder {
	public static void main(String[] args) {
		Integer[] a = { 2, 3, -1, 4, 7, 0, -2 };
		Arrays.sort(a, Collections.reverseOrder());
		for (int x : a)
			System.out.print(x + " ");
	}
}
