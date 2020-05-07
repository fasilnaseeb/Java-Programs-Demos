package javaexamples;

import java.util.Scanner;

public class ReverseofString {
public static void main(String[] args) {
	
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a String");
	String str=sc.next();
	
	
	int length=str.length();
	
	String rev="";
	
	for(int i=length-1;i>=0;i--) {
		
		
		rev+=str.charAt(i);
	}
	
	
	System.out.println(rev);
	
	
	
	
	
}
}
