package javaexamples.staticnonstatic;

public class Demo {

	public static int age;
	public static void dosomething() {
		
		System.out.println("its a static meth its belongs to class");
		
	}
	
	public void dosomething(String msg) {
		
		System.out.println("non static belongs to object instance ===> "+msg);
	}
}
