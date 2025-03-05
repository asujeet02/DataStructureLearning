package com.cg.arrays;

import java.util.Scanner;

public class IthRowJaggedArray {

	public static void main(String[] args) {

		System.out.println("Enter the size of Jagged Array!");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		int arr[][] = new int[size][];

		for (int i = 0; i < arr.length; i++)
			arr[i] = new int[i + 1];

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = count++;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}
