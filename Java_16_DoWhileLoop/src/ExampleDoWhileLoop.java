import java.util.Scanner;

public class ExampleDoWhileLoop {
	//Vong` lap DoWhileLoop thuc thi truoc, kiem? tra dieu kien sau:
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Nhap vao n > 0");
			n = sc.nextInt();
		} while(n <= 0);
	}
}
