package javaexamples.excetionhandling;

public class Division {
	
	 public static void main(String[] args) 
	    { 
	        int a = 10, b = 5, c = 5, result; 
	        try { 
	            result = a / (b - c); 
	            System.out.println("result" + result); 
	        } 
	  
	        catch (ArithmeticException e) { 
	        	
	        	//System.out.println(e.printStackTrace(););
	            //System.out.println("Exception caught:Division by zero"); 
	        	e.printStackTrace();
	        } 
	  
	        finally { 
	            System.out.println("I am in final block"); 
	            
	            System.out.println("execute");
	        } 
	         
	        System.out.println(sum);
	    } 
	 
	public static int a=10;
	public static int b=20;
	public static int sum=a+b;
    
}
