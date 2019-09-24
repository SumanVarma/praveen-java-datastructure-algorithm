package com.praveen.dsalg.recursion;

import java.util.Scanner;

public class Factorial {

	 public static void main(String args[]) {
		 Scanner s= new Scanner(System.in);
		 System.out.println("Enter number for finding factorial of it");
		 int num=s.nextInt();		 
		 System.out.println(factorial(num));
		 s.close();
	 }

	private static int factorial(int num) {
		if(num==0) {
			return 1;
		}else {
			return num*factorial(num-1);
		}
	}
}
