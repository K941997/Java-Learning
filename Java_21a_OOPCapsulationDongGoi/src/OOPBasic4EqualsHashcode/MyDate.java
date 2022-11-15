package OOPBasic4EqualsHashcode;

import java.util.Objects;

/*
 * Equals Hashcode:
 * - equals(): so sánh =, tồn tại
 * - Dấu "==" chỉ dùng được cho số, không dùng được cho đối tượng
 * - Phải dùng equals mới dùng được cho đối tượng
 * - Source -> Generate hashcode() and equals()
 * */

public class MyDate {
	//Properties:
	private int day;
	private int month;
	private int year;
	
	//Constructor:
	public MyDate(int day, int month, int year) {
		if(day >= 1 && day <= 31) {
			this.day = day;
		} else {
			this.day = 1;
		}
		if(month >= 1 && month <= 12) {
			this.month = month;
		} else {
			this.month = 1;
		}
		if(year >= 1) {
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
		if(day >= 1 && day <= 31) {
			this.day = day;
		}
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if(month >= 1 && month <= 12) {
			this.month = month;
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if(year >= 1) {
			this.year = year;
		}
	}

	//toString():
	@Override
	public String toString() {
		return "MyDate [day=" + day + ", month=" + month + ", year=" + year + "]";
	}

	//hashCode():
	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	//equals():
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyDate other = (MyDate) obj;
		return day == other.day && month == other.month && year == other.year;
	}
	
	
	
	
	
	
	
	
}	
