package com.cg.hashingprob;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class ItineraryFromAGivenListOfTickets {

	static void dfsTopologicalSorting(String v, Map<String, String> map, Map<String, Integer> visited,
			Stack<String> st) {
		visited.put(v, 1);

		if (map.containsKey(v) && visited.getOrDefault(map.get(v), 0) == 0)
			dfsTopologicalSorting(map.get(v), map, visited, st);

		if (!v.isEmpty())
			st.push(v);
	}

	static List<String> topologicalSort(Map<String, String> map) {
		int V = map.size();

		Stack<String> st = new Stack<String>();
		Map<String, Integer> visited = new HashMap<String, Integer>();

		for (String i : map.keySet()) {
			if (visited.getOrDefault(i, 0) == 0)
				dfsTopologicalSorting(i, map, visited, st);
		}

		List<String> ans = new ArrayList<String>();
		while (!st.isEmpty())
			ans.add(st.pop());

		return ans;
	}

	static List<List<String>> findItinerary(List<List<String>> arr) {
		Map<String, String> map = new HashMap<String, String>();

		for (List<String> i : arr) {
			map.put(i.get(0), i.get(1));
		}

		List<String> res = topologicalSort(map);

		List<List<String>> ans = new ArrayList<List<String>>();

		for (int i = 0; i < res.size() - 1; i++) {
			ans.add(Arrays.asList(res.get(i), res.get(i + 1)));
		}
		return ans;
	}

	public static void main(String[] args) {
		List<List<String>> arr = Arrays.asList(Arrays.asList("Chennai", "Bangalore"), Arrays.asList("Bombay", "Delhi"),
				Arrays.asList("Goa", "Chennai"), Arrays.asList("Delhi", "Goa"));

		List<List<String>> res = findItinerary(arr);
		for (List<String> i : res)
			System.out.println(i.get(0) + "->" + i.get(1));
	}

}
