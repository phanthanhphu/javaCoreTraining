package queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class exampleQueue {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		queue.offer("One");
		queue.offer("Two");
		queue.offer("Three");
		queue.offer("Four");
		queue.offer("Five");

		System.out.println("Number: " + queue);
		
		System.out.println("Poll: " + queue.poll());

		System.out.println("Head: " + queue.element());
	
		int size = queue.size();
		System.out.println("Size of queue:" + size);
		
		queue.remove("Five");
		System.out.println("List: " +queue);

	}
}
