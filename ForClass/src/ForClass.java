
public class ForClass {

	public static void main(String[] args) {
		int[] array1={1,4,2,6,3,8,11,45,33,78,22,9};
		//int i;
		for (int i=0;i<=11;i++)
		{
			System.out.println(array1[i]);
		}
		System.out.println("-----------");
		for (int element : array1)
		{
			System.out.println(element);
		}
	}

}
