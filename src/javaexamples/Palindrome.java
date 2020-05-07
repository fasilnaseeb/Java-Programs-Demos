package javaexamples;

import java.util.Scanner;

public class Palindrome {
public static void main(String[] args) {
	
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	
	
	int temp=n,sum=0,rem;
	
	
	while(n>0) {
		
		rem=n%10;
		
		sum=sum*10+rem;
		
		n=n/10;
	}
	
	
	
	if (temp==sum) {
		System.out.println("palindrome");
	}
	else {
		System.out.println("Not palindrome");
	}
	
	
}
}
