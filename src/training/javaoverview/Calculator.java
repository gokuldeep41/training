package training.javaoverview;

public class Calculator {
	
	int firstOp; // default
	int secondOp;

	//instance
	int sum(int a, int b ) {
		return a + b;
	}
	
	float sum(float a, float b) {
		return (a + b);
	}
	
	int sum(int a, int b, int c ) {
		return a + b + c;
	}

	
	static void display_error() {
		System.out.println("There was an error in calculator");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal1 = new Calculator();
		
		cal1.firstOp = 50;
		cal1.secondOp = 100;
		
		System.out.println(cal1.sum(cal1.firstOp, cal1.secondOp)); // 150
		
		int temp = cal1.sum(5, 3, 2);
		
		System.out.println(cal1.sum(10f, 13.26f));
	}

}
