
public class StringProj {

	public static void main(String[] args) {
		String mystring = "Hello vinod";
		int length=mystring.length();
		String lowercase=mystring.toLowerCase();
		String uppercase=mystring.toUpperCase();
		System.out.println(mystring);
		System.out.println(length);
		System.out.println(lowercase);
		System.out.println(uppercase);
		System.out.println("----------");
		/* join two strinng using +*/
		String mystring1 = "Hello  " + "  vinod";
		int length1=mystring1.length();
		String lowercase1=mystring1.toLowerCase();
		String uppercase1=mystring1.toUpperCase();
		System.out.println(mystring1);
		System.out.println(length1);
		System.out.println(lowercase1);
		System.out.println(uppercase1);
		System.out.println("----------");
		// Replacing strings
		String mystring2 = "Hello  " + "  vinod";
		System.out.println(mystring2.replace('l','L'));
		System.out.println(mystring2.indexOf('l'));
	}

}
