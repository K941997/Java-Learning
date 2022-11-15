package OverridingOverloading1;

public class Main {
	public static void main(String[] args) {
		SuperClass sup = new SuperClass();
		sup.tong2So(5, 5); //method 1
		sup.tong2So(5.5f, 5); //method 2
		sup.tong2So(6.5, 6); //method 3
		sup.tong2So(6.5f); //method 4
		
		SubClass sub = new SubClass();
		sub.tong2So(1, 1);
		
		
	}
}
