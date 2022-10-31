package BaiTap5QuanLyPhuongTien;

public class Test {
	public static void main(String[] args) {
		HangSanXuat hang1 = new HangSanXuat("Hang 1", "VN");
		HangSanXuat hang2 = new HangSanXuat("Hang 2", "USA");
		HangSanXuat hang3 = new HangSanXuat("Hang 3", "JP");
		
		PhuongTienDiChuyen phuongTien1 = new MayBay(hang1, "Truong Hai");
		PhuongTienDiChuyen phuongTien2 = new Oto(hang2, "Castrol");
		PhuongTienDiChuyen phuongTien3 = new XeDap(hang3);
		MayBay phuongTien4 = new MayBay(hang1, "Xang");
		
		System.out.println("Hang san xuat: ");
		System.out.println("Phuong tien 1: " +phuongTien1.layTenHangSanXuat());
		System.out.println("Phuong tien 2: " +phuongTien2.layTenHangSanXuat());
		System.out.println("Phuong tien 3: " +phuongTien3.layTenHangSanXuat());
		System.out.println("--------------------");
		
		System.out.println("Lay van toc: ");
		System.out.println("Phuong tien 1: " +phuongTien1.layVanToc());
		System.out.println("Phuong tien 2: " +phuongTien2.layVanToc());
		System.out.println("Phuong tien 3: " +phuongTien3.layVanToc());
		System.out.println("--------------------");
		
		System.out.println("Bat dau: ");
		phuongTien1.batDau();
		System.out.println("--------------------");
		
		System.out.println("Cat canh: ");
//		phuongTien1.catCanh(); //-> khong dung duoc Method cua Class MayBay
		phuongTien4.catCanh();
		System.out.println("--------------------");
		
	}
}
