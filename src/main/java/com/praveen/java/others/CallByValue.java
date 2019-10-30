package com.praveen.java.others;

class Student {
	private String studentName;

	public String getStudentName() {
		return studentName;
	}

	public Student(String studentName) {
		this.studentName = studentName;
	}

}

public class CallByValue {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		swap(num1, num2);
		System.out.println(" num1 = " + num1);
		System.out.println(" num2 = " + num2);

		int[] arr = { 1, 2, 3, 4, 5 };
		System.out.println(arr[0]);
		change(arr);
		System.out.println(arr[0]);

		Student s1 = new Student("Praveen");
		Student s2 = new Student("Prasad");
		CallByValue.swap(s1, s2);
		System.out.println(" s1: " + s1.getStudentName());
		System.out.println(" s2: " + s2.getStudentName());

	}

	private static void change(int[] arr) {
		// Change the first element of the array to 0
		arr[0] = 0;
	}

	private static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		System.out.println(" a = " + a);
		System.out.println(" b = " + b);
	}

	private static void swap(Student x, Student y) {
		Student temp = x;
		x = y;
		y = temp;
		System.out.println(" x: " + x.getStudentName());
		System.out.println(" y: " + y.getStudentName());
	}
}
