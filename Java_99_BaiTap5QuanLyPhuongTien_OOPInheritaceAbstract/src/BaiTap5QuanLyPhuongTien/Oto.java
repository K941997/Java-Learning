package BaiTap5QuanLyPhuongTien;

public class Oto extends PhuongTienDiChuyen{
	private String loaiNhienLieu;

	public Oto(HangSanXuat hangSanXuat, String loaiNhienLieu) {
		super("Oto", hangSanXuat);
		this.loaiNhienLieu = loaiNhienLieu;
	}

	public String getLoaiNhienLieu() {
		return loaiNhienLieu;
	}

	public void setLoaiNhienLieu(String loaiNhienLieu) {
		this.loaiNhienLieu = loaiNhienLieu;
	}


	//Lay Van Toc:
	@Override
	public double layVanToc() {
		// TODO Auto-generated method stub
		return 50;
	}
	
	
}
