package BaiTap4QuanLyMayTinh;

public class MayTinh {
	private HangSanXuat hangSanXuat;
	private NgaySanXuat ngaySanXuat;
	private double giaBan;
	private double soThangBaoHanh;
	
	public MayTinh(HangSanXuat hangSanXuat, NgaySanXuat ngaySanXuat, double giaBan, double soThangBaoHanh) {
		super();
		this.hangSanXuat = hangSanXuat;
		this.ngaySanXuat = ngaySanXuat;
		this.giaBan = giaBan;
		this.soThangBaoHanh = soThangBaoHanh;
	}

	public HangSanXuat getHangSanXuat() {
		return hangSanXuat;
	}

	public void setHangSanXuat(HangSanXuat hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}

	public NgaySanXuat getNgaySanXuat() {
		return ngaySanXuat;
	}

	public void setNgaySanXuat(NgaySanXuat ngaySanXuat) {
		this.ngaySanXuat = ngaySanXuat;
	}

	public double getGiaBan() {
		return giaBan;
	}

	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}

	public double getSoThangBaoHanh() {
		return soThangBaoHanh;
	}

	public void setSoThangBaoHanh(double soThangBaoHanh) {
		this.soThangBaoHanh = soThangBaoHanh;
	}
	
	//So sanh gia:
	public boolean kiemTraGiaThapHon(MayTinh mayTinhKhac) {
		return this.giaBan < mayTinhKhac.giaBan;
	}
	
	//Lay ten quoc gia:
	public String layTenQuocGia() {
		return this.hangSanXuat.layTenQuocGia();
	}
	
	
	
}
