package BaiTap5QuanLyPhuongTien;

public class MayBay extends PhuongTienDiChuyen {
	private String loaiNhienLieu;

	public MayBay(HangSanXuat hangSanXuat, String loaiNhienLieu) {
		super("May Bay", hangSanXuat);
		this.loaiNhienLieu = loaiNhienLieu;
	}
	
	public String getLoaiNhienLieu() {
		return loaiNhienLieu;
	}

	public void setLoaiNhienLieu(String loaiNhienLieu) {
		this.loaiNhienLieu = loaiNhienLieu;
	}


	//Cat canh:
	public void catCanh() {
		System.out.println("Cat canh ...");
	}
	
	//Ha canh:
	public void haCanh() {
		System.out.println("Ha canh ...");
	}

	//Lay Van Toc:
	@Override
	public double layVanToc() {
		// TODO Auto-generated method stub
		return 500;
	}
	
	
}
