package com.cg.interface1;

import java.util.Arrays;

public class ComparableInterface implements Comparable<ComparableInterface> {
	private int v;

	public ComparableInterface(int v) {
		super();
		this.v = v;
	}

	@Override
	public String toString() {
		return String.valueOf(v);
	}

	@Override
	public int compareTo(ComparableInterface o) {
		return o.v - this.v;
	}

	public static void main(String[] args) {
		ComparableInterface[] n = { new ComparableInterface(4), new ComparableInterface(1), new ComparableInterface(7),
				new ComparableInterface(5) };

		Arrays.sort(n);

		for (ComparableInterface x : n)
			System.out.print(x.v + " ");
	}
}
