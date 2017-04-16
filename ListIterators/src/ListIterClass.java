/* public boolean hasNext();
 * public object next();
 * public boolean hasPrevious();
 * public object previous();
 */

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterClass {

	public static void main(String[] args) {
		ArrayList<String> arry = new ArrayList<String>();
		arry.add("Vinod");
		arry.add("Kumar");
		arry.add("Ponna");
		arry.add("Lavanya");
		arry.add("Kummari");
		
		ListIterator<String> abc = arry.listIterator();
		while(abc.hasNext())
			System.out.println(abc.next());
		System.out.println("-------------");
		
		while(abc.hasPrevious())
			System.out.println(abc.previous());
	}

}
