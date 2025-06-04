package com.cg.searchingprob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class LargestKElementsInArray {

	public static void main(String[] args) {
		int[] arr = { 1, 23, 12, 9, 30, 2, 50 };
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value of K: ");
		int k = sc.nextInt();

		PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);
		for (int i = 0; i < k; i++) {
			minHeap.add(arr[i]);
		}

		for (int i = k; i < arr.length; i++) {
			if (arr[i] > minHeap.peek()) {
				minHeap.poll();
				minHeap.add(arr[i]);
			}
		}

		List<Integer> arrList = new ArrayList<Integer>();
		while (!minHeap.isEmpty()) {
			arrList.add(minHeap.poll());
		}

		Collections.reverse(arrList);
		System.out.println(arrList.toString());
	}
}
