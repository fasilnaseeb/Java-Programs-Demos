package javaexamples;

import java.util.Scanner;

public class GCDoftwoNum {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 num");
		int x=sc.nextInt();
		System.out.println("Enter 2 num");
		int y=sc.nextInt();
		
		
		for(int i=1;i<=x && i<=y;i++) {
			
			if(x%i==0 && y%i==0) {
				
				int gcd=i;
				System.out.println(i);
			}
		}
		
		
		
		
		
		
		
	}

}
