package com.practice.codes;

public class StringReverse {

	public static void main(String[] args) {
		String s1 = "Pritam";
		char[] charArr = s1.toCharArray();
		for(int i=0,j=s1.length()-1; i<j; i++,j--) {
			char temp = charArr[i];
			charArr[i] = charArr[j];
			charArr[j] = temp;
		}
		System.out.println(new String(charArr));
	}
}
