package javaexamples.construtor;

public class Test {

	public static void main(String[] args) {
		
		Cube c=new Cube();
		System.out.println(c.getCubeVolume());
		
		Cube c1=new Cube(10,20,30);
		
		System.out.println(c1.getCubeVolume());
		

	}

}
