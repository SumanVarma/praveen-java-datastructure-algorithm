package com.praveen.dsalg.others;

import java.util.Scanner;

// Fibonacci numbers 1,1,2,3,5,8,13,21....
public class FibonacciNumber {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in);) {
			System.out.println("Input Number");
			int num = scan.nextInt();
			System.out.println(fibonacci(num));
		}
	}

	public static int fibonacci(int n) {
		if (n < 2) {
			return n;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);

	}
}
