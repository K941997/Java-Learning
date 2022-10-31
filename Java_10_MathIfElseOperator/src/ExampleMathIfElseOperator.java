import java.util.Scanner;

public class ExampleMathIfElseOperator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap a = ");
		int a = sc.nextInt();
		
		//Toán tử điều kiện MathIfElseOperator:
		String ketQua = (a%2==0)?"so chan":"so le";
		System.out.println(a+ " là " +ketQua);
	}
}
