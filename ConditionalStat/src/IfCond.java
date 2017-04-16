import java.util.Scanner;

public class IfCond {

	public static void main(String[] args) {
		
	@SuppressWarnings("resource")
	Scanner Scan = new Scanner(System.in);
	System.out.println("Guess the number ");
	int x = Scan.nextInt();
	System.out.println("User Input : " + x);
	if (x != 20)
	{
		System.out.println("Opps Not correct Guess !!!");
	}
	else
	{
		System.out.println("Correct Guess !!!");
	}

	}

}
