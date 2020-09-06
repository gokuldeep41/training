package training.javaoverview;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		File file = new File("D://normal.txt");
		FileReader fr = new FileReader(file);
		}
		catch(FileNotFoundException f) {
			StackTraceElement[] stack = f.getStackTrace();
			int i = 0; 
			for(StackTraceElement method: stack) {
				i++;
				System.out.println(i + method.toString());
			}
		}
	}

}
