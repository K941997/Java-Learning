import java.util.Scanner;

public class Example2TimSoNgayCuaThang {
	public static void main(String[] args) {
		//Bai tap: Tim so ngay cua thang trong nam (Câu lệnh SwitchCase)
		
		int thang, nam;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap vao thang: ");
		thang = sc.nextInt();
		System.out.println("Nhap vao nam: ");
		nam = sc.nextInt();
		
		switch (thang) {
			case 1: 
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("Co 31 ngay");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("Co 30 ngay");
				break;
			case 2:
				if((nam %4 ==0 && nam %100 !=0) || (nam %400 ==0)) {
					System.out.println("Co 29 ngay");
				} else {
					System.out.println("Co 28 ngay");
				}
				break;
			default:
				System.out.println("Nhap du lieu sai !");
				break;
		}
	}
}
