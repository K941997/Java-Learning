package ReadObjFromFile1;

import java.io.File;
import java.util.Scanner;


public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DanhSachSinhVien danhSachSV  = new DanhSachSinhVien();
		
		int luaChon = 0;
		
		do {
			System.out.println("---------- MENU ----------");
			System.out.println("----- Vui long lua chon chuc nang: -----");
			System.out.println(
					"1. Them sinh vien vao danh sach \n"
					+ "2. In danh sach sinh vien ra man hinh \n"
					+ "3. Kiem tra danh sach co rong hay khong \n"
					+ "4. Lay so luong sinh vien trong danh sach \n"
					+ "5. Lam rong danh sach sinh vien \n"
					+ "6. Kiem tra sinh vien co ton tai trong danh sach ko, dua tren ma sinh vien \n"
					+ "7. Xoa 1 sinh vien ra khoi danh sach \n"
					+ "8. Tim kiem tat ca sinh vien dua tren ten duoc nhap tu ban phim \n"
					+ "9. Xuat ra sinh vien co diem tu cao den thap \n"
					+ "10. Luu danh sach sinh vien xuong file \n"
					+ "11. Doc danh sach sinh vien tu tap file \n"
					+ "0. Thoat"
			);
			
			luaChon = sc.nextInt();
			sc.nextLine();
			
			if(luaChon == 1) {
				System.out.println("Nhap ma sinh vien: ");
				String maSinhVien = sc.nextLine();
				
				System.out.println("Nhap ho va ten sinh vien: ");
				String hoVaTen = sc.nextLine();
				
				System.out.println("Nhap nam sinh: ");
				int namSinh = sc.nextInt();
				
				System.out.println("Nhap diem trung binh: ");
				float diemTrungBinh = sc.nextFloat();
				
				SinhVien sinhVien = new SinhVien(maSinhVien, hoVaTen, namSinh, diemTrungBinh);
				danhSachSV.themSinhVien(sinhVien);
				
			} else if(luaChon == 2) {
				System.out.println("Danh sach sinh vien: ");
				danhSachSV.inDanhSachSinhVien();
				
			} else if(luaChon == 3) {
				System.out.println("Danh sach co rong khong: " +danhSachSV.kiemTraDanhSachRongHayKhong());
	
			} else if(luaChon == 4) {
				System.out.println("So luong sinh vien: " +danhSachSV.laySoLuongSinhVien());
			
			} else if(luaChon == 5) {
				System.out.println("Lam rong danh sach: ");
				danhSachSV.lamRongDanhSach();
			
			} else if(luaChon == 6) {
				System.out.println("Nhap ma sinh vien: ");
				String maSinhVien = sc.nextLine();
				SinhVien sinhVien = new SinhVien(maSinhVien);
				System.out.println("Kiem tra co ton tai khong: " +danhSachSV.kiemTraTonTaiHayKhong(sinhVien));
			
			} else if(luaChon == 7) {
				System.out.println("Nhap ma sinh vien muon xoa: ");
				String maSinhVien = sc.nextLine();
				SinhVien sinhVien = new SinhVien(maSinhVien);
				danhSachSV.xoaSinhVienKhoiDanhSach(sinhVien);
			
			} else if(luaChon == 8) {
				System.out.println("Nhap ten sinh vien muon tim: ");
				String tenSinhVien = sc.nextLine();
				danhSachSV.timTatCaSinhVienTheoTen(tenSinhVien);
			
			} else if(luaChon == 9) {
				System.out.println("Danh sach sinh vien diem cao den thap: ");
				danhSachSV.hienThiSinhVienDiemTuCaoDenThap();
				danhSachSV.inDanhSachSinhVien();
			
			} else if(luaChon == 10) {
				System.out.println("Nhap ten File: ");
				String tenFile = sc.nextLine();
				File file = new File(tenFile);
				danhSachSV.luuDanhSachSinhVienXuongFile(file);
			
			} else if(luaChon == 11) {
				System.out.println("Doc danh sach sinh vien tu File: ");
				String tenFile = sc.nextLine();
				File file = new File(tenFile);
				danhSachSV.docDuLieuTuFile(file);
			}
			
		} while (luaChon != 0);
	}
}
