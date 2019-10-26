package com.praveen.dsalg.array;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		// declaration and creation	
		int[] a = new int[8];
		// As there are no values initialized, default value of int is 0 and for string it is null
		System.out.println(a);
		//retrieval
		for(int i: a) {
			System.out.println(i); 
		}
		// declaration,creation and initialization
		int[] num= {90,24,46,35,32,12,98,2};		
		System.out.println(num);
		int sum=0;
		// retrieval
		for(int i: num) {
			System.out.println(i);
			sum+=i;
		}
		// sum of elements present in single dimensional Array
		System.out.println("sum is "+ sum);
	}
}
