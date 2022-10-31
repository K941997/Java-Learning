package Baitap3QuanLySinhVien;

public class Test {
	public static void main(String[] args) {
		NgaySinh ngay1 = new NgaySinh(15, 01, 2000);
		NgaySinh ngay2 = new NgaySinh(19, 7, 2002);
		NgaySinh ngay3 = new NgaySinh(19, 7, 2002);
		
		Lop lop1 = new Lop("DH1", "CNTT");
		Lop lop2 = new Lop("DH2", "KHMT");
		Lop lop3 = new Lop("DH3", "An ning mang");
		
		SinhVien sinhVien1 = new SinhVien("001", "Nguyen A", ngay1, lop1, 9.0);
		SinhVien sinhVien2 = new SinhVien("002", "Nguyen B", ngay2, lop2, 4.0);
		SinhVien sinhVien3 = new SinhVien("003", "Nguyen C", ngay3, lop3, 6.0);
		
		//Lay ten khoa:
		System.out.println("Ten khoa: ");
		System.out.println("Sinh vien 1 hoc khoa: " +sinhVien1.showTenKhoa());
		System.out.println("Sinh vien 2 hoc khoa: " +sinhVien2.showTenKhoa());
		System.out.println("Sinh vien 3 hoc khoa: " +sinhVien3.showTenKhoa());
		System.out.println("------------------");
		
		//Kiem tra sinh vien thi dat hay khong:
		System.out.println("Thi dat hay truot: ");
		System.out.println("Sinh vien 1 thi dat khong:  " +sinhVien1.kiemTraThiDatHayKhong());
		System.out.println("Sinh vien 2 thi dat khong: " +sinhVien2.kiemTraThiDatHayKhong());
		System.out.println("Sinh vien 3 thi dat khong: " +sinhVien3.kiemTraThiDatHayKhong());
		System.out.println("------------------");
		
		//Kiem tra ngay sinh trung nhau khong:
		System.out.println("Ngay sinh trung nhau hay khong: ");
		System.out.println("Ngay sinh Sinh Vien 1 va 2: " +sinhVien1.kiemTraNgaySinhTrungNhau(sinhVien2));
		System.out.println("Ngay sinh Sinh Vien 1 va 3: " +sinhVien1.kiemTraNgaySinhTrungNhau(sinhVien3));
		System.out.println("Ngay sinh Sinh Vien 2 va 3: " +sinhVien2.kiemTraNgaySinhTrungNhau(sinhVien3));
	}
}
