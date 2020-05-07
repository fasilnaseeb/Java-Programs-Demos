package javaexamples;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1 Strings");
		String x=sc.nextLine();
		System.out.println("Enter the 2 Strings");
		String y=sc.nextLine();
		
		char[] a=x.toCharArray();
		
		char[] b=y.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		boolean result=Arrays.equals(a, b);
		
		if(result==true) {
			
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("not anagaram");
		}
		
	}

}
