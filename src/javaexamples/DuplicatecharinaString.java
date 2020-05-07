package javaexamples;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DuplicatecharinaString {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.nextLine();
		
		
		char y[]=str.toCharArray();
		int size=y.length;
		
		Map<Character, Integer>map=new LinkedHashMap<Character, Integer>();
		
		int i=0;
		
		while(i != size) {
			if(map.containsKey(y[i])==false) {
				map.put(y[i], 1);
				
			}
			else
			{
				int oldval=map.get(y[i]);
				int newval=oldval+1;
				map.put(y[i],newval);
			}
			++i;
		}
		
		
		
		
		Set<Map.Entry<Character,Integer>>lmap=map.entrySet();
		for(Map.Entry<Character, Integer>data:lmap)
		{
			if(data.getValue()>1)
			{
				System.out.println(data.getKey());
				System.out.println(data.getValue());
			}
		}
		
		
	}

}
