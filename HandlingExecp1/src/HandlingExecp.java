//the finally block always executes when try block exists.
//this ensure that finally block is executed even if an unexpected exception occurs.
// good to use finally when we use try catch

public class HandlingExecp {
	public static void main(String[] args){
		try{
			int a=100/0;
			System.exit(1); // in this scenario finally block can't be executed. comment the int a code.
		}catch (Exception e){
			System.out.println("catch called");
			System.out.println(e);
		}finally {
			System.out.println("finally called");
		}
	}
}
