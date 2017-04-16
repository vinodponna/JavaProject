import java.util.Scanner;

public class SwitchClass {

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
		
		int percen= (eng+math+phy)/3;
		
		switch(percen)
		{
		case 80 :
		case 70 :
			System.out.println("Congs You passed in Distinct");
			break;
		case 60:
		case 50:
			System.out.println("First Class");
			break;
		case 40:
			System.out.println("Second Class");
			break;
		default:
			System.out.println("Failed ");
			break;
		}

	}

}
