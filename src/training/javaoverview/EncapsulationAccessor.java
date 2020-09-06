package training.javaoverview;

import training.oops.Encapsulation;

public class EncapsulationAccessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation en =  new Encapsulation();
		//en.a = 300
		en.setA(4);
		System.out.println(en.getA());
	}

}
