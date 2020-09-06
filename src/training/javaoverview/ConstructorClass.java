package training.javaoverview;

public class ConstructorClass {
	
	public int a;//default
	int b;
	private int c;
	
	//Default
	public ConstructorClass() {
		System.out.println("CONSTRUCTOR");
		a = 10;
	}
	
	//Parameterized Constructor
	public ConstructorClass(int var){
		a = var;
	}
	
	public ConstructorClass(int a, int b){
		this.a = a;
		this.b = b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorClass cont = new ConstructorClass(30);
		//System.out.println(cont.a);
		
		ConstructorClass cobj = new ConstructorClass(30, 10);
		System.out.println(cobj.a);
		System.out.println(cobj.b);
		System.out.println(cobj.c);
	}

}
