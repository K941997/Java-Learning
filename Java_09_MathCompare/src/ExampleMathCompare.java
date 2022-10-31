import java.util.Scanner;

public class ExampleMathCompare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		
		//Nhap a, b:
		System.out.println("Nhap a = ");
		a = sc.nextInt();
		System.out.println("Nhap b = ");
		b = sc.nextInt();
		
		//Các phép toán so sánh (Compare):
		System.out.println(a+ " = " +b+ " : " +(a==b));
		System.out.println(a+ " != " +b+ " : " +(a!=b));
		System.out.println(a+ " < " +b+ " : " +(a<b));
		System.out.println(a+ " <= " +b+ " : " +(a<=b));
		System.out.println(a+ " > " +b+ " : " +(a>b));
		System.out.println(a+ " >= " +b+ " : " +(a>=b));
		System.out.println("----------");
		System.out.println("Ca 2 la so chan: " +(a%2==0 && b%2==0));
		System.out.println("Co it nhat 1 so chan: " +(a%2==0 || b%2==0));
	}
}
