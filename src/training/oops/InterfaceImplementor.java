package training.oops;

public class InterfaceImplementor extends Child implements InterfaceClass, SecondInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceImplementor in = new InterfaceImplementor();
		in.print();
		in.display(5);
		in.show();
		
		in.printSomething();
	}
	
	

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Print Anything");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Show something");
	}

	@Override
	public void display(int a) {
		// TODO Auto-generated method stub
		System.out.println("Value is " + a);
	}

	@Override
	public void thisIsNothing() {
		// TODO Auto-generated method stub
		System.out.println("This is nothing");
	}

}
