package training.oops;

public class Encapsulation {
	
	private int a = 100; //>=0
	
	//getter method
	public int getA() {
		return a;
	}

	//setter method
	public void setA(int val) {
		if(val < 0) {
			System.out.println("Integer should be greater than 0");
			a = 0;
			
			return;
		}
		a = val;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation en = new Encapsulation();
		System.out.println(en.getA());
		
		//en.a = 200;
		en.setA(300);
		System.out.println(en.a);
		
	}

}
