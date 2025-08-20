package com.cg.hashingprob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class DatastructuresThatSupportsInsertDeleteSearchAndGetRandomApplications {

	List<Integer> arr = new ArrayList<>();
	Map<Integer, Integer> map = new HashMap<Integer, Integer>();

	public void insert(int x) {
		if (!map.containsKey(x)) {
			int index = arr.size();
			arr.add(x);
			map.put(x, index);
		}
	}

	public void remove(int x) {

		if (map.containsKey(x)) {
			int index = map.get(x);
			map.remove(x);
			if (index != arr.size() - 1) {
				int last = arr.size() - 1;
				Collections.swap(arr, index, last);
				if (last != index)
					map.put(arr.get(index), index);
			}
			arr.remove(arr.size() - 1);
		}
	}

	public int search(int x) {
		return map.getOrDefault(x, -1);
	}

	public int getRandom() {
		Random rand = new Random();
		int randomNumber = rand.nextInt(arr.size());
		return arr.get(randomNumber);
	}

	public static void main(String[] args) {
		DatastructuresThatSupportsInsertDeleteSearchAndGetRandomApplications dataAndGetRandomApplications = new DatastructuresThatSupportsInsertDeleteSearchAndGetRandomApplications();
		dataAndGetRandomApplications.insert(10);
		dataAndGetRandomApplications.insert(20);
		dataAndGetRandomApplications.insert(30);
		dataAndGetRandomApplications.insert(40);
		System.out.println(dataAndGetRandomApplications.search(30));
		dataAndGetRandomApplications.remove(40);
		dataAndGetRandomApplications.insert(50);
		System.out.println(dataAndGetRandomApplications.search(50));
		System.out.println(dataAndGetRandomApplications.getRandom());

	}

}
