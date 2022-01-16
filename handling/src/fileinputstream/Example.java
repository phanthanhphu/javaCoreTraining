package fileinputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class Example {
	public static void main(String[] args) throws IOException {
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("input.txt");
			int i = fin.read();
			System.out.print((char) i);
			
		} catch (Exception e) {
			System.out.print(e);
		} finally {
			fin.close();
		}
	}
}
