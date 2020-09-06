package training.oops;

//class GrandParent {
//	public void show() {
//		System.out.println("I am Grand Parent -- ");
//	}
//}

class Parent {
	int a;
	int b;
	
	public Parent() {
		//System.out.println("I am PARENT constr ");
		this.a = 0;
	}
	
	public Parent(int a) {
		//System.out.println("Invoked by child with val " + a);
		this.a = a;
	}
	
	public void display() {
		System.out.println("I display nothing");
	}
	
	public void print() {
		System.out.println("I am PARENT -- ");
	}
}

public class Child extends Parent {
	
//	int b;
	
	public Child() {
		super();
		//System.out.println("I am Child constr");
	}
	
	public Child(int b) {
		super();
		this.b = b;
		super.b = b *10;
		//System.out.println("I am Child constr");
	}
	
	public void print() {
		System.out.println("I am Child --");
	}
	

	public void printSomething() {
		System.out.println("I am Child --");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Child child = new Child(10);
//		child.print();
		//child.display();
		
//		System.out.println(child.b);
		//child.display();
		Parent runtime  = new Child();
		runtime.print();
		//runtime.display();
		
		Parent parent = new Parent();
		runtime = parent;
		runtime.print();
		
		Child child = new Child();
		runtime = child;
		runtime.print();
	}

}

