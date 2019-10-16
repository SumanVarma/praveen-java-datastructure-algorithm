package com.praveen.dsalg.string;

import java.util.HashSet;
import java.util.Scanner;

public class FirstRecurringCharacter {
	public static void main(String args[]) {
		try (Scanner scan = new Scanner(System.in);) {
			System.out.println("Input String");
			String str = "";
			str += scan.nextLine();
			char recurringChar = firstRecurringCharacterUsingHashSet(str);
			if (recurringChar != 0) {
				System.out.println(recurringChar + " is first recurring character in input string "+str);
			} else {
				System.out.println("No repeated char");
			}

		}
	}


	public static char firstRecurringCharacterUsingHashSet(String str) {
		HashSet<Character> seenCharacters = new HashSet<>();
		for (char ch : str.toCharArray()) {
			if (seenCharacters.contains(ch)) {
				return ch;
			}
			seenCharacters.add(ch);
		}
		return 0;
	}
}
