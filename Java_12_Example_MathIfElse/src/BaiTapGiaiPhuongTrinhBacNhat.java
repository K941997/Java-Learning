import java.util.Scanner;

public class BaiTapGiaiPhuongTrinhBacNhat {
	public static void main(String[] args) {
		//Bai tap: Giai PT Bac Nhat ax+b=0
		/*
		 * Neu a = 0
		 * 		Neu b = 0 => vo so nghiem
		 * 		Neu b != 0 => vo nghiem
		 * Neu a != 0
		 * 		Co nghiem x = -b/a
		 * */
		
		double x, a, b;
		Scanner sc = new Scanner(System.in);
		
		//Nhap a, b:
		System.out.println("Nhap a: ");
		a = sc.nextDouble();
		System.out.println("Nhap b: ");
		b = sc.nextDouble();
		
		//Tinh toan:
		if(a==0) {
			if(b==0) {
				System.out.println("PT vo so nghiem");
			} else {
				System.out.println("PT vo nghiem");
			}
		} else {
			x = -b/a;
			System.out.println("PT co nghiem x = " + x);
		}
	}
}
