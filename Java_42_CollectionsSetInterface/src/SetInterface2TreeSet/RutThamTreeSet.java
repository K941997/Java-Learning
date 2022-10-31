package SetInterface2TreeSet;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/*
 * Set Interface:
 * 		TreeSet:
 * 		- Hien thi du lieu khac nhau, khong trung nhau
 * 		- TreeSet sap xep co thu tu >< HashSet sap xep lon xon
 * 		- TreeSet cua SetInterface (App Dictionary) ben canh TreeMap cua MapInterface
 * */

public class RutThamTreeSet {
	Set<String> thungPhieuDuThuong = new TreeSet<String>();
	
	public RutThamTreeSet() {
		
	}
	
	public boolean themPhieu(String giaTri) {
		return this.thungPhieuDuThuong.add(giaTri);
	}
	
	public boolean xoaPhieu(String giaTri) {
		return this.thungPhieuDuThuong.remove(giaTri);
	}
	
	public boolean kiemTraPhieuTonTai(String giaTri) {
		return this.thungPhieuDuThuong.contains(giaTri);
	}
	
	public void xoaTatCaPhieuDuThuong() {
		this.thungPhieuDuThuong.clear();
	}
	
	public int soLuongPhieu() {
		return this.thungPhieuDuThuong.size();
	}
	
	public String rutTham1Phieu() {
		String ketQua = "";
		Random random = new Random();
		int viTri = random.nextInt(this.thungPhieuDuThuong.size());
		ketQua = (String) this.thungPhieuDuThuong.toArray()[viTri];
		return ketQua;
	}
	
	public void inRaTatCa() {
		System.out.println(Arrays.toString(this.thungPhieuDuThuong.toArray()));
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int luaChon = 0;
		RutThamTreeSet rutTham = new RutThamTreeSet();
		do {
			System.out.println("---------- Menu ----------");
			System.out.println("----- 1. Them ma so du thuong");
			System.out.println("----- 2. Xoa ma so du thuong");
			System.out.println("----- 3. Kiem tra ma so du thuong ton tai hay khong");
			System.out.println("----- 4. Xoa tat ca phieu du thuong");
			System.out.println("----- 5. So luong phieu du thuong");
			System.out.println("----- 6. Rut tham trung thuong");
			System.out.println("----- 7. In ra tat ca cac phieu");
			System.out.println("----- 0. Thoat");
			
			System.out.println("----- Nhap lua chon:");
			luaChon = sc.nextInt();
			sc.nextLine();
			if(luaChon == 1 || luaChon == 2 || luaChon == 3) {
				System.out.println("--- Nhap vao ma so");
				String giaTri = sc.nextLine();
				
				if(luaChon == 1) {
					System.out.println("Da them: " +rutTham.themPhieu(giaTri));
				} else if(luaChon == 2) {
					System.out.println("Da xoa: " +rutTham.xoaPhieu(giaTri));
				} else if(luaChon == 3) {
					System.out.println("Kiem tra phieu ton tai: " +rutTham.kiemTraPhieuTonTai(giaTri));
				}
			} else if(luaChon == 4) {
				rutTham.xoaTatCaPhieuDuThuong();
				System.out.println("Da xoa ");
			} else if(luaChon == 5) {
				System.out.println("So luong phieu la: " +rutTham.soLuongPhieu());
				
			} else if(luaChon == 6) {
				System.out.println("Rut tham ma so trung thuong la: " +rutTham.rutTham1Phieu());
			} else if(luaChon == 7) {
				System.out.println("Cac ma phieu du thuong la: ");
				rutTham.inRaTatCa();
			}
					
		} while (luaChon != 0);
	}
}
