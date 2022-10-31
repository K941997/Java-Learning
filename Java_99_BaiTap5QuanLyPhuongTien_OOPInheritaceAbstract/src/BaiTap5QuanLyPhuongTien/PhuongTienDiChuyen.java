package BaiTap5QuanLyPhuongTien;

public abstract class PhuongTienDiChuyen {
	protected String tenLoaiPhuongTien;
	protected HangSanXuat hangSanXuat;
	
	public PhuongTienDiChuyen(String tenLoaiPhuongTien, HangSanXuat hangSanXuat) {
		super();
		this.tenLoaiPhuongTien = tenLoaiPhuongTien;
		this.hangSanXuat = hangSanXuat;
	}
	
	public String getTenLoaiPhuongTien() {
		return tenLoaiPhuongTien;
	}

	public void setTenLoaiPhuongTien(String tenLoaiPhuongTien) {
		this.tenLoaiPhuongTien = tenLoaiPhuongTien;
	}

	public HangSanXuat getHangSanXuat() {
		return hangSanXuat;
	}

	public void setHangSanXuat(HangSanXuat hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}

	
	//Lay ten hang san xuat:
	public String layTenHangSanXuat() {
		return this.hangSanXuat.getTenHangSanXuat();
	}
	
	//Bat Dau:
	public void batDau() {
		System.out.println("Bat Dau ...");
	}
	
	//Tang Toc:
	public void tangToc() {
		System.out.println("Tang Toc ...");
	}
	
	//Dung Lai:
	public void dungLai() {
		System.out.println("Dung Lai ...");
	}
	
	//Abstract Method Lay Van Toc:
	public abstract double layVanToc();
	
	
	
}
