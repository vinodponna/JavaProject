
public class HandleExcep {

	public static void main(String[] args) {
		int[] str = new int[2];
		try {
			//int a = 100/0;
			System.out.println(str[4]);
		} catch (ArithmeticException e)
		{
			System.out.println(e);
			
		}catch (Exception e)	// Exception has highest priority then other Exceptions like ArithematicExpection which declared above. If we move catch bloc of Exception above ArithematicExepction it will throw an error.
		{
			System.out.println(e);
		}
			System.out.println("-----------------");
	}

}
