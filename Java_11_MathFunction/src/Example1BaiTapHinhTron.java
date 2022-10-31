import java.util.Scanner;

public class Example1BaiTapHinhTron {
	public static void main(String[] args) {
		//Các hàm toán học trong Class Math:
		Scanner sc = new Scanner(System.in);
		double banKinh, dienTich, chuVi;
		
		//Nhap ban kinh:
		System.out.println("Nhap ban kinh r: ");
		banKinh = sc.nextDouble();
		
		//Tinh chu vi:
		chuVi = 2*Math.PI*banKinh;
		System.out.println("Chu vi = " + chuVi);
		System.out.println("Chu vi = " + Math.round(chuVi));
		System.out.println("Chu vi = " + Math.round(chuVi*100.0)/100.0);
		
		//Tinh dien tich:
		dienTich = Math.PI*Math.pow(banKinh, 2);
		System.out.println("Dien tich = " + dienTich);
		System.out.println("Dien tich = " + Math.round(dienTich));
		System.out.println("Dien tich = " + Math.round(dienTich*100.0)/100.0);
	}
}
