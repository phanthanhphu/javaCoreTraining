package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class exampleList {
	public static void main(String[] args) {
		List<String> listArray = new ArrayList<String>();
		listArray.add("Java");
		listArray.add("PHP");
		listArray.add("C");
		listArray.add("C#");
		for (String list : listArray) {
			System.out.println(list);
		}

		System.out.println("Size:" + listArray.size());
		System.out.println("Accessing the element:" + listArray.get(1));

		System.out.println("Set the elemnt");
		listArray.set(1, "Python");
		for (String list : listArray) {
			System.out.println(list);
		}
		
		String str = listArray.remove(2);
		System.out.println("Delete the elemnt");
		for (String list : listArray) {
			System.out.println(list);
		}
	
		System.out.println("");
		Collections.sort(listArray);
		System.out.println("Sort element: " + listArray );
		
		listArray.clear();
		System.out.println("Clean the elemnt");
		for (String list : listArray) {
			System.out.println(list);
		}
		

	}
}
