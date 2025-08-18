package com.cg.hashingprob;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindEmployeesUnderManagers {

	static int findEmployees(Map<String, List<String>> dataSet, Map<String, Integer> result, String manager) {

		if (result.get(manager) != -1)
			return result.get(manager);

		if (!dataSet.containsKey(manager)) {
			result.put(manager, 0);
			return 0;
		}

		int count = 0;
		for (String i : dataSet.get(manager)) {
			if (result.get(i) != -1)
				count += result.get(i);
			else {
				result.put(i, findEmployees(dataSet, result, i));
				count += result.get(i);
			}
		}
		result.put(manager, count + dataSet.get(manager).size());
		return result.get(manager);
	}

	static List<Map.Entry<String, Integer>> findCount(List<List<String>> arr) {
		Map<String, List<String>> dataSet = new HashMap<String, List<String>>();

		Map<String, Integer> result = new HashMap<String, Integer>();
		for (List<String> i : arr) {
			if (i.get(1).equals(i.get(0)))
				continue;

			dataSet.putIfAbsent(i.get(1), new ArrayList<String>());
			dataSet.get(i.get(1)).add(i.get(0));

			result.put(i.get(0), -1);
			result.put(i.get(1), -1);
		}

		for (Map.Entry<String, Integer> i : result.entrySet()) {
			if (i.getValue() == -1)
				findEmployees(dataSet, result, i.getKey());
		}

		List<Map.Entry<String, Integer>> res = new ArrayList<Map.Entry<String, Integer>>(result.entrySet());

		res.sort(Map.Entry.comparingByKey());
		return res;
	}

	public static void main(String[] args) {
		List<List<String>> arr = Arrays.asList(Arrays.asList("A", "C"), Arrays.asList("B", "C"),
				Arrays.asList("C", "F"), Arrays.asList("D", "E"), Arrays.asList("E", "F"), Arrays.asList("F", "F"));

		List<Map.Entry<String, Integer>> result = findCount(arr);

		for (Map.Entry<String, Integer> i : result)
			System.out.println(i.getKey() + ": " + i.getValue());
	}
}
