package com.praveen.dsalg.array.sort;

public class HeapSort {

	public static void main(String[] args) {
		int[] num = { 90, 24, 46, 35, 32 };
		heapSort(num);
		// After sorting
		for (int i : num) {
			System.out.print(i + " ");
		}
	}

	private static void heapSort(int[] num) {
		int len = num.length;
		for (int i = len / 2 - 1; i >= 0; i--) {
			heapify(num, len, i);
		}

		// swap the elements and heapify again
		for (int i = len - 1; i >= 0; i--) {
			int temp = num[0];
			num[0] = num[i];
			num[i] = temp;
			heapify(num, i, 0);
		}
	}

	private static void heapify(int[] num, int len, int i) {
		int largest = i; // parent node index position
		int li = 2 * i + 1; // left child node index position
		int ri = 2 * i + 2; // right child node index position
		if (li < len && num[li] > num[largest]) {
			largest = li;
		}
		if (ri < len && num[ri] > num[largest]) {
			largest = ri;
		}
		if (largest != i) {
			int temp = num[i];
			num[i] = num[largest];
			num[largest] = temp;
			heapify(num, len, largest);
		}
	}
}
