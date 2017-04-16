// Java utility allows ArrayList which allows to store dynamic arrays
import java.util.ArrayList;
public class ArryListClass {
	public static void main(String[] args)
	{
		int simple_array[]= new int [5];
		ArrayList<Integer> mylist = new ArrayList<Integer>(5);
		mylist.add(1);
		mylist.add(2);
		mylist.add(3);
		mylist.add(4);
		mylist.add(5);
		mylist.add(6);
		mylist.add(7);
		mylist.add(18);
		
		for (Integer i : mylist)
			System.out.println(i);
		
		System.out.println(mylist.size());
		mylist.remove(2);
		
		System.out.println("------------");
		for (Integer i : mylist)
			System.out.println(i);
		
		System.out.println(mylist.size());
		
		//mylist.clear();
		
		System.out.println("------------");
		for (Integer i : mylist)
			System.out.println(i);
		
		System.out.println(mylist.size());
		
		mylist.set(0, 100);
		
		System.out.println("------------");
		for (Integer i : mylist)
			System.out.println(i);
		System.out.println(mylist.size());
		
	}
}
