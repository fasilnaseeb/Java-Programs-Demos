package javaexamples;

import java.util.Scanner;

public class Amstrongnumber {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		
		int temp=n;
		 int r,sum=0;
		 
		 while(n>0) {
			 
			 r=n%10;
			 n=n/10;
			 sum=sum+r*r*r;
			 
		 }
		
		 if(temp==sum)
		 {
			 System.out.println("amstrong number");
		 }
		 else {
			 System.out.println("not amstrong");
		 }
		
		
		
	}
}
