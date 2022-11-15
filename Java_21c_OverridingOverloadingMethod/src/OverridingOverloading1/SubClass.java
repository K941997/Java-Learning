package OverridingOverloading1;

/*
 * Overloading:
 * - Viet lai method giong' ten, khac' doi' so'
 * 
 * Overriding:
 * - Ke thua class cha va Viet lai method class cha
*/
 

public class SubClass extends SuperClass{

	@Override
	public int tong2So(int a, int b) {
		System.out.println("method 1 override");
		return a + (b*10);
	}
}
