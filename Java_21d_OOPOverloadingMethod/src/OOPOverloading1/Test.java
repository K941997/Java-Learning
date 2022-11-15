package OOPOverloading1;

public class Test {
	public static void main(String[] args) {
		MyMath myMath1 = new MyMath();
		
		//Tim min:
		System.out.println("Tim` min int (5, 2): " +myMath1.timMin(5, 2));
		System.out.println("Tim` min double (5.5, 2.2): " +myMath1.timMin(5.5, 2.2));
	
		//Tinh tong:
		System.out.println("Tinh tong (5, 2): " +myMath1.tinhTong(5, 2));
		
		double arr[] = new double[] {1,2,3,4,5};
		System.out.println("Tinh tong mang arr: " +myMath1.tinhTong(arr));
		
	}
}
