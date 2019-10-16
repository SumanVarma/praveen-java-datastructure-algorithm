package com.praveen.dsalg.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

//Find duplicate characters in a String and count the number of occurences
public class DuplicateCharacters {

	public static void main(String args[]) {
		try (Scanner scan = new Scanner(System.in);) {
			System.out.println("Input String");
			String str = "";
			str += scan.nextLine();
			System.out.println("Duplicate characters in String " + str + " are : " + "\n");
			withoutUsingInBuiltMethods(str.replaceAll("\\s", ""));
			System.out.println("\n");
			usingHashMap(str.replaceAll("\\s", ""));
			System.out.println("\n");
			usingJava8(str.replaceAll("\\s", ""));

		}

	}

	static void withoutUsingInBuiltMethods(String str) {
		System.out.println("WithoutUsingInBuiltMehods");
		int count[] = new int[256];
		int len = str.length();

		for (int i = 0; i < len; i++)
			count[str.charAt(i)]++;

		char ch[] = new char[str.length()];
		for (int i = 0; i < len; i++) {
			ch[i] = str.charAt(i);
			int find = 0;
			for (int j = 0; j <= i; j++) {

				if (str.charAt(i) == ch[j]) {
					find++;
				}
			}

			if (find == 1) {
				System.out.print(str.charAt(i) + "=" + count[str.charAt(i)] + " ");
			}
		}
	}

	static void usingHashMap(String str) {
		System.out.println("Using HashMap");
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		System.out.println(map);
	}

	static void usingJava8(String str) {
		System.out.println("Using Java8");
		System.out.println(str.chars().mapToObj(i -> (char) i)
				.collect(Collectors.groupingBy(Object::toString, Collectors.counting())));
	}

}
