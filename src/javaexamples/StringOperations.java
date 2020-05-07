package javaexamples;

public class StringOperations {
	public static void main(String[] args) {


		String myString="Hello World";

		System.out.println(myString);

		System.out.println("*************");
		int strLength=myString.length();

		System.out.println("string length="+strLength);
		
		System.out.println("********************");

		String lovercase=myString.toLowerCase();
		System.out.println("lovercase="+lovercase);
		
		System.out.println("********************");
		
		String uppercase=myString.toUpperCase();
		System.out.println("uppercase="+uppercase);
		
		System.out.println("*******************");
		String replacechar=myString.replace('e', 'a');
		System.out.println("replacechar="+replacechar);
		
		System.out.println("***********");
		
		String[] split=myString.split("\\s+");
		
		int splitcout=split.length;
		
		System.out.println(splitcout);
		
		for(String w:split) {
			System.out.println(w);
		}
		
		
		







	}

}
