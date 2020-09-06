package training.javaoverview;


public class TestClass {
	
	//data member - Instance Variables
	int a;
	int b;
	
	static int classVariable;
	
	public static void main(String[] args) {
		
		int c = 200;//Local Variable
		
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		
		//declaration
		TestClass test;
		
		//initialization - Instantiation
		test = new TestClass();
		
		TestClass test1 = new TestClass();
		
		test.a = 10;
		test.b = 100;
		// test.b = 0
		
		//test1.a = 0
		test1.b = 20;
		
//		System.out.println(test.a); //10
//		System.out.println(test.b); //100
//		
//		System.out.println(test1.a);//0
//		System.out.println(test1.b);//20
//		
//		System.out.println(c);//200
		
		TestClass.classVariable = 50;
		
		classVariable = 25;
		System.out.println(classVariable);
		
		System.out.println(test.toString());
	}


}
