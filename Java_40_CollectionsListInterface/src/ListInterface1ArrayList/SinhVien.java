package ListInterface1ArrayList;

import java.util.Objects;

/*
 * List Interface:
 * 		ArrayList
 * */

public class SinhVien implements Comparable<SinhVien> {
	private String maSinhVien;
	private String hoVaTen;
	private int namSinh;
	private float diemTrungBinh;
	
	public SinhVien(String maSinhVien) {
		this.maSinhVien = maSinhVien;
	}

	public SinhVien(String maSinhVien, String hoVaTen, int namSinh, float diemTrungBinh) {
		this.maSinhVien = maSinhVien;
		this.hoVaTen = hoVaTen;
		this.namSinh = namSinh;
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

	public int getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}

	public float getDiemTrungBinh() {
		return diemTrungBinh;
	}

	public void setDiemTrungBinh(float diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}

	@Override
	public String toString() {
		return "SinhVien [maSinhVien=" + maSinhVien + ", hoVaTen=" + hoVaTen + ", namSinh=" + namSinh
				+ ", diemTrungBinh=" + diemTrungBinh + "]";
	}

	//So sanh theo thu tu >, <, =:
	@Override
	public int compareTo(SinhVien o) { //so sanh sap xep theo ma sinh vien
		return this.maSinhVien.compareTo(o.maSinhVien);
	}

	@Override
	public int hashCode() {
		return Objects.hash(diemTrungBinh, hoVaTen, maSinhVien, namSinh);
	}

	//So sanh =, ton tai:
	@Override
	public boolean equals(Object obj) { //so sanh =, ton tai (theo ma sinh vien)
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SinhVien other = (SinhVien) obj;
		return Objects.equals(maSinhVien, other.maSinhVien);
	}
	
}
