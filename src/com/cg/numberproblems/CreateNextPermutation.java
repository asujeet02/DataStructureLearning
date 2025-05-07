package com.cg.numberproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CreateNextPermutation {

	static void nextPermutation(int[] arr) {
		List<int[]> res = new ArrayList<int[]>();
		permutations(res, arr, 0);
		Collections.sort(res, Arrays::compare);

		for (int i = 0; i < res.size(); i++) {
			if (Arrays.equals(res.get(arr[i]), arr)) {
				if (i < res.size() - 1) {
					int[] nextPrem = res.get(i + 1);
					for (int j = 0; j < arr.length; j++) 
						arr[j] = nextPrem[j];
				}

					if (i == res.size() - 1) {
						int nextPerm[] = res.get(0);
						for (int j = 0; j < arr.length; j++) 
							arr[j] = nextPerm[j];
					}
				}
			break;
			}
		}

	static void permutations(List<int[]> res, int[] arr, int idx) {
		if (idx == arr.length - 1) {
			res.add(arr.clone());
			return;
		}

		for (int i = idx; i < arr.length; i++) {
			swap(arr, idx, i);
			permutations(res, arr, idx + 1);
			swap(arr, idx, i);
		}
	}

	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 4, 1, 7, 5, 0 };
		nextPermutation(arr);
		for (int x : arr)
			System.out.print(x + " ");
	}
}
