package com.praveen.java.others;

import java.io.FileNotFoundException;
import java.io.IOException;

// Method Overriding will come up while using inheritance and parent & subclass needs to have same method name and arguments with covariant return types and
// with same access or higher level access in subclass as that of super class. 
// This is also called as runtime polymorphism or dynamic binding
public class MethodOverriding {

	public static void main(String[] args) throws Exception {

		// overriding methods with same signature with constructors
		A a = new A();
		a.display(); // Constructor A Display A
		B b = new B();
		b.display(); // Constructor A Constructor B Display B
		A ab = new B();
		ab.display();// Constructor A Constructor B Display B

		// access modifiers
		// You will not be able to override showMessage method present in Super Class A
		// as it is private but you can override
		// a) if super class has public then sub class also needs to be public as we get
		// compile timer error as can't reduce the visibility
		// b) if super class has protected then sub class can have protected or public
		// as we get compile timer error as can't reduce the visibility
		// c) if super class has default then sub class can have default or protected or
		// public
		a.showMessage1("Show Message"); // A Show Message
		b.showMessage1("Show Message"); // B Show Message
		ab.showMessage1("Show Message"); // B Show Message

		// static methods
		// You will not be able to override a static method as it is at class level, we
		// can override only if it is at instance level
		// Keep in mind the below calls are not related to method overriding where as it
		// is called as method hiding.
		A a1 = null;
		a1.display1(); // Display1 A // It will not throw an NPE where as compiler will replace a1
						// reference with class name A
		B.display1(); // Display1 B
		ab.display1(); // Display1 A // Method overriding is related to only instance methods where as
						// here compiler will replace ab reference with class name A

		// member variables
        System.out.println(a.name); // A
        System.out.println(b.name); // B
        System.out.println(ab.name); // A // Member variables can't be overriden as member variables resolve at compile time and methods at runtime.
        
        // Exception Handling
        // While Overriding methods we can compress the scope of checked exception but we cant widen it 
        // also you cannot throw any other checked exception which is not being thrown by parent class method
        // Otherwise it throws an Compile time error saying B is not compatible with throws Clause of A
        a.print(); // Print A
        b.print(); // Print B
        ab.print(); // Print B
        // For an overriden method there are no restrictions with any type of unchecked Exception
        
        a.print1(); // Print A
        b.print1(); // Print B
        ab.print1(); // Print B
        
        // Return type
        // While overriding methods we can have co-variant return type, i.e.. here Number is a parent class for Integer
       System.out.println(a.test()); // Test A 
                                     //  0
       System.out.println(b.test()); // Test B 
                                     //  0
       System.out.println(ab.test()); // Test B 
                                      //  0
       // Method Parameters
       // Method overriding will be considered only for same method paramters
       a.test1(0); // Test1 A
       b.test1(0); // Test1 B
       ab.test1(0); // Test1 A
       
       
       
	}

}

class A {

	public String name = "A";

	A() {
		System.out.println("Constructor A");
	}

	public void display() {
		System.out.println("Display A");
	}

	private void showMessage(String message) {
		System.out.println("A " + message);
	}

	void showMessage1(String message) {
		System.out.println("A " + message);
	}

	static void display1() {
		System.out.println("Display1 A");
	}
	
	void print() throws IOException{
		System.out.println("Print A");
	}
	
	void print1() throws ArithmeticException{
		System.out.println("Print1 A");
	}
	
	public Number test() {
		System.out.println("Test A");
		return 0;
	}
	
	public void test1(Number n) {
		System.out.println("Test1 A");
	}

}

class B extends A {
	public String name = "B";

	B() {
		System.out.println("Constructor B");
	}

	public void display() {
		System.out.println("Display B");
	}

	public void showMessage(String message) {
		System.out.println("B " + message);
	}

	protected void showMessage1(String message) {
		System.out.println("B " + message);
	}

	static void display1() {
		System.out.println("Display1 B");
	}
	
	void print() throws FileNotFoundException{
		System.out.println("Print B");
	}
	
	void print1() throws RuntimeException{
		System.out.println("Print1 B");
	}
	
	public Integer test() {
		System.out.println("Test B");
		return 0;
	}
	
	public void test1(Integer n) {
		System.out.println("Test1 B");
	}
}