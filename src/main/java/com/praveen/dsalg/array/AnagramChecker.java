package com.praveen.dsalg.array;

import java.util.Scanner;

// Check if Two Strings Are Anagram
//An anagram is a word which is formed by rearranging or shuffling of letters in another word, the most important property 
//in Anagram is that all the letters have to be used only once. For example, abcd and dcba (or) abcd and cabd  (or) abcd and abdc are Anagrams
// Example like LISTEN and SILENT (or) TRAINGLE and INTEGRAL are Anagrams
public class AnagramChecker {
	public static void main(String args[]) {
		try (Scanner scan = new Scanner(System.in);) {
			System.out.println("Input First String");
			String a = scan.next();
			System.out.println("Input Second String");
			String b = scan.next();
			boolean ret = isAnagram(a, b);
			System.out.println((ret) ? "Anagrams" : "Not Anagrams");
		}
	}

	static boolean isAnagram(String a, String b) {
		if (a.length() != b.length()) {
			return false;
		} else {
			for (int i = 0; i < a.length(); i++) {
				char ch = a.toLowerCase().charAt(i);
				b = b.toLowerCase();
				if (b.indexOf(ch) != -1) {
					b = b.replaceFirst(ch + "", "");
				} else {
					return false;
				}
			}
			return b.length() == 0;
		}
	}

}
