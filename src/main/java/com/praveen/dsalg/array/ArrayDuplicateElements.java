package com.praveen.dsalg.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ArrayDuplicateElements {

	public static void main(String[] args) {
		int[] num = { 90, 24, 46, 35, 32, 12, 98, 2, 90, 16, 24, 30, 32 };

		System.out.println("Duplicate Elements using brute force method are ");
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] == num[j] && i != j) {
					System.out.print(num[j] + " ");
				}
			}
		}

		System.out.println("\nDuplicate Elements using HashSet are ");
		Set<Integer> hs = new HashSet<Integer>();
		for (int i : num) {
			if (hs.add(i) == false) {
				System.out.print(i + " ");
			}
		}

		System.out.println("\nDuplicate Elements using HashMap are ");
		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i : num) {
			Integer count = hm.get(i);
			if (count == null) {
				hm.put(i, 1);
			} else {
				count = count + 1;
				hm.put(i, count);
			}
		}
		Set<Map.Entry<Integer, Integer>> es = hm.entrySet();
		for(Map.Entry<Integer, Integer> me:es) {
			if(me.getValue()>1) {
				System.out.print(me.getKey()+" ");
			}
		}

	}

}
