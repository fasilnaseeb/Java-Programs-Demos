package javaexamples;

import java.util.Scanner;

public class Biggestinthreenumber {
	public static void main(String[] args) {
		
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 1 number");
	int a=sc.nextInt();
	System.out.println("Enter 2 number");
	int b=sc.nextInt();
	System.out.println("Enter 3 number");
	int c=sc.nextInt();
	
	
	if(a>b&&a>c) {
		System.out.println("a is biggest");
	}
	else if(b>a&&b>c){
		System.out.println("b is biggest");
	}
	else
	{
		System.out.println("c is biggest");
	}

}}
