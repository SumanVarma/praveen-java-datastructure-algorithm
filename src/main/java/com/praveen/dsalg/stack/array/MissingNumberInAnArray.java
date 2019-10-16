package com.praveen.dsalg.stack.array;

public class MissingNumberInAnArray {
	public static int getMissingNumber(int numbers[], int n) {
		int expectedSum = n * (n + 1) / 2;
		int actualSum = 0;

		for (int number : numbers) {
			actualSum = actualSum + number;
		}
		int missingNo = expectedSum - actualSum;
		return missingNo;
	}

	public static void main(String[] args) {
		int numArray1[] = { 6, 3, 2, 4, 1, 7, 5, 10, 8 };
		int finalNumber1 = 10;
		int missingNumber1 = getMissingNumber(numArray1, finalNumber1);
		System.out.println("Output 1: " + missingNumber1);

		int numArray2[] = { 2, 3, 1, 5 };
		int finalNumber2 = 5;
		int missingNumber2 = getMissingNumber(numArray2, finalNumber2);
		System.out.println("Output 2: " + missingNumber2);
	}
}
