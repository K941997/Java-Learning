package Baitap3QuanLySinhVien;

import java.util.Objects;

public class NgaySinh {
	private int ngay;
	private int thang;
	private int nam;
	
	public NgaySinh(int ngay, int thang, int nam) {
		super();
		
		if(ngay >= 1 && ngay <= 31) {
			this.ngay = ngay;
		} else {
			this.ngay = 1;
		}
		if(thang >= 1 && thang <= 12) {
			this.thang = thang;
		} else {
			this.thang = 1;
		}
		if(nam >= 1) {
			this.nam = nam;
		} else {
			this.nam = 1;
		}
	}

	public int getNgay() {
		return ngay;
	}

	public void setNgay(int ngay) {
		if(ngay >= 1 && ngay <= 31) {
			this.ngay = ngay;
		}
	}

	public int getThang() {
		return thang;
	}

	public void setThang(int thang) {
		if(thang >= 1 && thang <= 12) {
			this.thang = thang;
		}
	}

	public int getNam() {
		return nam;
	}

	public void setNam(int nam) {
		if(nam >= 1) {
			this.nam = nam;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NgaySinh other = (NgaySinh) obj;
		return nam == other.nam && ngay == other.ngay && thang == other.thang;
	}
	
	
	
	
	
}
