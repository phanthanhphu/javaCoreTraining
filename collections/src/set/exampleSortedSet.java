package set;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class exampleSortedSet {
	public static void main(String[] args) {

		SortedSet<String> st = new TreeSet<String>();
		st.add("India");
		st.add("Australia");
		st.add("USA");
		st.add("India");

		System.out.println(st);

		st.remove("Australia");
		System.out.println(st);
		//Phương thức contains() tìm kiếm chuỗi ký tự trong chuỗi này. Nó trả về true nếu chuỗi các giá trị char được tìm thấy trong chuỗi này, nếu không trả về false.
		String check = "Italia";
		System.out.println("Contais: "+ check + " " + st.contains(check));

		System.out.println("First value: " + st.first());

		System.out.println("Last value: " + st.last());

	}
}
