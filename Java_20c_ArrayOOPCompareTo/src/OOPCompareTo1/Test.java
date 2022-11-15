package OOPCompareTo1;

/*
 * OOP CompareTo so sanh theo thu tu >, <, = cho doi tuong
 * */

public class Test {
	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien(100, "Cuong", "Lop 1", 9);
		SinhVien sv2 = new SinhVien(150, "An", "Lop 2", 10);
		SinhVien sv3 = new SinhVien(100, "Dat", "Lop 3", 12);
		SinhVien sv4 = new SinhVien(99, "Chinh", "Lop 4", 11);
		
		System.out.println(sv1.compareTo(sv2)); //2 vi` C dung sau A
		System.out.println(sv1.compareTo(sv3)); //-1 vi` C dung truoc D
		System.out.println(sv1.compareTo(sv4)); //13 vi` Cu dung sau Ch
	}
}
