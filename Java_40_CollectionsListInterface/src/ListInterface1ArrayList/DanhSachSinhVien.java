package ListInterface1ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * List Interface:
 * 		ArrayList
 * */

public class DanhSachSinhVien {
	private ArrayList<SinhVien> danhSachSinhVien;
	
	//Constructor:
	public DanhSachSinhVien() {
		this.danhSachSinhVien = new ArrayList<SinhVien>();
	}

	public DanhSachSinhVien(ArrayList<SinhVien> danhSachSinhVien) {
		this.danhSachSinhVien = danhSachSinhVien;
	}
	

	//1. Them sinh vien:
	public void themSinhVien(SinhVien sv) {
		this.danhSachSinhVien.add(sv);
	}
	
	//2. In danh sach sinh vien:
	public void inDanhSachSinhVien() {
		for(SinhVien sv: danhSachSinhVien ) {
			System.out.println(sv);
		}
	}
	
	//3. Kiem tra danh sach rong hay khong:
	public boolean kiemTraDanhSachRongHayKhong() {
		return this.danhSachSinhVien.isEmpty();
	}
	
	//4. Lay so luong sinh vien trong danh sach:
	public int laySoLuongSinhVien() {
		return this.danhSachSinhVien.size();
	}
	
	//5. Lam rong danh sach sinh vien:
	public void lamRongDanhSach() {
		this.danhSachSinhVien.removeAll(danhSachSinhVien);
	}
	
	//6. Kiem tra sinh vien co ton tai hay khong:
	public boolean kiemTraTonTai(SinhVien sv) {
		return this.danhSachSinhVien.contains(sv);
	}
	
	//7. Xoa 1 sinh vien khoi danh sach:
	public boolean xoaKhoiDanhSach(SinhVien sv) {
		return this.danhSachSinhVien.remove(sv);
	}
	
	//8. Tim kiem tat ca sinh vien dua tren ten nhap tu ban phim:
	public void timTatCaSinhVienTheoTen(String tenSV) {
		for(SinhVien sv: danhSachSinhVien) {
			if(sv.getHoVaTen().indexOf(tenSV) >= 0) {
				System.out.println(sv);
			}
		}
	}
	
	//9. Hien thi sinh vien co diem tu cao den thap:
	public void hienThiSinhVienDiemCaoDenThap() {
		Collections.sort(danhSachSinhVien, new Comparator<SinhVien>() {

			@Override
			public int compare(SinhVien o1, SinhVien o2) {
				if(o1.getDiemTrungBinh() < o2.getDiemTrungBinh()) {
					return 1;
				} else if (o1.getDiemTrungBinh() > o2.getDiemTrungBinh()) {
					return -1;
				} else {
					return 0;
				}
			}
			
		});;
	}
	
	
	
}
