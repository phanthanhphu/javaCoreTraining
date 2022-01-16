package controlflow;

import java.util.ArrayList;
import java.util.List;

public class exampleforeach {
   public static void main(String[] args) {
	   List<String> list = new ArrayList<String>();
	   list.add("Java");
	   list.add("PHP");
	   list.forEach(n->System.out.println(n));// java 7
   }
}
