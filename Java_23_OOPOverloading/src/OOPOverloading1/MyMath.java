package OOPOverloading1;

/*
 * Nap chong` Overloading:
 * - Viet cac phuong thuc method ten giong' nhau, tham so' truyen` vao` khac nhau
 * */

public class MyMath {
	
	//Tim min:
	public int timMin(int a, int b) {
		if(a < b) {
			return a;
		} else {
			return b;
		}
	}
	
	public double timMin(double a, double b) {
		if(a < b) {
			return a;
		} else {
			return b;
		}
	}
	
	//Tinh tong:
	public int tinhTong(int a, int b) {
		return a + b;
	}
	
	public double tinhTong(double[] arr) {
		double tong = 0;
		for(int i = 0; i < arr.length; i++) {
			tong += arr[i];
		}
		return tong;
	}
}
