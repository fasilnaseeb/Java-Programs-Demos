package javaexamples;

import java.util.Scanner;

public class ChartoString {
	public static void main(String[] args) {
		
		char[] ch=new char[]{'f','a','s','i','2'};
		//System.out.println(ch);

		
		String str=new String(ch);
		
		
		
		
		//reverese of char
		
		
		//System.out.println(str);
		
		
		int length=str.length();
		
		
		String rev="";
		
		
		for(int i=length-1;i>=0;i--)
		{
			rev+=str.charAt(i);
		}
		
		
		System.out.println(rev);
		
		
	}

}
