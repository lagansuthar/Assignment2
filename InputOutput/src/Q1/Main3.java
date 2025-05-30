package Q1;

import java.io.File;

public class Main3 {
	public static void main(String[] args) {
		File file = new File("lagan.txt");
		if (file.delete()) {
			System.out.println("file deleted successfully" + file.getName());
		} else {
			System.out.println("not deleted..");
		}
	}
}