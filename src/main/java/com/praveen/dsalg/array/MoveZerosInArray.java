package com.praveen.dsalg.array;

import java.util.Arrays;

// Move the 0 in the array to the end
public class MoveZerosInArray {

	public static void main(String[] args) {
		int[] nums = { 1, 0, 2, 5, 6, 0, 9, 8 };
		moveZeroes(nums);
		System.out.println(Arrays.toString(nums));

	}

	private static void moveZeroes(int[] nums) {
		int idx = 0;
		for (int num : nums) {
			if (num != 0) {
				nums[idx++] = num;
			}
		}
		while (idx < nums.length) {
			nums[idx++] = 0;
		}
	}
}
