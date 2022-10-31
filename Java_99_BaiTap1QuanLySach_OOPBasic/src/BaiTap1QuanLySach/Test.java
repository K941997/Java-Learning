package BaiTap1QuanLySach;

public class Test {
	public static void main(String[] args) {
		Ngay ngay1 = new Ngay(15, 5, 2001);
		Ngay ngay2 = new Ngay(15, 9, 2030);
		Ngay ngay3 = new Ngay(15, 9, 2025);
		
		TacGia tacGia1 = new TacGia("Nguyen Ngoc Khanh", ngay1);
		TacGia tacGia2 = new TacGia("Nguyen Lan Nhi", ngay3);
		TacGia tacGia3 = new TacGia("Nguyen A", ngay2);
		
		Sach sach1 = new Sach("Lap trinh C", 5500, 2023, tacGia3);
		Sach sach2 = new Sach("Lap trinh Mang", 2500, 2029, tacGia2);
		Sach sach3 = new Sach("Lap trinh Java", 1100, 2029, tacGia1);
		
		//In ten sach:
		sach1.inTenSach();
		sach2.inTenSach();
		sach3.inTenSach();	
		
		//So sanh nam xuat ban:
		System.out.println("So sanh nam xuat ban Sach 1 va Sach 3: " +sach1.kiemTraCungNamXuatBan(sach3));
		System.out.println("So sanh nam xuat ban Sach 2 va Sach 3: " +sach2.kiemTraCungNamXuatBan(sach3));
		
		//Tinh gia sau khi giam:
		System.out.println("Gia Sach 1 sau khi giam 10%: " +sach1.giaSauKhiGiam(10));
		System.out.println("Gia Sach 2 sau khi giam 20%: " +sach2.giaSauKhiGiam(20));
		System.out.println("Gia Sach 3 sau khi giam 15%: " +sach3.giaSauKhiGiam(15));
	}
}
