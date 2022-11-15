package OOPInheritance0_HasAIsA;

/*
 * Has-A & Is-A:
 * 1. Has-A: Object Person has Object Address
 * 2. Is-A: Object Student extends Object Person
 * */

public class Address {
	private String tenDuong;

	public Address(String tenDuong) {
		this.tenDuong = tenDuong;
	}

	public String getTenDuong() {
		return tenDuong;
	}

	public void setTenDuong(String tenDuong) {
		this.tenDuong = tenDuong;
	}
	
}
