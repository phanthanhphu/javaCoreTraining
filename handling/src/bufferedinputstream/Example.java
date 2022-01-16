package bufferedinputstream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Example {
	public static void main(String[] args) throws IOException {
		FileInputStream fin = null;
		BufferedInputStream bin = null;
		try {
			fin = new FileInputStream("input.txt");
			bin = new BufferedInputStream(fin);
			int i;
			while ((i = bin.read()) != -1) {
				System.out.print((char) i);
			}
		} catch (Exception e) {
			System.out.print(e);
		} finally {
			bin.close();
			fin.close();
		}
	}
}
