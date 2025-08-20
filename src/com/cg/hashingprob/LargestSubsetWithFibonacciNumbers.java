package com.cg.hashingprob;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LargestSubsetWithFibonacciNumbers {

	public static void main(String[] args) {

		int[] arr = { 4, 2, 8, 5, 20, 1, 40, 13, 23 };
		int max = Integer.MIN_VALUE;

		for (int i : arr)
			if (i > max)
				max = i;

		Set<Integer> newSet = new HashSet<>();

		int a = 0, b = 1;
		newSet.add(a);
		newSet.add(b);
		while (b < max) {
			int c = a + b;
			a = b;
			b = c;
			newSet.add(c);
		}

		List<Integer> newList = new ArrayList<>();
		for (int num : arr)
			if (newSet.contains(num))
				newList.add(num);

		System.out.println(newList.toString());
	}
}
