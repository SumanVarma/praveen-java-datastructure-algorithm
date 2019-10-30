package com.praveen.dsalg.others;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharactersInAString {

	private static void usingArrays(String s) {
		char ch;
		String sLower = s.toLowerCase();
		for (char c = 'A'; c <= 'z'; c++) {
			int count = 0;
			for (int j = 0; j < s.length(); j++) {
				ch = sLower.charAt(j);
				if (ch == c) {
					count++;
				}
			}
			if (count > 0) {
				System.out.print(c + "" + count+" ");
			}
		}
	}

	private static void usingHashMap(String s) {
		HashMap<Character, Integer> charCountMap = new HashMap<>();
		String sLower = s.toLowerCase();
		char[] charArray = sLower.toCharArray();
		for (char c : charArray) {
			if (charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {
				charCountMap.put(c, 1);
			}
		}
		for (Map.Entry entry : charCountMap.entrySet()) {
			System.out.print(entry.getKey() + "" + entry.getValue()+" ");
		}
	}

	public static void main(String args[]) {
		usingArrays("praveenoruganti");
		System.out.println();
		usingHashMap("praveenoruganti");
	}
}
