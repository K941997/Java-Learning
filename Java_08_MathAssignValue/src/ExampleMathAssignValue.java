import java.util.Scanner;

public class ExampleMathAssignValue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		//Nhap a:
		float a;
		System.out.println("Nhap a = ");
		a = sc.nextFloat();
		System.out.println("a = " + a);
		
		//Gán giá trị a = a + 3:
		a+=3;
		System.out.println("a+=3 = " + a);
		
		//Gán giá trị a = a - 2:
		a-=2;
		System.out.println("a-=2 = " + a);
		
		//Gán giá trị a = a * 3:
		a*=3;
		System.out.println("a*=3 = " + a);
		
		//Gan a = a / 3:
		a/=3;
		System.out.println("a/=3 = " + a);
		
		//Gan a = a % 3:
		a%=3;
		System.out.println("a%=3 = " + a);
	}
}
