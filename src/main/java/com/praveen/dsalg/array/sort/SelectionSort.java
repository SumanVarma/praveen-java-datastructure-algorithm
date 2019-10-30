package com.praveen.dsalg.array.sort;

// Selection sort is combination of searching and sorting.
// It sorts the array by repeatedly finding the minimum element from unsorted part and putting it at the beginning until the sorting is achieved.
public class SelectionSort {

	public static void main(String[] args) {
		int[] num = { 90, 24, 46, 35, 32 };
		int min, temp = 0;
		for (int i = 0; i < num.length; i++) {
			min = i;
			for (int j = i + 1; j < num.length; j++) {
				if (num[j] < num[min]) {
					min = j;
				}
			}
			temp = num[i];
			num[i] = num[min];
			num[min] = temp;
		}
		// After sorting
		for (int i : num) {
			System.out.print(i + " ");
		}
	}
}
