package training.javaoverview;

public class GenericClass {
	
	public <G> void printArray(G[] array) {
		for(G a: array) {
			System.out.println(a);
		}
	}
	
	public void print(int[] arr) {
		for(int a: arr) {
			System.out.println(a);
		}
	}
	public void print(float[] arr) {
		for(float a: arr) {
			System.out.println(a);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] inta = {1,2,3,4};
		Float[] floata = {1.0f, 2.0f, 3.0f, 4.0f};
		
		GenericClass g = new GenericClass();
		//Generic Class
		g.printArray(inta);
		g.printArray(floata);
		
		//Method Overloading
		int[] arr = {1, 3, 4, 5};
		float[] arrf = {1.2f,3.3f,4.5f};
		g.print(arr);
		g.print(arrf);
	}

}
