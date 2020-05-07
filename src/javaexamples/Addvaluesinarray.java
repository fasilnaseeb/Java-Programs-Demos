package javaexamples;

import java.util.Scanner;

public class Addvaluesinarray {

	public static void main(String[] args) {
	
		

	
		
		
		int a[]= {1,2,40,50,99};
		
		
		
		
		
		
		
		
		
		for(int i=0;i<a.length;i++)
		{
		System.out.print(a[i]+" ");}
		
		
		
		
		int pos=3,ele=100;
		
		for(int i=a.length-1;i>pos-1;i--) {
			a[i]=a[i-1];
		
		}
		System.out.println();
			
        a[pos-1]=ele;
        for(int i=0;i<a.length;i++) {
        	System.out.print(a[i]+" ");
        }
        
        
        
        
        
        

		
//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter the number");
//
//        // Create a new array. The user enters the size
//        int[] array = new int[input.nextInt()];
//
//        // Get the value of each element in the array
//        for(int i = 0; i < array.length; i++)
//            array[i] = input.nextInt();
//		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter position");
//		int poss=sc.nextInt();
//		
//		int pos=poss;
//		
//		
//		
//		
//		
//		
//		
//		for(int i=0;i< array.length;i++)
//		{
//		System.out.print( array[i]+" ");}
//		
//		
//		
//		
//		int ele=100;
//		
//		for(int i= array.length-1;i>pos-1;i--) {
//			 array[i]= array[i-1];
//		
//		}
//		System.out.println();
//			
//		 array[pos-1]=ele;
//        for(int i=0;i< array.length;i++) {
//        	System.out.print( array[i]+" ");
//        }
        
        
        
	}

}
