package OOPBasic2GetterSetter;
/*
 * GetterSetter:
 * - Vì có private (tính chất đóng gói Capsulation OOP) nên không thể lấy dữ liệu bằng md.day
 * - Mà phải thiết lập GetterSetter để lấy bằng md.getDay()
 * - Source -> Generate GetterSetter
 * */
public class MyDate {
	//Properties:
	private int day;
	private int month;
	private int year;
	
	//Constructor:
	public MyDate(int day, int month, int year) {
		if (day >= 1 && day <= 31) {
			this.day = day;
		} else {
			this.day = 1;
		}
		if (month >=1 && month <=12) {
			this.month = month;
		} else {
			this.month = 1;
		}
		if (year >=0) {
			this.year = year;
		} else {
			this.year = 1;
		}
	}

	//GetterSetter:
	public int getDay() {
		return this.day;
	}

	public void setDay(int day) {
		if(day>=1 && day<=31) {
			this.day = day;
		}
	}

	public int getMonth() {
		return this.month;
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
	
	
}
