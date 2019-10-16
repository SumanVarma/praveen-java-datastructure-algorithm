package com.praveen.dsalg.array;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

/*
 * Find the kth largest element in an unsorted array. Note that it is the kth largest element in the sorted order, not the kth distinct element.
Example 1:

Input: [3,2,1,5,6,4] and k = 2
Output: 5
Example 2:

Input: [3,2,3,1,2,4,5,5,6] and k = 4
Output: 4
Note:
You may assume k is always valid, 1 ≤ k ≤ array's length.
 */
public class KthLargestInAnArray {

	public static void main(String[] args) {
		List<Integer> ints = Arrays.asList(3,2,3,1,2,4,5,5,6);
		int k = 4;

		System.out.println("K'th largest element in the array is " + FindKthLargest(ints, k));
	}

	public static int FindKthLargest(List<Integer> ints, int k) {
		// create an min-heap using PriorityQueue class and insert
		// first k elements of the array into the heap
		PriorityQueue<Integer> pq = new PriorityQueue<>(ints.subList(0, k));

		// do for remaining array elements
		for (int i = k; i < ints.size(); i++) {
			// if current element is more than the root of the heap
			if (ints.get(i) > pq.peek()) {
				// replace root with the current element
				pq.poll();
				pq.add(ints.get(i));
			}
		}

		// return the root of min-heap
		return pq.peek();
	}

}
