package training.javaoverview;

public class StringTest {

	static String msg = "Hello";
	
	public static void main(String ar[]) {
//		System.out.println(msg);
//		String msg1 = " World";
//		
//		System.out.println(msg1.length());
//		System.out.println(msg.concat(msg1));
//		System.out.println(msg.charAt(2));
//		
//		System.out.println(msg1.compareToIgnoreCase(msg1));
//		
//		//Immutability
//		msg1 = msg1.replace('l', 'B');
//		System.out.println(msg1);
//		System.out.println(msg.substring(2,4));
		
		Integer v = 100;
		System.out.println(v.toString());
		
		String h = "100";
		String s = "200";
		System.out.println(h + s);
		System.out.println(Integer.parseInt(h));
	}
}
