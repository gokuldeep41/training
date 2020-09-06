package training.oops;

abstract class BaseClass{
	
	final float PI = 22.0f/7.0f;
	
	void display() {
		System.out.println("Display Method from base");
	}
	
	abstract void print();
	
}

abstract class BasePlusClass extends BaseClass {
	abstract void  show();
}

public class AbstractionClass extends BasePlusClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractionClass ab = new AbstractionClass();
		ab.display();
		ab.print();
		System.out.println(ab.PI);
	}

	int print(int a, int b) {
		return 1;
	}
	
	void display() {
		System.out.println("Child Class");
	}
	
	void print() {
		System.out.println("Print Something");
	}

	@Override
	void show() {
		// TODO Auto-generated method stub
		
	}
}
