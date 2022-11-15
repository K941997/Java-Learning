package OOPBasic4EqualsHashcode;

/*
 * Equals Hashcode:
 * - equals(): so sánh =, tồn tại
 * - Dấu "==" so sánh bằng dùng được cho số, không dùng được cho đối tượng
 * - Phải dùng equals mới so sánh bằng cho đối tượng
 * - Source -> Generate hashcode() and equals()
 * */

public class Test {
	public static void main(String[] args) {
		MyDate md1 = new MyDate(28, 12, 2002);
		MyDate md2 = new MyDate(3, 4, 2001);
		MyDate md3 = new MyDate(28, 12, 2002);
		
		System.out.println(md1);
		System.out.println(md2);
		System.out.println(md3);
		
		//Dấu == chỉ dùng được cho số:
		int a = 5; 
		int b = 5;
		if(a == b) {
			System.out.println("a = b");
		} else {
			System.out.println("a != b");
		}
		
		//Dấu == không dùng được cho đối tượng:
		if(md1 == md3) {
			System.out.println("md1 = md3");
		} else {
			System.out.println("md1 != md3");
		}
		
		//Dùng equals để so sánh bằng đối tượng:
		System.out.println("md1 so sanh bang md3: " +md1.equals(md3));
		System.out.println("md1 so sanh bang md2: " +md1.equals(md2));
		
		//Dùng hàm băm hashcode để hash giá trị:
		System.out.println("md1 hashcode: " +md1.hashCode());
		System.out.println("md2 hashcode: " +md2.hashCode());
		System.out.println("md3 hashcode: " +md3.hashCode());
	}
}
