package javaexamples;

import java.util.Scanner;

public class PellserProgram {
public static void main(String[] args) {
	
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int n=sc.nextInt();
	
	int a=1,b=0,c;
	
	for(int i=1;i<=n;i++) {
		
		
		c=a+b*2;
		System.out.print(c+" ");
		a=b;
		b=c;
		
		
	}
	
	
	
	
	
	
}
}
