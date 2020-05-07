package javaexamples.exceptions;

public class ExcepFinal {

	public static void main(String[] args) {
		
		try {
			int a=100/0;
		System.out.println(a);
		}
		catch(ArithmeticException e) {
			
			System.out.println("catch called");
			System.out.println(e);
			
			
		}
		finally {
			System.out.println("throe=ws");
		}
		
		
		
		
	}
	
}
