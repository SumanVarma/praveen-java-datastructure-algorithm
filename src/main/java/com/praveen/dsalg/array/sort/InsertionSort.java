package com.praveen.dsalg.array.sort;

//Insertion sort is a simple sorting algorithm that works the way we sort playing cards in our hand.We choose one card and insert in its position.
//This is useful only for sorting small set of elements.
//Pick element  and insert it into sorted sequence 
public class InsertionSort {
	public static void main(String[] args) {
		int[] num = { 90, 24, 46, 35, 32 };
		int temp, j;
		for (int i = 1; i < num.length; i++) {
			temp = num[i];
			j = i;
			while (j > 0 && num[j - 1] > temp) {
				num[j] = num[j - 1];
				j = j - 1;
			}
			num[j] = temp;
		}
		// After sorting
		for (int i : num) {
			System.out.print(i + " ");
		}
	}
}
