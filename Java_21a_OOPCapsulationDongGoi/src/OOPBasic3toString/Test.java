package OOPBasic3toString;

/*
 * toString():
 * - Trả về chuỗi
 * - Hiển thị md1 = MyDate@76ed5528 -> dung` toString = 9/4/1997
 * - Source -> Generate toString()
 * */

public class Test {
	public static void main(String[] args) {
		MyDate md1 = new MyDate(9, 4, 1997);
		MyDate md2 = new MyDate(10, 3, 2000);
		MyDate md3 = new MyDate(5, 5, 1999);
		
		System.out.println(md1); //-> MyDate@76ed5528 -> dung` toString = 9/4/1997
		System.out.println(md2);
		System.out.println(md3);
	}
}