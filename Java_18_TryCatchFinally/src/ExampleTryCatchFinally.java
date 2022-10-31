import java.util.Scanner;

public class ExampleTryCatchFinally {
	//TryCatchFinally: Bắt lỗi
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		
//		try {
//			System.out.println("Nhap so nguyen n: ");
//			n = sc.nextInt();
//		} catch(Exception e) {
//			System.out.println("Nhap du lieu khong dung");
//		}
		
		try {
			System.out.println("Nhap so nguyen n: ");
			n = sc.nextInt();
		} catch(Exception e) {
			System.out.println("Nhap du lieu khong dung");
		} finally { //finally luôn chạy
			System.out.println("Finally!");
		}
		
		System.out.println("Gia tri n la: " +n);
		System.out.println("Ket thuc chuong trinh");
	}
}
