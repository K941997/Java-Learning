package example1;

/*
 * Enum là kiểu dữ liệu giới hạn, không thay đổi
 * */

public class ThoiKhoaBieu {
	private Day day;
	private String cacMonHoc;
	
	public ThoiKhoaBieu(Day day, String cacMonHoc) {
		super();
		this.day = day;
		this.cacMonHoc = cacMonHoc;
	}

	public Day getDay() {
		return day;
	}

	public void setDay(Day day) {
		this.day = day;
	}

	public String getCacMonHoc() {
		return cacMonHoc;
	}

	public void setCacMonHoc(String cacMonHoc) {
		this.cacMonHoc = cacMonHoc;
	}

	@Override
	public String toString() {
		return "ThoiKhoaBieu [day=" + day + ", cacMonHoc=" + cacMonHoc + "]";
	}
	
	
	
}
