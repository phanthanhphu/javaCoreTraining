package fileoutputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example {
	public static void main(String[] args) throws IOException {
		FileOutputStream fis = null;
		try {
			fis = new FileOutputStream("input.txt");
			fis.write(65);
			System.out.println("success ...");
		} catch (Exception e) {
			System.out.print(e);
		}finally {
			fis.close();
		}
	}
}
