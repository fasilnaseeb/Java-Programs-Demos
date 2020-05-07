package javaexamples;

public class MethodsOperation {
	
	public int add(int a,int b) {
		
		return a+b;
		
	}
	
	
	
	public void testmeth(String arg) {
		
		System.out.println("this is not static metheod==>"+arg);
	}
	
	public static void mymeth() {
		
		System.out.println("new static method without object its can execute");
	}
	
	public static void parmeth(String name) {
		
		System.out.println("hello"+name);
	}
	
	public static void main(String[] args) {
		
		
		mymeth();
		System.out.println("***we can execute multiple time call the same static meth****");
		mymeth();
		
		System.out.println("************");
		
		parmeth("fasil");
		System.out.println("************");
		 MethodsOperation obj=new MethodsOperation();
		 obj.testmeth("pass arg");
		 System.out.println("************");
		 
		 int sum=obj.add(10, 30);
		 System.out.println(sum);
		
	}

}
