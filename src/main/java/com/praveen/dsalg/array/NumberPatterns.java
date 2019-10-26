package com.praveen.dsalg.array;

public class NumberPatterns {

	public static void main(String[] args) {
	   // First Pattern
		/*	1
			22
			333
			4444
		*/
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		// Second Pattern
			
		/*		1
				23
				456
				78910
		*/
		
		int count=0;
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				count=count+1;
				System.out.print(count);
			}
			System.out.println();
		}
		
		// Third Pattern
			
		/*	1
			21
			321
			4321
		*/
		for(int i = 1; i <= 4; i++) {
			for (int j = i; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		// Fourth Pattern
			
		/*	1
			121
			12321
			1234321
		*/	
		for(int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			for (int k = i-1; k >= 1; k--) {
				System.out.print(k);
			}
			System.out.println();
		}
	
		// Fifth Pattern
		
		/*	4321
			432
			43
			4
		*/		
		for(int i = 1; i <= 4; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print(j);
			}
			System.out.println();
		}	
		
	}

}
