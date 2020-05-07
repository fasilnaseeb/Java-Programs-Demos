package javaexamples.staticnonstatic;

public class Test {

	public static void main(String[] args) {
		
		
		
		Demo.dosomething();
		System.out.println("******************");
		Demo d=new Demo();
		d.dosomething("its aggument");
		d.age=10;
		System.out.println(d.age);
		
		System.out.println("******************");
		
		Demo d1=new Demo();
		d1.age=10;
		
		Demo.age=50;
		
		System.out.println(d1.age);
		
		System.out.println(Demo.age);
		
		
		
		
	}

}
