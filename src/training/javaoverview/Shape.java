package training.javaoverview;

public class Shape {
	
	int dimension;
	
	final static float PI = 3.14f;
	
	boolean val = false;
	char vala = 'A';
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		Shape circle = new Shape();
//		circle.dimension = 5;
//		
//		Shape square = new Shape();
//		square.dimension = 10;
//		
//		//PI = 4.31;
//		System.out.println((3< 10) && (10 < 3));
//		
//		float x = circle.dimension * PI;
//		x = x * PI;
//		x *= PI;
//		
//		//Post Increment
//		System.out.println(circle.dimension++);
//		System.out.println(circle.dimension);
//		
//		//Pre Increment
//		System.out.println(++circle.dimension);
//		System.out.println(circle.dimension);
		
		ConstructorClass obj = new ConstructorClass(25, 13);
		System.out.println(obj.a);
	}

}
