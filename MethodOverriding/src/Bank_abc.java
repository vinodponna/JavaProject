
public class Bank_abc extends Bank{
	int getInterRate()	// Method Overridding will take same number of Arguments and same type of return values from the super class.
	   {
		   return 8;
	   }

	double getInterRate(int abd)	// Method Overloading which has different define type, different arguments, but same method name 
	   {
		   return 8;
	   }
}
