package child;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class writeFile {
	public void writefile(String str) {
		String path= "..\\target\file.txt";
		
		File file = new File(path);
	    try {
	      boolean value = file.createNewFile();
	      if (value) {
	        System.out.println("New Java File is created.");
	      }
	      else {
	        System.out.println("The file already exists.");
	      }
	    }
	    catch(Exception e) {
	      e.getStackTrace();
	    }
	  
	 try {
	       // Creates a Writer using FileWriter
	       FileWriter output = new FileWriter(path);

	       // Writes the program to file
	       output.write(str);
	       System.out.println("Data is written to the file.");

	       // Closes the writer
	       output.close();
	     }
	     catch (Exception e) {
	       e.getStackTrace();
	     }
	  }

}
