package JAVA_ReadingFileProperties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadingFile {

	public static void main(String[] args) throws IOException {
		//Creating object for propert class to call some methods of proerty class
		
		Properties prop =new Properties();
		
		//Creating object for belo class
		
	FileInputStream fis = new FileInputStream("C:\\Users\\Dandigam\\git\\Eclipse-Project-Testing\\My First Project\\src\\JAVA_ReadingFileProperties\\EmployeeRecord.Properties");
		
	//Making above statement dynamic to use in difeeren machines under different folder
	
		//FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\JAVA_ReadingFileProperties\\EmployeeRecord.Properties");
		
	//calling a method to load the above file
		
		prop.load(fis);
		
	//getting and printing property of a file using a key called "name"
		
		System.out.println(prop.getProperty("name"));
		//to get ath till project folder
		System.out.println(System.getProperty("user.dir"));
	}

}
