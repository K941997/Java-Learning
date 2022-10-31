import java.util.Scanner;

public class BaiTapGiaiPhuongTrinhBacHai {
	public static void main(String[] args) {
		//Bai tap: Giai PT Bac Hai ax^2 + bx + c = 0
		/*
		 * Cac bien can co: a, b, x1, x2, delta
		 * Neu a == 0 thi bao loi
		 * B1: delta = b^2 - 4ac
		 * B2: Kiem tra delta
		 * 		delta < 0 => pt vo nghiem
		 * 		delta == 0 => pt co nghiem kep la x1 = x2 = -b/2a
		 * 		delta > 0 => pt co 2 nghiem
		 * 			x1 = (-b-sqrt(delta))/(2a)
		 * 			x2 = (-b+sqrt(delta))/(2a) 
		 * */
		
		double a, b, c, x1, x2, delta;
		Scanner sc = new Scanner(System.in);
		
		//Nhap a,b,c:
		System.out.println("Nhap a: ");
		a = sc.nextDouble();
		
		System.out.println("Nhap b: ");
		b = sc.nextDouble();
		
		System.out.println("Nhap c: ");
		c = sc.nextDouble();
		
		//Delta = b^2 - 4ac:
		delta = Math.pow(b, 2) - 4*a*c;
		
		//Kiem tra delta:
		if(a==0) {
			System.out.println("Nhap du lieu sai!");
		} else {
			if(delta < 0) {
				System.out.println("PT vo nghiem");
			} else if(delta == 0) {
				x1 = -b/(2*a);
				System.out.println("PT co nghiem kep la x1 = x2 = " + x1);
			} else if (delta > 0) {
				System.out.println("PT co 2 nghiem phan biet: ");
				x1 = (-b-Math.sqrt(delta))/(2*a);
				x2 = (-b+Math.sqrt(delta))/(2*a);
				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
			}
		}
	}
}
