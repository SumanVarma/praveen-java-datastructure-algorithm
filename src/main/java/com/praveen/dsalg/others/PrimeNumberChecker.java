package com.praveen.dsalg.others;

import java.util.Scanner;

// Prime Number Checker
// Any number that is only divisible by 1 other than itself is known as a primary number
//3, 5, 23, 47, 241, 1009 are all examples of prime numbers. 
//While 0 and 1 can’t qualify for being a prime number, 2 is the only even prime number in the entire infinitely long set of prime numbers.
public class PrimeNumberChecker {
	public static void main(String args[]) {
		try (Scanner scan = new Scanner(System.in);) {
			System.out.println("Input String");
			int num = scan.nextInt();
			if (isPrime(num)) {
				System.out.println(num + " is a prime number.");
			} else {
				System.out.println(num + " is not a prime number.");
			}

		}
	}

	public static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i < Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
