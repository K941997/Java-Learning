package BaiTap2QuanLyPhim;

public class Phim {
	private String tenPhim;
	private int namSanXuat;
	private HangSanXuat hangSanXuat;
	private double giaVe;
	private NgayChieu ngayChieu;
	
	public Phim(String tenPhim, int namSanXuat, HangSanXuat hangSanXuat, double giaVe, NgayChieu ngayChieu) {
		super();
		this.tenPhim = tenPhim;
		this.namSanXuat = namSanXuat;
		this.hangSanXuat = hangSanXuat;
		this.giaVe = giaVe;
		this.ngayChieu = ngayChieu;
	}

	public String getTenPhim() {
		return tenPhim;
	}

	public void setTenPhim(String tenPhim) {
		this.tenPhim = tenPhim;
	}

	public int getNamSanXuat() {
		return namSanXuat;
	}

	public void setNamSanXuat(int namSanXuat) {
		this.namSanXuat = namSanXuat;
	}

	public HangSanXuat getHangSanXuat() {
		return hangSanXuat;
	}

	public void setHangSanXuat(HangSanXuat hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}

	public double getGiaVe() {
		return giaVe;
	}

	public void setGiaVe(double giaVe) {
		this.giaVe = giaVe;
	}

	public NgayChieu getNgayChieu() {
		return ngayChieu;
	}

	public void setNgayChieu(NgayChieu ngayChieu) {
		this.ngayChieu = ngayChieu;
	}
	
	//Kiem tra gia ve 1 phim bat ky co re hon gia ve phim khac ko:
	public boolean kiemTraGiaVeReHon(Phim phimKhac ) {
		return this.giaVe < phimKhac.giaVe;
	}
	
	//Cho biet ten cua hang san xuat:
	//Cach 1:
//	public void showTenHangSanXuat() {
//		System.out.println("Ten cua hang san xuat la: " +this.hangSanXuat.getTenHangSanXuat());
//	}
	//Cach 2:
	public String showTenHangSanXuat() {
		return this.hangSanXuat.getTenHangSanXuat();
	}
	
	//Cho biet gia ve cua phim khi co khuyen mai:
	public double giaVeKhiCoKhuyenMai(double x) {
		return this.giaVe * (1 - x/100);
	}
	
}
