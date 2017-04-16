
public class MainClass {

	public static void main(String[] args) {
	
		SecondCalss vinod= new SecondCalss(); // Vinod -> object / Instance
		vinod.age = 10;
		vinod.id = 123;
		vinod.name="vinod ponna";
		
		System.out.println(vinod.name + " is " + vinod.age + " and id is " + vinod.id);
		
		SecondCalss lavanya= new SecondCalss(); // Lavanya -> object / Instance
		lavanya.setAge(8);						// Encapsulation
		lavanya.setId(124);
		lavanya.setName("Lavanya Kummar");
		
		System.out.println(lavanya.getName().toUpperCase() + " is " + lavanya.getAge() + " and id is " + lavanya.getId());
		

	}

}
