package training.javaoverview;

import java.util.Arrays;

public class ArraysTest {
	
	static public void printArray(int[] a) {
		for(int i: a ) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1, 2, 3, 4}; // giving
		int[] arr = new int[5]; //empty array
		
		Arrays.fill(arr, -1);
		arr[2] = 100;
		arr[3] = 2;
		arr[0]= 12;
		//System.out.println(arr[2]);
		
//		for(int i: a ) {
//			System.out.println(i);
//		}//indexes
		
//		for(int i =1 ; i <=3; i++) {
//			System.out.println(a[i]);
//		}
		//printArray(arr);
		Arrays.sort(arr);
		
		//printArray(arr);
		
		System.out.println(Arrays.binarySearch(a, 3) + 1  +" th position");
		
		int[][] multiArr = {
				{1,2,3},
				{3,4,5},
				{6,7,8}
		};
		System.out.println(multiArr[1][1]);
		System.out.println("---------------------");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++)
				System.out.println(multiArr[i][j]);
			System.out.println();
		}
	}

}
