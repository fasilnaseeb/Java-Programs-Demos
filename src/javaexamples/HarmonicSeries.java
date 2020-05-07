package javaexamples;

import java.util.Scanner;

public class HarmonicSeries {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		double sum=0;
		for (int i = 1; i <= n ; i++) {
			
			sum=sum+1.0/i;
			
			
			
		}
		
		
		System.out.println(sum);
		
		
	}

}
