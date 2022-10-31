import java.util.Scanner;

public class ExampleMathBasic{
	public static void main(String[] args) {
		//Khai bao bien:
		int a, b;
		
		//Nhap du lieu:
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap a = ");
		a = sc.nextInt();	
		System.out.println("Nhap b = ");
		b = sc.nextInt();
		
		//Các phép toán cơ bản:
		int tong = a + b;
		System.out.println(a+" + "+b+" = "+tong);
		
		int hieu = a - b;
		System.out.println(a+" - "+b+" = "+hieu);
		
		int tich = a * b;
		System.out.println(a+" * "+b+" = "+tich);
		
		float thuong = (float) a / b;
		System.out.println(a+" / "+b+" = "+thuong);
		
		int soDu = a % b;
		System.out.println(a+" % "+b+" = "+soDu);
	}
}
