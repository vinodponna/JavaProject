
public class StaticClass {
	public static void main (String[] args)
	{
		Student Vinod = new Student();
		System.out.println(Student.sum());
		Student Kumar = new Student();
		System.out.println(Student.sum());
		Student Ponna = new Student();
		
		System.out.println(Student.sum());
	}
}
