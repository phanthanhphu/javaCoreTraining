package inputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Example {
	public static void main(String[] args) throws IOException {
		byte[] array = new byte[100];
		try {
			InputStream inputstream = new FileInputStream("input.txt");
			System.out.println("Available bytes in the file:" + inputstream.available());
			inputstream.read(array);
			System.out.println("hello");
			String data = new String(array);
			System.out.println(data);
			inputstream.close();
		} catch (Exception e) {
			e.getStackTrace();
		}

	}
}
