package com.praveen.java.interview;

// Singleton is nothing but only object will be created
class SingletonClass {

	private SingletonClass() {

	}

	static class SingletonHolder {
		private static SingletonClass instance = new SingletonClass();
	}

	public static SingletonClass getInstance() {
		return SingletonHolder.instance;
	}

}

public class SingletonTest {
	public static void main(String args[]) {
		SingletonClass se =  SingletonClass.getInstance();
		SingletonClass se1 =  SingletonClass.getInstance();
		if (se == se1) {
			System.out.println("Both are same");
		} else {
			System.out.println("Both are not same");
		}
	}
}
