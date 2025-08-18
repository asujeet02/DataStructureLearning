package com.cg.hashingprob;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ItineraryFromAGivenListOfTicketsUsingHashMap {

	public static void main(String[] args) {
		List<List<String>> arr = Arrays.asList(Arrays.asList("Chennai", "Bangalore"), Arrays.asList("Bombay", "Delhi"),
				Arrays.asList("Goa", "Chennai"), Arrays.asList("Delhi", "Goa"));

		Map<String, String> dataSet = new HashMap<String, String>();
		for (List<String> i : arr)
			dataSet.put(i.get(0), i.get(1));

		Map<String, String> reverseMap = new HashMap<String, String>();
		for (List<String> i : arr)
			reverseMap.put(i.get(1), i.get(0));

		String start = "";
		for (int i = 0; i < arr.size(); i++)
			if (!reverseMap.containsKey(arr.get(i).get(0))) {
				start = arr.get(i).get(0);
				break;
			}

		List<List<String>> ans = new ArrayList<List<String>>();

		String current = start;
		while (dataSet.containsKey(current)) {
			List<String> temp = new ArrayList<String>();
			temp.add(current);
			temp.add(dataSet.get(current));
			ans.add(temp);
			current = dataSet.get(current);
		}

		for (List<String> i : ans)
			System.out.println(i.get(0) + "->" + i.get(1));
	}

}
