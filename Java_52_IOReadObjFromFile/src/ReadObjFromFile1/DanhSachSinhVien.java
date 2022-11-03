package ReadObjFromFile1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class DanhSachSinhVien {
	private ArrayList<SinhVien> danhSachSinhVien;

	//Constructor:
	public DanhSachSinhVien() {
		this.danhSachSinhVien = new ArrayList<SinhVien>();
	}
	
	public DanhSachSinhVien(ArrayList<SinhVien> danhSachSinhVien) {
		this.danhSachSinhVien = danhSachSinhVien;
	}
	
	//Methods:
	public void themSinhVien(SinhVien sv) {
		this.danhSachSinhVien.add(sv);
	}
	
	public void inDanhSachSinhVien() {
		for(SinhVien sv: danhSachSinhVien) {
			System.out.println(sv);
		}
	}
	
	public boolean kiemTraDanhSachRongHayKhong() {
		return this.danhSachSinhVien.isEmpty();
	}
	
	public int laySoLuongSinhVien() {
		return this.danhSachSinhVien.size();
	}
	
	public void lamRongDanhSach() {
		this.danhSachSinhVien.removeAll(danhSachSinhVien);
		System.out.println("Da lam rong danh sach");
	}

	public boolean kiemTraTonTaiHayKhong(SinhVien sv) {
		return this.danhSachSinhVien.contains(sv);
	}
	
	public void xoaSinhVienKhoiDanhSach(SinhVien sv) {
		this.danhSachSinhVien.remove(sv);
		System.out.println("Da xoa sinh vien");
	}
	
	public void timTatCaSinhVienTheoTen(String tenSinhVien) {
		for(SinhVien sinhVien: danhSachSinhVien) {
			if(sinhVien.getHoVaTen().indexOf(tenSinhVien) >= 0) {
				System.out.println(sinhVien);
			}
		}
	}
	
	public void hienThiSinhVienDiemTuCaoDenThap() {
		Collections.sort(danhSachSinhVien, new Comparator<SinhVien>() {
			public int compare(SinhVien o1, SinhVien o2) {
				if (o1.getDiemTrungBinh() < o2.getDiemTrungBinh()) {
					return 1;
				} else if(o1.getDiemTrungBinh() > o2.getDiemTrungBinh()) {
					return -1;
				} else {
					return 0;
				}
			}
		});
	}
	
	//Save Obj To File:
	public void luuDanhSachSinhVienXuongFile(File file) {
		try {
			OutputStream os = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(os);
			
			for(SinhVien sv: danhSachSinhVien) {
				oos.writeObject(sv);
			}
			
			oos.flush();
			oos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//Read Obj From File:
	public void docDuLieuTuFile(File file) {
		try {
			InputStream is = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(is);
			
			SinhVien sv = null;
			while(true) {
				Object obj = ois.readObject();
	
				if(obj != null) {
					sv = (SinhVien) obj;
					this.danhSachSinhVien.add(sv);
				}
				if(obj == null) {
					break;
				}
			}
			
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
