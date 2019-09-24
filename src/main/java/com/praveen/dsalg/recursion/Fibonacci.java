package com.praveen.dsalg.recursion;

import java.util.Scanner;

//0 1 1 2 3 5 8 13 21....
public class Fibonacci {
	public static void main(String args[]) throws Exception {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number for finding factorial of it");
		int num = s.nextInt();
		System.out.println("Number at Position "+num+ " is "+ fibonacci(num));
		s.close();
	}

	private static int fibonacci(int num) throws Exception {

		if (num < 1) {
			throw new Exception("Please provide number greater than zero");
		}

		if (num <= 1 || num <= 2) {
			return num - 1;
		} else {
			return fibonacci(num - 1) + fibonacci(num - 2);
		}

	}
}
