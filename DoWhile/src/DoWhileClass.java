import java.util.Scanner;

public class DoWhileClass {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
	
		int num = 0;
		
		while (num == 20)
		{
			
		Scanner guess = new Scanner(System.in);
		System.out.println("Guess the number");
		num = guess.nextInt();
			if (num != 20)
			{
				System.out.println("Incorrect Guess");
			}
			else
			{
				System.out.println("Smart Guess");
			}
		}
	}

}
