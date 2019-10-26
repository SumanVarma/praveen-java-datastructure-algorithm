package com.praveen.dsalg.array;

public class MergeTwoArrays {

	public static void main(String[] args) {
       int[] num1= {12,10,34,8,98};
       int[] num2= {6,43,1,88,14};
       int[] num3= new int[num1.length+num2.length];
       
       System.out.println("Merged Array Elements are ");
       for(int i=0; i<num1.length ;i++) {
    	   num3[i]=num1[i];
       }
       
       for(int i=0;i<num2.length;i++) {
    	   num3[num1.length+i]=num2[i];
       }
       
       for(int i=0;i<num3.length;i++) {
    	   System.out.print(num3[i]+" ");
       }
	}

}
