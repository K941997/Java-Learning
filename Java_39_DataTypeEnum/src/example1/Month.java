package example1;

/*
 * Enum là kiểu dữ liệu giới hạn, không thay đổi
 * */

public enum Month {
	Month1(31),
	Month2(29),
	Month3(31),
	Month4(30),
	Month5(31),
	Month6(30),
	Month7(31),
	Month8(31),
	Month9(30),
	Month10(31),
	Month11(30),
	Month12(31); 
	
	private final int soNgay;
	Month(int soNgay){
		this.soNgay = soNgay;
	}
	
	public int soNgay() {
		return soNgay;
	}
	
	
	
}
