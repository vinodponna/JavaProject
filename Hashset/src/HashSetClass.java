//List can contain duplicate element in ArryList of LinedList where as Set contains only unique elements

import java.util.*;

public class HashSetClass {

	public static void main(String[] args) {
		HashSet<String> set= new HashSet<String>();
		set.add("Vinod");
		set.add("Vinod");
		set.add("Ponna");
		set.add("Lavanya");
		set.add("Kummari");
		
		Iterator<String> abc = set.iterator();
		
		while(abc.hasNext())
			System.out.println(abc.next());
		
		
	}

}
