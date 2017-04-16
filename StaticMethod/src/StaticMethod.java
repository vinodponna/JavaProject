
public class StaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hello msg= new Hello();
		System.out.println(Hello.DoSomething("Hi Vinod"));
		System.out.println(msg.DoSomething("Hi Lavanya"));
		System.out.println(msg.DoSomethingElse("Hello All"));
		//msg.DoSomething("Hi Lavanya"); // method with static will be called directly with class name. no need of to call with instance name. which is not correct way of coding.
		
		Hello age1 = new Hello();
		age1.age = 10;				// Even variable with static will be called directly with class name. no need of to call with instance name. which is not correct way of coding.
		System.out.println(age1.age); 
		Hello.age = 20;
		System.out.println(Hello.age);
	}

}
