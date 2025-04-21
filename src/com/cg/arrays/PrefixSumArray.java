package com.cg.arrays;

import java.util.ArrayList;
import java.util.List;

public class PrefixSumArray {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 10, 5, 15 };
		int n = arr.length;

		List<Integer> prefixSum = new ArrayList<>(n);
		for (int i = 0; i < n; i++)
			prefixSum.add(0);

		prefixSum.set(0, arr[0]);

		for (int i = 1; i < n; i++)
			prefixSum.set(i, prefixSum.get(i - 1) + arr[i]);

		System.out.println(prefixSum.toString());
	}

}
