
public class AccessMod {

	public static void main(String[] args) {
		// Access Modifiers Public/Private/Protected.
		// Access Level
		// Modifier		Class	Package	Subclass	World
		// Public		Y		Y		Y			Y
		// Protected	Y		Y		Y			N
		// No Modifier	Y		Y		N			N
		// Private		Y		N		N			N
		Student stu = new Student();
		stu.setAge(10);
		stu.setNum(123);
		System.out.println(stu.getAge() + stu.getNum());
		
		
		
		
	}

}
