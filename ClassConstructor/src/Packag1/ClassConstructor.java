package Packag1;

public class ClassConstructor {

	public static void main(String[] args) {
		CubeVolume vol = new CubeVolume();
		System.out.println(vol.getCubeVolume());
		
		CubeVolume vol2 = new CubeVolume(11,11,22);
		System.out.println(vol2.getCubeVolume());
	}

}
