package javaexamples;

public class Demo {

	public static String myvar="global var";
	String instacevar="instance var";

	public void localmeth() {
		String myvar="local var";



		System.out.println(myvar);

	}


	public static void main(String[] args) {



		Demo d1=new Demo();
		Demo d2=new Demo();
		Demo d3=new Demo();

		d2.myvar="change global";

		d2.instacevar="change instance";




		d1.localmeth();
		System.out.println("*******************");

		System.out.println(d1.myvar);
		System.out.println(d2.myvar);
		System.out.println(d3.myvar);
		
		System.out.println("*******************");

		System.out.println(d1.instacevar);
		System.out.println(d2.instacevar);
		System.out.println(d3.instacevar);
		







	}

}
