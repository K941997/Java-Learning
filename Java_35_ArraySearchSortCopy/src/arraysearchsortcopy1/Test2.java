package arraysearchsortcopy1;

import java.util.Arrays;

public class Test2 {
	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien(100, "Cuong", "Lop 1", 9);
		SinhVien sv2 = new SinhVien(150, "An", "Lop 2", 10);
		SinhVien sv3 = new SinhVien(100, "Dat", "Lop 3", 12);
		SinhVien sv4 = new SinhVien(99, "Chinh", "Lop 4", 11);
		SinhVien[] arraySv = new SinhVien[]{sv1, sv2, sv3};
		
		//Show Array:
		System.out.println("Mang ban dau: " +arraySv); //-> dung` Arrays.toString()
		System.out.println("Mang ban dau: " +Arrays.toString(arraySv));
		
		//Show Array Sort:
		Arrays.sort(arraySv);
		System.out.println("Sau khi sap xep: " +Arrays.toString(arraySv));
		
		//Search:
		System.out.println("Tim` kiem' sv1: " +Arrays.binarySearch(arraySv, sv1)); //1 -> co trong mang
		System.out.println("Tim` kiem' sv2: " +Arrays.binarySearch(arraySv, sv2)); //0 -> co trong mang
		System.out.println("Tim` kiem' sv3: " +Arrays.binarySearch(arraySv, sv3)); //2 -> co trong mang
		System.out.println("Tim` kiem' sv4: " +Arrays.binarySearch(arraySv, sv4)); //-2 -> ko co trong mang
	}
}
