package com.praveen.dsalg.others;

import java.util.Scanner;

public class StringPalindromeChecker {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in);) {
			System.out.println("Input String");
			String word = scan.next();
			if (isPalindrome(word)) {
				System.out.println("Word " + word + " is a Palindrome");
			} else {
				System.out.println("Word " + word + " is not a Palindrome");
			}
		}
	}

	public static boolean isPalindrome(String word) {
		boolean isPalindrome = false;
		String reverse = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			reverse = reverse + word.charAt(i);
		}
		if (reverse.equals(word)) {
			isPalindrome = true;
		}

		return isPalindrome;

	}
}
