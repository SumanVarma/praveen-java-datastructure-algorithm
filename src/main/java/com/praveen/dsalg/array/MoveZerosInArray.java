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
		int index = 0;
		for (int num : nums) {
			if (num != 0) {
				nums[index++] = num;
			}
		}
		while (index < nums.length) {
			nums[index++] = 0;
		}
	}
}
