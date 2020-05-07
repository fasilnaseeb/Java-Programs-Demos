package javaexamples;

import java.util.Scanner;

public class StringtoChar {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		
		//String str="fasil naseeb";
		
		char[] array=str.toCharArray();
		
		for(char c:array) {
			
			
			System.out.println(c);
		}
		
		
		
		
		
	}

}
