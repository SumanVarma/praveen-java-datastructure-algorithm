package com.praveen.dsalg.others;

import java.util.Scanner;

public class NumberPalindromeChecker {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in);) {
			System.out.println("Input Number");
			int num = scan.nextInt();
			if (isPalindrome(num)) {
				System.out.println("Number =" + num + " is a Palindrome number");
			} else {
				System.out.println("Number =" + num + " is a Palindrome number");
			}
		}
	}

	public static int reverse(int num) {
		int reverseNo = 0;
		while (num != 0) {
			reverseNo = (reverseNo * 10) + (num % 10);
			num = num / 10;
		}
		return reverseNo;
	}

	public static boolean isPalindrome(int num) {
		if (reverse(num) == num) {
			return true;
		}
		return false;
	}
}
