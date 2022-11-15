package OverridingOverloading1;

/*
 * Overloading:
 * - Viet lai method giong' ten, khac' doi' so'
 * 
 * Overriding:
 * - Ke thua class cha va Viet lai method class cha
*/

public class SuperClass {
	
	//Method + Overload Method:
	public int tong2So(int a, int b) {
		System.out.println("method 1");
		return a + b;
	}

	public float tong2So(float a, int b) {
		System.out.println("method 2"); 
		return a + b;
	}
	
	public double tong2So(double a, int b) {
		System.out.println("method 3");
		return a + b;
	}
	
	public float tong2So(float a) {
		System.out.println("method 4");
		return a + 10;
	}
}
