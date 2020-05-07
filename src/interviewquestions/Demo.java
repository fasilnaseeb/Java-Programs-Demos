package interviewquestions;

import java.util.LinkedHashSet;

public class Demo {
	public static void main(String[] args) {
		LinkedHashSet<String>s=new LinkedHashSet<String>();
		String input="my name name is is fasil";
		
		String[] split = input.split("\\s");
		
		
		for(String str:split) {
			
			//System.out.println(str);
			s.add(str);
			
		}
		
		for(String n:s) {
			System.out.print(n+" ");
		}
		
		
		
	}

}
