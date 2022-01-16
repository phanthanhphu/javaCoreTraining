package list;

import java.util.LinkedList;

public class exampleLinkedList {
	public static void main(String[] args) {
	LinkedList<String> listLinked = new LinkedList<String>();
	listLinked.add("Java");
	listLinked.add("PHP");
	listLinked.add("C");
	listLinked.add("C++");
	listLinked.add("C#");
	
	System.out.println(listLinked);
	
	listLinked.removeFirst();
	System.out.println(listLinked);
	
	listLinked.removeLast();
	System.out.println(listLinked);
	
	listLinked.remove("PHP");
	System.out.println(listLinked);
	
	
	listLinked.clear();
	System.out.println(listLinked);
	}
}
