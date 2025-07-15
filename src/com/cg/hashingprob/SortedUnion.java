package com.cg.hashingprob;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortedUnion {

	public static void main(String[] args) {
		int[] arr1 = { 1, 1, 2, 2, 2, 4 };
		int[] arr2 = { 2, 2, 4, 4 };

		Set<Integer> st = new TreeSet<>();

		for (int x : arr1)
			st.add(x);
		for (int y : arr2)
			st.add(y);
		List<Integer> res = new ArrayList(st);

		System.out.println(res.toString());
	}
}
