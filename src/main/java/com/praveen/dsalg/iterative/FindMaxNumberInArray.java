package com.praveen.dsalg.iterative;

public class FindMaxNumberInArray {

	public static void main(String[] args) {
		int[] num = { 90, 24, 46, 35, 32, 12, 98, 2 };
		int max = num[0]; // O(1)

		for (int i = 1; i < num.length - 1; i++) { // O(n)
			if (num[i] > max) { // O(1)
				max = num[i]; // O(1)
			}
		}
		System.out.println("Max Element is " + max);

		// Using recursive
		System.out.println(findMaxNumberInArray(num, num.length - 1));
	}

	// Time Complexity : O(1)+O(n)+O(1) = O(n)

	public static int findMaxNumberInArray(int[] num, int length) {
		int max = Integer.MIN_VALUE;

		if (length == -1) {
			return max;
		} else {

			if (num[length] > max)
				max = num[length];
			return findMaxNumberInArray(num, length - 1);

		}
	}

}
