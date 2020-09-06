package training.oops;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedClass {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		File filename = new File("D://normal.txt");
		FileInputStream fstream = new FileInputStream(filename);
		FileReader fr = new FileReader(filename);
		
	}
	
	
}
