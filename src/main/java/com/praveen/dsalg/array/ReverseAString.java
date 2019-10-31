package com.praveen.dsalg.array;

public class ReverseAString {

	public static void main(String[] args) {
     String name="Praveen";
     char[] charArray=name.toCharArray();
     for(int i=charArray.length-1;i>=0;i--) {
    	 System.out.print(charArray[i]);
     }
	}

}
