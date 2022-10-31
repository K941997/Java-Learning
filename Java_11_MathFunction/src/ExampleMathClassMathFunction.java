import java.util.Scanner;

public class ExampleMathClassMathFunction {
	public static void main(String[] args) {
		//Các hàm toán học trong Class Math:
		Scanner sc = new Scanner(System.in);
		double a, b;
		
		//Nhap a, b:
		System.out.println("Nhap so a = ");
		a = sc.nextDouble();
		System.out.println("Nhap so b = ");
		b = sc.nextDouble();
		
		//Ham tri tuyet doi:
		System.out.println("|a| = " + Math.abs(a));
		
		//Ham tim min:
		System.out.println("Min cua a, b = " + Math.min(a, b));
		
		//Ham tim max:
		System.out.println("Max cua a, b = " + Math.max(a, b));
		
		//Ham tim ceil:
		System.out.println("Ceil cua a = " + Math.ceil(a));
		
		//Ham tim floor:
		System.out.println("Floor cua a = " + Math.floor(a));
		
		//Ham tim can bac 2 sqrt:
		System.out.println("Sqrt cua a = " + Math.sqrt(a));
		
		//Ham tinh a^b:
		System.out.println("a^b = " + Math.pow(a, b));
	}
}
