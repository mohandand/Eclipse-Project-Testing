package WritingFiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingFiles {

	public static void main(String[] args) throws IOException {
		
		//Output Stream to Selec Directory
		
		File f= new File("C:\\Users\\Dandigam\\Desktop\\Udmey Selenium\\FileWriting\\myTextFile.txt");
		
		//Output Stream to write file and chaining to previous step
		
		FileWriter fw = new FileWriter(f);
		
		//BufferedWriter Stream to write in the file and chaining to previous step
		
		BufferedWriter writer = new BufferedWriter(fw);
		
		//above 3steps are used for stream connectivity
		
		//Writing inside File
		
		writer.write("Write First Line");
		
		writer.newLine();
		
		writer.write("Second line");
		
		//Closing Stream Connectivity
		
		writer.close();
		
		//just to check whether all above are executed
		
		System.out.println("FileWriting Sucessfull");
		
		
	}

}
