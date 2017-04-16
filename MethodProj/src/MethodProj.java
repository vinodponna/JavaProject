
public class MethodProj {

	public static void main(String[] args) {
		mymethod("vinod"," ponna");
		math(23,43);
		math(45,43);
		math(66,43);
		int sum = mathret(99,43);
		System.out.println(sum);
	}
	
	public static void mymethod(String name, String last)
	{
		System.out.println("Hello " + name + last);
	}
	
	public static void math (int a, int b)
	{
		System.out.println(a+b);
	}
//returning value from method	
	public static int mathret (int a, int b)
	{
		return (a+b);
	}

}
