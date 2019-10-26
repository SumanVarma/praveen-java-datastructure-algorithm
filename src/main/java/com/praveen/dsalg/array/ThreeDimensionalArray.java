package com.praveen.dsalg.array;

public class ThreeDimensionalArray {

	public static void main(String[] args) {
		// declaration,creation and intialization
		int[][][] num = { { { 90, 24, 46 }, { 35, 32, 12 }, { 98, 2 } } };
		System.out.println(num);
		int sum=0;
		// Retrieval
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				for (int k = 0; k < num[i][j].length; k++) {
					System.out.print(num[i][j][k] + " ");
					sum+=num[i][j][k];
				}
				System.out.println();
			}
		}
		// sum of all the elements present in 3 Dimensional Array
		System.out.println("sum is "+sum);
	}

}
