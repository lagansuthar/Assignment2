package Q1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main2 {
  public static void main(String []args) {
	 FileWriter fileWriter = null;
	try {
		fileWriter = new FileWriter("lagan.txt");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 try {
		fileWriter.write("hello sdac");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 try {
		fileWriter.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println(e);
		System.out.println("file was not updated");
	}
	 System.out.println("file manuplated successfully");
	 
	
  }
}
