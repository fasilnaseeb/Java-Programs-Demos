package javaexamples.construtor;

public class Cube {
	
	int length;
	int breadth;
	int height;
	
	
	
	public int getCubeVolume() {
		
		return length*height*breadth;
	}

	
	public Cube() {
		length=20;
		breadth=20;
		height=20;
	}
	
	Cube(int l,int b,int h){
		this.length=l;
		this.breadth=b;
		this.height=h;
	}
}
