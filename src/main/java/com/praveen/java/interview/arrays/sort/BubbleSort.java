package com.praveen.java.interview.arrays.sort;

public class BubbleSort {

	public static void main(String[] args) {
		int[] num = { 90, 24, 46, 35, 32 };
		int temp = 0;
		// Comparison of adjacent elements and swap until the sorted order is achieved.
		for (int i = 0; i < num.length; i++) {
			int flag = 0;
			for (int j = 0; j < num.length - 1 - i; j++) {
				if (num[j] > num[j + 1]) {
					temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
					flag = 1;
				}
			}
			// This used  if the adjacent element is not having higher value then there is no need to iterate
			if (flag == 0) {
				break;
			}
		}
		// After sorting
		for (int i : num) {
			System.out.print(i+" ");
		}

	}

}
