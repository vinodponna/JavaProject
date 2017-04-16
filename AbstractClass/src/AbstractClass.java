
public class AbstractClass {

	public static void main(String[] args) {
		//Bank bak = new Bank(); // We can't create object for abstract call. we have to create reference from its subclass
		Bank bak = new Bank_abc(); 
		System.out.println(bak.getInterRate());

	}

}
