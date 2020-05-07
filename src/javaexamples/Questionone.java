package javaexamples;

import java.util.Scanner;

public class Questionone {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Data");
		String data=sc.nextLine();
		
		switch(data) {
		
		case "selenium": System.out.println("i love selenium");
		break;
		case "java":System.out.println("i love java");
		break;
		default:System.out.println("wrong data");
		break;
		
		}
		
		
		
		
		
	}

}
