package javaexamples.exceptions;

public class ExceptionHand {
public static void main(String[] args) {
	
	int b[]=new int[2];
	
	try {
		
		System.out.println(b[3]);
		int a=100/0;
		System.out.println(a);
		
		
		
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println(e);
	}
	
	
	catch(ArithmeticException e)
	{
		System.out.println(e);
		
	}
	catch(Exception e){
		System.out.println(e);
	}
	
	
	
	System.out.println("***************************");
}
}
