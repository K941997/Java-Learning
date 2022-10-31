package Baitap3QuanLySinhVien;

public class SinhVien {
	private String maSinhVien;
	private String hoVaTen;
	private NgaySinh ngaySinh;
	private Lop lop;
	private double diemTrungBinh;
	
	public SinhVien(String maSinhVien, String hoVaTen, NgaySinh ngaySinh, Lop lop, double diemTrungBinh) {
		super();
		this.maSinhVien = maSinhVien;
		this.hoVaTen = hoVaTen;
		this.ngaySinh = ngaySinh;
		this.lop = lop;
		this.diemTrungBinh = diemTrungBinh;
	}

	public String getMaSinhVien() {
		return maSinhVien;
	}

	public void setMaSinhVien(String maSinhVien) {
		this.maSinhVien = maSinhVien;
	}

	public String getHoVaTen() {
		return hoVaTen;
	}

	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}

	public NgaySinh getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(NgaySinh ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public Lop getLop() {
		return lop;
	}

	public void setLop(Lop lop) {
		this.lop = lop;
	}

	public double getDiemTrungBinh() {
		return diemTrungBinh;
	}

	public void setDiemTrungBinh(double diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}
	
	//Show ten khoa sinh vien dang hoc:
	public String showTenKhoa() {
		return this.lop.getTenKhoa();
	}
	
	//Kiem tra sinh vien thi dat hay khong:
	public boolean kiemTraThiDatHayKhong() {
		return this.diemTrungBinh >= 5.0;
	}
	
	//Kiem tra ngay sinh co giong nhau khong:
	//Khong the viet == duoc -> vao` class NgaySinh them equals():
	public boolean kiemTraNgaySinhTrungNhau(SinhVien sinhVienKhac) {
		return this.ngaySinh.equals(sinhVienKhac.ngaySinh);
	}
	
	
	
}
