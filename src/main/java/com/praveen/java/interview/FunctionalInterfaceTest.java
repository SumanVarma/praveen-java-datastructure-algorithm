package com.praveen.java.interview;

import java.util.Optional;
import java.util.function.Predicate;

public class FunctionalInterfaceTest implements Interface1, Interface2 {

	@Override
	public void print() {
		System.out.println("Print");
	}

	@Override
	public void show() {
		System.out.println("Show");
	}
		
	@Override
	public void display() {
		System.out.println("Class Display");
	}
	
	public static void main(String[] args) {
		
		
		Predicate<String> containsLetterP = s -> s.contains("P");
		if(containsLetterP.test("Praveen")) {
			System.out.println("This is Praveen");
		}else {
			System.out.println("No name");
		}
		
		Integer[] numArray= new Integer[5];
	    // System.out.println(numArray[3].toString()); // It throws java.lang.NullPointerException
	    Optional <Integer>optional = Optional.ofNullable(numArray[3]);	    
	    if(optional.isPresent()) {
	        System.out.println(optional.get());
	    }
	}

}

@FunctionalInterface
interface Interface1 {
	void show();

	default void display() {
		System.out.println("Interface1 Display");
	}
	static void display1() {
		System.out.println("Interface1 Display1");
	}
}

@FunctionalInterface
interface Interface2 {
	void print();

	default void display() {
		System.out.println("Interface2 Display");
	}
	
	static void display1() {
		System.out.println("Interface2 Display1");
	}
}