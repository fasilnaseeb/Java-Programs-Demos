package javaexamples;

import java.util.Scanner;

public class Powerofgivennum {
	public static void main(String[] args) {
		
	

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter one number and its power ");
	int x=sc.nextInt();
	int y=sc.nextInt();
	
	
	int sum=1;
	for(int i=1;i<=y;i++) {
		
		sum=sum*x;
	}
	
	System.out.println(sum);
	//System.out.println("power ="+Math.pow(x,y));
	
	
	
}
}