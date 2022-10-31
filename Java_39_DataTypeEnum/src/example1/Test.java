package example1;

/*
 * Enum là kiểu dữ liệu giới hạn, không thay đổi
 * */

public class Test {
	public static void main(String[] args) {
		ThoiKhoaBieu tkbThu2 = new ThoiKhoaBieu(Day.Monday, "Toan Ly Hoa");
		ThoiKhoaBieu tkbThu3 = new ThoiKhoaBieu(Day.Tuesday, "Sinh Su Dia");
		ThoiKhoaBieu tkbThu4 = new ThoiKhoaBieu(Day.Wednesday, "Ly Hoa Sinh");
		
		System.out.println(tkbThu2);
		
		int x = Month.Month1.soNgay();
		System.out.println(x);
	}
}
