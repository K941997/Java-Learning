package BaiTap4QuanLyMayTinh;

public class Test {
	public static void main(String[] args) {
		NgaySanXuat ngay1 = new NgaySanXuat(15, 8, 2025);
		NgaySanXuat ngay2 = new NgaySanXuat(1, 3, 2025);
		NgaySanXuat ngay3 = new NgaySanXuat(6, 9, 2025);
		
		QuocGia quocGia1 = new QuocGia("VN", "Viet Nam");
		QuocGia quocGia2 = new QuocGia("USA", "My");
		QuocGia quocGia3 = new QuocGia("PL", "Ba Lan");
		
		HangSanXuat hang1 = new HangSanXuat("VNLap", quocGia1);
		HangSanXuat hang2 = new HangSanXuat("macbook", quocGia2);
		HangSanXuat hang3 = new HangSanXuat("Asus", quocGia3);
		
		MayTinh mayTinh1 = new MayTinh(hang1, ngay1, 1500, 12);
		MayTinh mayTinh2 = new MayTinh(hang2, ngay2, 2000, 24);
		MayTinh mayTinh3 = new MayTinh(hang3, ngay3, 1000, 12);
		
		System.out.println("So sanh gia: ");
		System.out.println("Gia may tinh 1 vs Gia may tinh 2: " +mayTinh1.kiemTraGiaThapHon(mayTinh2));
		System.out.println("Gia may tinh 1 vs Gia may tinh 3: " +mayTinh1.kiemTraGiaThapHon(mayTinh3));
		System.out.println("Gia may tinh 2 vs Gia may tinh 3: " +mayTinh2.kiemTraGiaThapHon(mayTinh3));
		System.out.println("-------------");
		
		System.out.println("Lay ten quoc gia: ");
		System.out.println("May tinh 1 o quoc gia: " +mayTinh1.layTenQuocGia());
		System.out.println("May tinh 2 o quoc gia: " +mayTinh2.layTenQuocGia());
		System.out.println("May tinh 3 o quoc gia: " +mayTinh3.layTenQuocGia());
	}
}
