package com.praveen.dsalg.array;

public class JaggedArray {
	public static void main(String[] args) {
		// Lets see Jagged Array, the rows are fixed but column is variable

		int[][] num1 = new int[5][];
		System.out.println(num1);
		for (int i = 0; i < num1.length; i++) {
			num1[i] = new int[i + 1];
		}
		// Initializing array
		int count = 0;
		for (int i = 0; i < num1.length; i++) {
			for (int j = 0; j < num1[i].length; j++) {
				num1[i][j] = count++;
			}
		}

		// Displaying the values of 2D Jagged array
		for (int i = 0; i < num1.length; i++) {
			for (int j = 0; j < num1[i].length; j++) {
				System.out.print(num1[i][j] + " ");
			}
			System.out.println();
		}

	}
}
