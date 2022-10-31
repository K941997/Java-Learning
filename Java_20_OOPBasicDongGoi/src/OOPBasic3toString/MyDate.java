package OOPBasic3toString;

/*
 * toString():
 * - Trả về chuỗi
 * - Hiển thị md1 = MyDate@76ed5528 -> dung` toString = 9/4/1997
 * - Source -> Generate toString()
 * */

public class MyDate {
	//Properties:
	private int day;
	private int month;
	private int year;
	
	//Constructor:
	public MyDate(int day, int month, int year) {
		if(day>=1 && day<=31) {
			this.day = day;
		} else {
			this.day = 1;
		}
		if(month>=1 && month<=12) {
			this.month = month;
		} else {
			this.month = 1;
		}
		if(year>=1) {
			this.year = year;
		} else {
			this.year = 1;
		}
	}

	//GetterSetter:
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if(day>=1 && day<=31) {
			this.day = day;
		}
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if(month>=1 && month<=12) {
			this.month = month;
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if(year>=1) {
			this.year = year;
		}
	}
	
	//toString():
	@Override
	public String toString() {
		return this.day + "/" + this.month + "/" + this.year;
	}
	
}
