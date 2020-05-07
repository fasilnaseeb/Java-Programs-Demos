package javaexamples;

import java.util.Scanner;

public class CompountIntrest {
	public static void main(String[] args) {
		
		double amount,principle,rate,time;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter principle amount");
		principle=sc.nextDouble();
		System.out.println("Enter the rate");
		rate=sc.nextDouble();
		System.out.println("enter the time");
		time=sc.nextDouble();
		
		
		amount=principle* Math.pow((1+rate/100), time);
		
		
		System.out.println("compount intrest="+amount);
		
		
		
		
	}

}
