
public class ExampleMath1Point {
	public static void main(String[] args) {
		int a = 5;
		boolean b = false;
		
		//Các phép toán 1 ngôi:
		System.out.println("a = " + a);
		System.out.println("+a => giá trị: " + (+a));
		System.out.println("-a => giá trị: " + (-a));
		
		System.out.println("a = " + a); //5
		System.out.println("++a => giá trị: " + (++a)); //+ xong = 6 rồi xuất ra => 6
		System.out.println("a++ => giá trị: " + (a++)); //xuất ra = 6 => 6 rồi mới + => xuất ra dòng dưới = 7 
		System.out.println("a = " + a); //7
		System.out.println("--a => giá trị: " + (--a)); //- xong = 6 rồi xuất ra => 6
		System.out.println("a-- => giá trị: " + (a--)); //xuất ra = 6 rồi mới - => xuất ra dòng dưới = 5
		System.out.println("a = " + a); //5
		
		System.out.println("!b => giá trị: " + (!b));
	}
}
