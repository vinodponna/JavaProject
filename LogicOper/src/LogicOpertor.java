import java.util.Scanner;

public class LogicOpertor {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scaneng = new Scanner(System.in);
		System.out.println("Marks scored in Eng");
		int eng = scaneng.nextInt();
		@SuppressWarnings("resource")
		Scanner scanmat = new Scanner(System.in);
		System.out.println("Marks scored in Math");
		int math = scanmat.nextInt();
		@SuppressWarnings("resource")
		Scanner scanphy = new Scanner(System.in);
		System.out.println("Marks scored in Phy");
		int phy = scanphy.nextInt();
		
		double percen= (eng+math+phy)/3;
	
		if((eng >= 35) && (math >= 35) && (phy >= 35))
		{
			if (percen >= 70)
			{
				System.out.println("Congs You passed in Distinct");
			}
			if ((percen < 70) && (percen >= 50))
			{
				System.out.println("First Class");
			}
			if ((percen < 50) && (percen >= 35))
			{
				System.out.println("Second Class");
			}
		}
		else
		{
			System.out.println("Sorry. You Failed. Try next year");
		}
				
		System.out.println("Percentage is " + percen +"%");
		

	}

}
