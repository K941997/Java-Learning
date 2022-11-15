package arraysearchsortcopy1;

public class SinhVien implements Comparable<SinhVien> {
	private int maSinhVien;
	private String tenSinhVien;
	private String tenLop;
	private double diemTrungBinh;
	
	public SinhVien(int maSinhVien, String tenSinhVien, String tenLop, double diemTrungBinh) {
		super();
		this.maSinhVien = maSinhVien;
		this.tenSinhVien = tenSinhVien;
		this.tenLop = tenLop;
		this.diemTrungBinh = diemTrungBinh;
	}

	public int getMaSinhVien() {
		return maSinhVien;
	}
	
	public void setMaSinhVien(int maSinhVien) {
		this.maSinhVien = maSinhVien;
	}

	public String getTenSinhVien() {
		return tenSinhVien;
	}

	public void setTenSinhVien(String tenSinhVien) {
		this.tenSinhVien = tenSinhVien;
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

	@Override
	public String toString() {
		return "SinhVien [maSinhVien=" + maSinhVien + ", tenSinhVien=" + tenSinhVien + ", tenLop=" + tenLop
				+ ", diemTrungBinh=" + diemTrungBinh + "]";
	}

	//StringFindIndexOf + StringTrimSubString: lay ten sinh vien da rut gon
	public String getTen() {
		String s = this.tenSinhVien.trim();
		if(s.indexOf(" ") >= 0) {
			int vt = s.lastIndexOf(" ");
			return s.substring(vt+1);
		}else {
			return s;
		}
	}
	
	//CompareTo: so sanh theo ten sinh vien
	@Override
	public int compareTo(SinhVien o) {
		String tenSinhVien = this.getTen();
		String tenSinhVienKhac = o.getTen();
		return tenSinhVien.compareTo(tenSinhVienKhac);
	}
	
	
}
