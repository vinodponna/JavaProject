import java.util.LinkedList;

// similar to ArrayList that contain list  value of values.
public class LinkedListClass {

	public static void main(String[] args) {
		LinkedList<String> name= new LinkedList();
		name.add("vinod");
		name.add("kumar");
		name.add("ponna");
		name.addFirst("Lavanya");
		name.addLast("Kummari");
	//	name.removeLast();
	//	name.removeFirst();
	//	name.clear();
		name.add(3, "XFRE");
		name.remove(2);
		name.set(3, "Change");
		System.out.println(name.size());
		for (String x : name)
			System.out.println(x);

	}

}




//LinkedList element Insertion is faster compared to ArrayList
//LinkedList deletion is faster compared to ArrayList. 
//LinkedList uses pointers where as ArrayList uses Index whenever we insert in ArrayList it has to precise the array list definition. where as in LinkedList it not that case so it is faster than ArrayList.
//LinkedList has more memory overhead than ArrayList because in ArrayList each index only holds actual object but in case of LinkedList it holds both data and the address of next and previous nodes.
/*ArrayList search operation is faster than the LinkedList search operation.
 * 
 * 
 * 
 */
