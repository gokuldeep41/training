package training.oops;

public class SiblingChild extends Parent {

	protected int a;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SiblingChild child = new SiblingChild();
		//child.print();
		child.a = 100;
		System.out.println(child.a);
	}

}
