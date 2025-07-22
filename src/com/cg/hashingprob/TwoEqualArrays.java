package com.cg.hashingprob;

import java.util.HashMap;
import java.util.Map;

public class TwoEqualArrays {

	public static void main(String[] args) {
		int a[] = { 3, 5, 2, 5, 2 };
		int b[] = { 2, 3, 5, 5, 2 };

		int aLength = a.length;
		int bLength = b.length;

		if (aLength != bLength)
			System.out.println("Arrays are not equal");

		Map<Integer, Integer> map = new HashMap<>();
		int count = 0;

		for (int i = 0; i < aLength; i++) {
			if (map.get(a[i]) == null)
				map.put(a[i], map.getOrDefault(a[i], 0) + 1);
			else {
				count = map.get(a[i]);
				count++;
				map.put(a[i], count);
			}
		}

		for (int i = 0; i < aLength; i++) {
			if (!map.containsKey(b[i]))
				System.out.println("Arrays are not equal");
			if (map.get(b[i]) == 0)
				System.out.println("Arrays are not equal");
			
			count = map.get(b[i]);
			--count;
			map.put(b[i], count);
		}
		System.out.println("Arrays are equal");
	}

}
