package ListInterface1ArrayList;

import java.util.Scanner;

/*
 * List Interface:
 * 		ArrayList
 * */

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DanhSachSinhVien danhSachSinhVien = new DanhSachSinhVien();
		
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
					+ "0. Thoat"
			);
			
			luaChon = sc.nextInt();
			sc.nextLine(); //Xuong dong
			
			if(luaChon == 1) {
				System.out.println("Nhap ma sinh vien: ");
				String maSinhVien = sc.nextLine();
				
				System.out.println("Nhap ho va ten: ");
				String hoVaTen = sc.nextLine();
				
				System.out.println("Nhap nam sinh: ");
				int namSinh = sc.nextInt();
				
				System.out.println("Nhap diem trung binh: ");
				float diemTrungBinh = sc.nextFloat();
				
				SinhVien sinhVien = new SinhVien(maSinhVien, hoVaTen, namSinh, diemTrungBinh);
				danhSachSinhVien.themSinhVien(sinhVien);
			
			} else if(luaChon == 2) {
				System.out.println("Danh sach sinh vien: ");
				danhSachSinhVien.inDanhSachSinhVien();
				
			} else if(luaChon == 3) {
				System.out.println("Danh sach rong: " +danhSachSinhVien.kiemTraDanhSachRongHayKhong());
				
			} else if(luaChon == 4) {
				System.out.println("So luong sinh vien: " +danhSachSinhVien.laySoLuongSinhVien());
				
			} else if(luaChon == 5) {
				System.out.println("Lam rong danh sach: ");
				danhSachSinhVien.lamRongDanhSach();
				
			} else if(luaChon == 6) {
				System.out.println("Nhap ma sinh vien: " );
				String maSinhVien = sc.nextLine();
				SinhVien sv = new SinhVien(maSinhVien);
				System.out.println("Kiem tra sinh vien co ton tai: " +danhSachSinhVien.kiemTraTonTai(sv));
			
			} else if(luaChon == 7) {
				System.out.println("Nhap ma sinh vien: ");
				String maSinhVien = sc.nextLine();
				SinhVien sv = new SinhVien(maSinhVien);
				System.out.println("Kiem tra xoa sinh vien: " +danhSachSinhVien.xoaKhoiDanhSach(sv));
			
			} else if(luaChon == 8) {
				System.out.println("Ten sinh vien: ");
				String tenSinhVien = sc.nextLine();
				System.out.println("Tim kiem tat ca sinh vien dua tren ten: ");
				danhSachSinhVien.timTatCaSinhVienTheoTen(tenSinhVien);
			
			} else if(luaChon == 9) {
				System.out.println("Hien thi sinh vien diem cao den thap: ");
				danhSachSinhVien.hienThiSinhVienDiemCaoDenThap();
				danhSachSinhVien.inDanhSachSinhVien();
			}
			
		} while(luaChon != 0);
	}
}
