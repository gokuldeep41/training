package training.javaoverview;

public class MethodTest {
	
	static void square(int num){//local to method
		display(num*num);
	}
	
	static void display(int a) {
		System.out.println(a);
	}

	public static void main(String[] ar) {
		
		int  i = 0;
		square(i);
		square(++i);
	}
}
