package OOPCompareTo1;

/*
 * OOP CompareTo so sanh theo thu tu >, <, = cho doi tuong
 * */

public class SinhVien implements Comparable<SinhVien> {
	private int maSinhVien;
	private String hoVaTen;
	private String tenLop;
	private double diemTrungBinh;
	
	public SinhVien(int maSinhVien, String hoVaTen, String tenLop, double diemTrungBinh) {
		super();
		this.maSinhVien = maSinhVien;
		this.hoVaTen = hoVaTen;
		this.tenLop = tenLop;
		this.diemTrungBinh = diemTrungBinh;
	}

	public int getMaSinhVien() {
		return maSinhVien;
	}

	public void setMaSinhVien(int maSinhVien) {
		this.maSinhVien = maSinhVien;
	}

	public String getHoVaTen() {
		return hoVaTen;
	}

	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}

	public String getTenLop() {
		return tenLop;
	}

	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}

	public double getDiemTrungBinh() {
		return diemTrungBinh;
	}

	public void setDiemTrungBinh(double diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}


	//StringFindIndexOf + StringTrimSubString:
	public String getTen() {
		String s = this.hoVaTen.trim();
		if(s.indexOf(" ") >= 0) {
			int vt = s.lastIndexOf(" ");
			return s.substring(vt+1);
		}else {
			return s;
		}
	}
	
	//OOP CompareTo so sanh theo thu tu >, <, =:
	@Override
	public int compareTo(SinhVien sinhVienKhac) {
		String tenSinhVien = this.getTen();
		String tenSinhVienKhac = sinhVienKhac.getTen();
		
		return tenSinhVien.compareTo(tenSinhVienKhac);	
		
	}
	
	
}
