package javaexamples;

public class Arraysops {
public static void main(String[] args) {
	
	int [] myint= {10,50,100,40};
	
	//System.out.println(myint[0]);
	
	int len=myint.length;
	System.out.println("***********");
	//System.out.println(len);
	int i=0;
	while(i<len) {
		
		System.out.println(myint[i]);
		i++;
	}
	System.out.println("***********");
	
	for(int k:myint) {
		System.out.println(k);
		
		
	}
	System.out.println("***********");
	for(int j=0;j<len;j++) {
		System.out.println(myint[j]);
	}
	
}
}
