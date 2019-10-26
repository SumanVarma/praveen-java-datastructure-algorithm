package com.praveen.dsalg.others;

public class SwapTwoNumbers {
	public static void main(String args[]) {
		swapUsingTemp(4, 5);
		swapWithoutTemp(4, 5);
	}

	public static void swapUsingTemp(int num1, int num2) {
		System.out.println(" swapUsingTemp Method Entry");
		int temp = 0;
		System.out.println("Before Swapping :" + " num1 is " + num1 + " num2 is " + num2);
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("After Swapping :" + " num1 is " + num1 + " num2 is " + num2);
		System.out.println(" swapUsingTemp Method Exit");

	}

	public static void swapWithoutTemp(int num1, int num2) {
		System.out.println(" swapWithoutTemp Method Entry");
		System.out.println("Before Swapping :" + " num1 is " + num1 + " num2 is " + num2);
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("After Swapping :" + " num1 is " + num1 + " num2 is " + num2);
		System.out.println(" swapWithoutTemp Method Exit");

	}
}
