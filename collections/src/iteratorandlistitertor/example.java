package iteratorandlistitertor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class example {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		//iterator ?
	    Iterator tr = list.iterator();
	    while(tr.hasNext()) {
	    	System.out.println(tr.next() +" ");
	    }
	    
	    System.out.println(" ");
	    
	    
	 // ListIterator ?
        ListIterator i = list.listIterator();
  
        System.out.println("ListIterator:");
        System.out.println("Forward Traversal : ");
  
        while (i.hasNext())
            System.out.print(i.next() + " ");
  
        System.out.println();
  
        System.out.println("Backward Traversal : ");
  
        while (i.hasPrevious())
            System.out.print(i.previous() + " ");
  
        System.out.println();
	}
}
	 

