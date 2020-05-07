package javaexamples;

import java.util.Scanner;

public class LogicaCondition {
public static void main(String[] args) {
	
	Scanner  sc=new Scanner(System.in);
	System.out.println("enter maths mark");
	int math=sc.nextInt();
	System.out.println("Enter Biologey mark");
	int bio=sc.nextInt();
	
	if((math>=35) && (bio>=35)) {
		System.out.println("pass");
	}
	else {
		System.out.println("fail");
	}
	
	
	
	
	
}
}
