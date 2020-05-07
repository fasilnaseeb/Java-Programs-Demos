package javaexamples;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		int sum=0,rem,temp;
		temp=n;
		
		while(n>0) {
			
			rem=n%10;
			int fact=1;
			for(int i=1;i<=rem;i++) {
				
				fact=fact*i;
			}
			
			 n=n/10;
			 sum=sum+fact;
			
		}
		
		
		if(temp==sum)
		{
			System.out.println("number is strong");
		}
		else
		{
			System.out.println("the number is not strong");
		}
		
		
		
		
		
		
	}
	
	
}
