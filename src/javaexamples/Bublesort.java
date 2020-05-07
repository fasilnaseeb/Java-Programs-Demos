package javaexamples;

public class Bublesort 
{
	public static void main(String[] args) 
	{	
		int a[]= {39,19,28,12,5};
		int temp,flag=0;
		
		//print un sorted array
		System.out.print("Unsorted : ");
		for(int i=0;i<a.length;i++) 
		{	
			System.out.print(a[i]+" ");
		}	
		System.out.print("\n");
		
		for(int i=0;i<a.length;i++) //total number elements
		{
			for(int j=0;j<a.length-i-1;j++) // Number of unsorted elements - 1
			{
				if(a[j]>a[j+1]) 
				{					
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;								
				}
			}			
		}
		
		//print sorted array
		System.out.print("Sorted : ");
		for(int i=0;i<a.length;i++) 
		{	
			System.out.print(a[i]+" ");
		}	
	}
}
