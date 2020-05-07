package interviewquestions;

import java.util.LinkedHashSet;
import java.util.Set;

public class Demo2 {
public static void main(String[] args) {
	
	String data="aabb";
	
	Set<Character> set=new LinkedHashSet<Character>();
	for(char c:data.toCharArray())
	{
	      set.add(Character.valueOf(c));
	}
	
	for(Character str:set) {
		String val = str.toString();
	
	}
	
	
}

}
