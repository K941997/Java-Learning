import java.util.Scanner;

public class ExampleMathIfElse {
	public static void main(String[] args) {
		//Bai tap: Kiem tra tinh chan~ le?
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		//Nhap n:
		System.out.println("Nhap so nguyen n: ");
		n = sc.nextInt();
		
		//Tinh toan:
		if(n%2==0) {
			System.out.println(n + " la so chan");
		} else {
			System.out.println(n + " la so le");
		}
	}
}
