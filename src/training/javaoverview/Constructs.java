package training.javaoverview;

public class Constructs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean expression = false;
		int dayOFWeek = 4;
		
//		while(dayOFWeek > 0) {
//			System.out.println(dayOFWeek--);
//		}
//		
//		System.out.println("2nd");
//		dayOFWeek = 4;
//		do {
//			System.out.println(dayOFWeek--);
//		}while(dayOFWeek > 0);
		
		for(int i = 0; i < 10; i++ ) {
			if( i % 2 == 0)
				continue;
			System.out.println(i);
		}
		
		
//		if( dayOFWeek == 2) { //false
//			System.out.println("Tuesday");
//		}
//		else {//go here
//			if(dayOFWeek == 4){// true
//				System.out.println("Thursady");//print
//			}
//			else {
//				System.out.println("False statement");
//			}
//			
//		}
//		switch(dayOFWeek) {
//		 case 1: System.out.println("Sunday");
//		 		break; // exits the immedaiate block
//		 case 2: System.out.println("Monday");
//		 		break;
//		 default: System.out.println("It is any day");
//		}
//		
//		int num = expression?1:0;
////		if(expression) {
////			num =1;
////		}
////		else {
////			num =0;
////		}
//		System.out.println(num);
	}
	
}
