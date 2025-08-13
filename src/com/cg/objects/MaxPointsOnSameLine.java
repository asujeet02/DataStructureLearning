package com.cg.objects;

import java.util.HashMap;

public class MaxPointsOnSameLine {

	static int N = 6;

	static int gcd(int p, int q) {
		if (q == 0)
			return p;

		int r = p % q;
		return gcd(q, r);
	}

	public static void main(String[] args) {
		int[][] points = { { -1, 1 }, { 0, 0 }, { 1, 1 }, { 2, 2 }, { 3, 3 }, { 3, 4 } };
		int curMax, overlapPoints, verticalPoints;

		if (N < 2)
			System.out.println(N);

		int maxPoint = 0;

		HashMap<String, Integer> slopeMap = new HashMap<String, Integer>();

		for (int i = 0; i < N; i++) {
			curMax = overlapPoints = verticalPoints = 0;

			for (int j = i + 1; j < N; j++) {
				if (points[i][0] == points[j][0] && points[i][1] == points[j][1])
					overlapPoints++;

				else if (points[i][0] == points[j][0])
					verticalPoints++;

				else {
					int yDif = points[j][1] - points[i][1];
					int xDif = points[j][0] - points[i][0];
					int g = gcd(xDif, yDif);

					xDif /= g;
					yDif /= g;

					String pair = (yDif) + " " + (xDif);
					if (!slopeMap.containsKey(pair))
						slopeMap.put(pair, 0);

					slopeMap.put(pair, slopeMap.get(pair) + 1);
					curMax = Math.max(curMax, slopeMap.get(pair));
				}
				curMax = Math.max(curMax, verticalPoints);
			}
			maxPoint = Math.max(maxPoint, curMax + overlapPoints + 1);
			slopeMap.clear();
		}
		System.out.println(maxPoint);
	}

}
