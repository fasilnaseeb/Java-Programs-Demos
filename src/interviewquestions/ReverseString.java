package interviewquestions;

public class ReverseString {
	public static void main(String[] args) {
		
		
		String s="fasil naseeb";
		int length=s.length();
		
		String reverse=" ";
		
		for(int i=length-1;i>=0;i--) {
			
			reverse= reverse + s.charAt(i);
		}
		  
		System.out.println(reverse);
		
		
		
		
		
		
	}

}
