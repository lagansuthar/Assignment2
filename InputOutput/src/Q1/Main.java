package Q1;

import java.io.File;

public class Main {
	public static void main(String[] args) {
		File file = new File("lagan.txt");
		try {
			file.createNewFile();
			System.out.println("file created");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			System.out.println("not created");
		}

	}
}
