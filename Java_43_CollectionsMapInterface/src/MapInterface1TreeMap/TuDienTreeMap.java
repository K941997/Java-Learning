package MapInterface1TreeMap;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/*
 * Map Interface: (Save key-value) (App Dictionary, Phone Directory)
 * 		TreeMap:
 * 		- TreeMap sap xep theo thu tu >< HashMap sap xep lon xon
 * */

public class TuDienTreeMap {
	private Map<String, String> duLieu = new TreeMap<String, String>();
	
	//Methods:
	public String themTu(String tuKhoa, String yNghia) {
		return this.duLieu.put(tuKhoa, yNghia);
	}
	
	public String xoaTu(String tuKhoa) {
		return this.duLieu.remove(tuKhoa);
	}
	
	public String traTu(String tuKhoa) {
		String yNghia = this.duLieu.get(tuKhoa);
		return yNghia;
	}
	
	public void inDanhSachTuKhoa() {
		Set<String> tapHopTuKhoa = this.duLieu.keySet(); //-> Set de hien thi data khong trung nhau
		System.out.println(Arrays.toString(tapHopTuKhoa.toArray()));
	}
	
	public int laySoLuong() {
		return this.duLieu.size();
	}
	
	public void xoaTatCa() {
		this.duLieu.clear();
	}
	
	//Main:
	public static void main(String[] args) {
		TuDienTreeMap tuDien = new TuDienTreeMap();
		
		Scanner sc = new Scanner(System.in);
		int luaChon = 0;
		
		do {
			System.out.println("---------- Menu ----------");
			System.out.println("----- 1. Them tu ");
			System.out.println("----- 2. Xoa tu");
			System.out.println("----- 3. Tra cuu tu");
			System.out.println("----- 4. In ra danh sach tu khoa");
			System.out.println("----- 5. In ra so luong tu");
			System.out.println("----- 6. Xoa tat ca tu");
			System.out.println("----- 0. Thoat");
			
			System.out.println("--- Nhap lua chon: ");
			luaChon = sc.nextInt();
			sc.nextLine();
			
			if(luaChon == 1) {
				System.out.println("--- Nhap vao tu khoa: ");
				String tuKhoa = sc.nextLine();
				System.out.println("--- Nhap vao y nghia: ");
				String yNghia = sc.nextLine();
				
				tuDien.themTu(tuKhoa, yNghia);
				
			} else if(luaChon == 2 || luaChon == 3) {
				System.out.println("--- Nhap tu khoa");
				String tuKhoa = sc.nextLine();
				
				if(luaChon == 2) {
					tuDien.xoaTu(tuKhoa);
					System.out.println("Da xoa tu duoc chon !");
				} else {
					System.out.println("Y nghia cua tu la: " +tuDien.traTu(tuKhoa));
				}
			} else if(luaChon == 4) {
				System.out.println("--- Danh sach tu khoa: ");
				tuDien.inDanhSachTuKhoa();
				
			} else if(luaChon == 5) {
				System.out.println("--- So luong tu khoa la: " +tuDien.laySoLuong());
				
			} else if(luaChon == 6) {
				tuDien.xoaTatCa();
				System.out.println("Da xoa tat ca !");
			}
			
		} while (luaChon != 0);
		
	}
	
	
}
