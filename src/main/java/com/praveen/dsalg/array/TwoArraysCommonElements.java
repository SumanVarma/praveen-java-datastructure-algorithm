package com.praveen.dsalg.array;

public class TwoArraysCommonElements {

	public static void main(String[] args) {
		int[] num1= { 90, 24, 46, 35, 32, 12, 98, 2 };
		int[] num2= { 32, 98, 86, 65, 90, 91, 24, 2 };
		System.out.println("Common Elements between two Arrays are ");
		for(int i=0;i<num1.length;i++) {
			for(int j=0;j<num2.length;j++) {
				if(num1[i]==num2[j]) {
					System.out.print(num1[i]+" ");
				}
			}
		}

	}

}
