package com.praveen.dsalg.others;

public class LongestWordInAString {
	public static void main(String[] args) {
		String sentence="This is Praveen Oruganti I am Senior Technical Lead in Birlasoft";
		String[] words= sentence.split(" ");
		String largestWord= words[0];
		for(int i=1;i<words.length;i++) {
			if(words[i].length()>largestWord.length()) {
				largestWord=words[i];
			}
		}		
		System.out.println("Longest word in Sentence \n"+sentence +" \nis \n"+largestWord);			
	}
}
