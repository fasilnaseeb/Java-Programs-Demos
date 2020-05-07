package javaexamples;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		System.out.println("Enter the number range");
		int x=sc.nextInt();
		
		int sum=0;
		for(int i=1;i<=x;i++) {
			
			
			sum=i*n;
			
			System.out.println(i+" * "+n+"= "+sum);
			
		}
		
		
		
		
		
		
	}

}
