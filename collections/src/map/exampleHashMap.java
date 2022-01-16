package map;

import java.util.HashMap;
import java.util.Map;

public class exampleHashMap {
	public static void main(String[] args) {
		Map<String, String> listHaspMap = new HashMap<String, String>();
		listHaspMap.put("Welcom", "Java");
		listHaspMap.put("Hello", "PHP");
		listHaspMap.put("Hi", "Python");
		listHaspMap.put("Bye", "Javascript");
		listHaspMap.put(null,null); // Null ?
//		listHaspMap                //null1 no ?
		System.out.println(listHaspMap);

		System.out.println(listHaspMap.size());

		System.out.println(listHaspMap.get("Welcom"));

		listHaspMap.remove("Welcom");
		System.out.println(listHaspMap);

		System.out.println(listHaspMap.containsKey("Bye"));

		listHaspMap.clear();
		System.out.println(listHaspMap);

	}
}
