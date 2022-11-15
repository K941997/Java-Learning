package OOPBasic1;

public class MyDate {
	//Properties: Thuộc tính
	private int day;
	private int month;
	private int year;
	
	//Constructor: Hàm khởi tạo đối tượng
	public MyDate(int d, int m, int y) {
		this.day = d;
		this.month = m;
		this.year = y;
	}
	
	//Methods: Phương thức
	public void printDay() { //void: not return anything
		System.out.println("Day: " +this.day);
	}
	public void printMoth() { //void: not return anything
		System.out.println("Moth: " +this.month);
	}
	public void printYear() { //void: not return anything
		System.out.println("Year: " +this.year);
	}
	public void printDate() { //void: not return anything
		System.out.println("Date: " +this.day+ "-" +this.month+ "-" +this.year);
	}
	
}
