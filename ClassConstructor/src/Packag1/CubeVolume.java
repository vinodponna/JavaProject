package Packag1;

public class CubeVolume {
	int height;
	int length;
	int width;
	
	public int getCubeVolume()
	{
		return (height * length * width);
	}
	
	CubeVolume ()	// constructor are the first method which called in a class and it will have the same name as class..
	{				// Constructors can't return any values. We can use constructors to initialize the values.
		System.out.println("Welcome");
		length = 10;
		height = 20;
		width = 40;
	}
	
	CubeVolume (int l, int h, int w)	
	{				
		System.out.println("Constructor Overloading");
		length = l;
		height = h;
		width = w;
	}
}
