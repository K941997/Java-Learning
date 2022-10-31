import java.util.Scanner;

public class ExampleScannerSystemIn {
	public static void main(String[] args) {
		//Nhập dữ liệu vào:
		Scanner sc = new Scanner(System.in);
		
		//Nhap ho va ten:
		System.out.println("Nhap ho va ten: ");
		String hoVaTen = sc.nextLine();
		
		//Nhap ma sinh vien:
		System.out.println("Nhap ma sinh vien: ");
		long maSinhVien = sc.nextLong();
		
		//Nhap diem thi:
		System.out.println("Nhap diem thi: ");
		float diemThi = sc.nextFloat();
		
		//Hien thi man hinh:
		System.out.println("------------");
		System.out.println("Ho va ten: " + hoVaTen);
		System.out.println("Ma sinh vien: " + maSinhVien);
		System.out.println("Diem thi: " + diemThi);
	}
}
