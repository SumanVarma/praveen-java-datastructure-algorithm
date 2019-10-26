package com.praveen.dsalg.array;

public class TwoDimensionalArray {
	public static void main(String[] args) {
		// declaration,creation and initialization
		int[][] num = { { 90, 24, 46 }, { 35, 32, 12 } };
		System.out.println(num);
		int sum = 0;
		// Retrieval
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.print(num[i][j] + " ");
				sum += num[i][j];
			}
			System.out.println();
		}
		// Sum of all elements present in Two Dimensional Array
		System.out.println("sum is " + sum);

		// The above 2 Dimensional Array is also called Matrix Array as the rows and
		// columns are fixed

	}
}
