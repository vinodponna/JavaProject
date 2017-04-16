
public class Recursion {
	public static void main(String[] args){
		int sum = add(2,3);
		System.out.println(sum);
		
		int factorial = fact(4);
		System.out.println(factorial);
	}
	public static int add(int a,int b){
		return (a+b);
	}
	public static int fact(int n){
		if (n<=1)
			return 1;
		else
			return (n * fact(n-1)); // calling same fact method
			
	}

}

// java allows to call its method by itself which called recurssion.
