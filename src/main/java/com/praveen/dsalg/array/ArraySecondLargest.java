package com.praveen.dsalg.array;

public class ArraySecondLargest {

	public static void main(String[] args) {
		int[] num = { 90, 24, 46, 35, 32, 12, 98, 2 };
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		for (int i = 0; i < num.length; i++) {
			if (num[i] > largest) {
				secondLargest = largest;
				largest = num[i];
			} else if (num[i] > secondLargest && num[i] != largest) {
				secondLargest = num[i];
			}

		}
		
		System.out.println("Second Largest Element "+ secondLargest);
	}

}
