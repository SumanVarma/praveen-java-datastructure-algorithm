package com.praveen.dsalg.array.search;

public class LinearSearch {

	public static void main(String[] args) {
		int[] num = { 90, 24, 46, 35, 32 };
		int item=32;
        int temp=0;
		for(int i=0;i<num.length;i++) {
			if(num[i]==item) {
				System.out.println("Item "+item +" present at index position "+ i);
				temp=temp+1;
			}
		}
		if(temp==0) {
			System.out.println("Item "+item +" not found");
		}
	}

}
