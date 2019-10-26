package com.praveen.dsalg.array;

public class ArrayMaxMin {
	public static void main(String[] args) {
		int[] num = { 90, 24, 46, 35, 32, 12, 98, 2 };
		int max = num[0];
		int min = num[1];

		for (int i = 0; i < num.length; i++) {
			if (num[i] > max) {
				max = num[i];
			} else if (num[i] < min) {
				min = num[i];
			}
		}

		System.out.println("Max Element is " + max);
		System.out.println("Min Element is " + min);
	}
}
