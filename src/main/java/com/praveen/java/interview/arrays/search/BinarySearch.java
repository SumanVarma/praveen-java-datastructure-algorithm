package com.praveen.java.interview.arrays.search;

public class BinarySearch {
	public static void main(String[] args) {
		int[] num = { 90, 24, 46, 35, 32 };
		int key=46;
		binarySearch(num,0,num.length,key);
	}
	
	public static void binarySearch(int arr[], int first, int last, int key){  
		   int mid = (first + last)/2;  
		   while( first <= last ){  
		      if ( arr[mid] < key ){  
		        first = mid + 1;     
		      }else if ( arr[mid] == key ){  
		        System.out.println("Element is found at index: " + mid);  
		        break;  
		      }else{  
		         last = mid - 1;  
		      }  
		      mid = (first + last)/2;  
		   }  
		   if ( first > last ){  
		      System.out.println("Element is not found!");  
		   }  
		 }  
}
