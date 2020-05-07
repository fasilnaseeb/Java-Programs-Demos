package javaexamples;

import java.util.Arrays;
import java.util.Scanner;

public class StringAlpabeticorder {

//	 // Driver method 
//    public static void main(String[] args) 
//    { 
//    	
//    	Scanner sc=new Scanner(System.in);
//    	System.out.println("Enter a String");
//    	String inputString=sc.nextLine();
//    	
//       
//        String outputString = sortString(inputString); 
//          
//        System.out.println("Input String : " + inputString); 
//        System.out.println("Output String : " + outputString); 
//    } 
//	
//	
//	
//	public static String sortString(String inputString) 
//    { 
//        // convert input string to char array 
//        char tempArray[] = inputString.toCharArray(); 
//          
//        // sort tempArray 
//        Arrays.sort(tempArray); 
//          
//        // return new sorted string 
//        return new String(tempArray); 
//    } 
      
   
	
	
	
	public static void main(String[] args) 
    { 
    	
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter a String");
    	String inputString=sc.nextLine();
    	
    	 char tempArray[] = inputString.toCharArray(); 
    	 Arrays.sort(tempArray);
    	
    	
       
        String outputString = new String(tempArray);
          
        System.out.println("Input String : " + inputString); 
        System.out.println("Output String : " + outputString); 
    } 
	
	
	
	
    
        // convert input string to char array 
       
          
        // sort tempArray 
         
          
        // return new sorted string 
         
    
      
	
	
	
	
}

