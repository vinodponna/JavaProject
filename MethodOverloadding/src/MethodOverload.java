
public class MethodOverload {

	public static void main(String[] args) {
		System.out.println(add(1,2,3));
		System.out.println(add(1.2,2.4,3.6));
		System.out.println(add("Vinod ","Lavanya "," Forever"));

	}
	
	public static int add(int a, int b, int c)
	{
		return (a+b+c);
	}
	
	public static double add(double a, double b, double c)
	{
		return (a+b+c);
	}
	
	public static String add(String a, String b, String c)
	{
		return (a+b+c);
	}
}
