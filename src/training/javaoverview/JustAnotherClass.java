package training.javaoverview;
import training.oops.SiblingChild;

public class JustAnotherClass extends SiblingChild {
	
	Shape shapes;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SiblingChild child = new SiblingChild();
		
		JustAnotherClass ja = new JustAnotherClass();
		ja.a = 200;
		System.out.println(ja.a);
		ja.shapes.dimension = 5;
	}

}
