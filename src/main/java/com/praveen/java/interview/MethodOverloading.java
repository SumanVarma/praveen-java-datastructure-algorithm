package com.praveen.java.interview;

// Method Overloading will come up in the same class and it must have same method name and different parameters
//(either number of parameters or different type parameters)
// This is also called as compile time polymorphism or static binding i.e.. method calls are resolved at compile time
public class MethodOverloading {

	public static void main(String[] args) {
		C c= new C();
		c.display(1); // int // It displays as per the hirerachy i.e.. int -> float -> double -> Wrapper Class -> Number
		c.display("Praveen"); // Praveen
		c.display("Praveen",1); // Praveen 1
		
		D d= new D();
		// d.display(1); // It gives a compile time error as JVM can't downcast from int to bye itself. 
		
		E e= new E();
		//e.display(null); // It gives a compile time error i.e.. ambiguity error as JVM not able to decide which method to call
		F f= new F();
		f.display(null); // Integer // Integer is a child class of Number so priority is given to child class
		
		// same methods with different return type
		
		// If you see the class G - i am having two display methods with different return type  and it throws compile time error as duplicate method
	}

}

class G{
//	void display(Number number) {
//		System.out.println("Number");
//	}
//	
//	int display(Number number) {
//		System.out.println("Number");
//		return number;
//	}
}

class F{
	
	void display(Number number) {
		System.out.println("Number");
	}
	
	void display(Integer number) {
		System.out.println("Integer");
	}
}

class E{
	
	void display(String number) {
		System.out.println("String");
	}
	void display(Long number) {
		System.out.println("Long");
	}
	
	void display(Integer number) {
		System.out.println("Long");
	}
}

class D{
	void display(byte b) {
		System.out.println("byte");
	}
	void display(short b) {
		System.out.println("short");
	}
}


class C{
	
	void display(int a) {
		System.out.println("int");
	}
	
	void display(String a) {
		System.out.println(a);
	}
	
	void display(String a, int b) {
		System.out.println(a+" "+b);
	}
	
	void display(double b) {
		System.out.println("double");
	}
	void display(float b) {
		System.out.println("float");
	}
	
	void display(Integer b) {
		System.out.println("Integer");
	}
	
	void display(Double b) {
		System.out.println("Double");
	}
	
	void display(Float b) {
		System.out.println("Float");
	}
	
	void display(Number b) {
		System.out.println("Number");
	}
	
}
