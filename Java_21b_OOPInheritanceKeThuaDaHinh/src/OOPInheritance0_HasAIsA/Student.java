package OOPInheritance0_HasAIsA;

/*
 * Has-A & Is-A:
 * 1. Has-A: Object Person has Object Address
 * 2. Is-A: Object Student extends Object Person
 * */

public class Student extends Person {
	private String maTheSinhVien;

	public Student(String hoVaTen, int tuoi, Address address, String maTheSinhVien) {
		super(hoVaTen, tuoi, address);
		this.maTheSinhVien = maTheSinhVien;
	}

	public String getMaTheSinhVien() {
		return maTheSinhVien;
	}

	public void setMaTheSinhVien(String maTheSinhVien) {
		this.maTheSinhVien = maTheSinhVien;
	}
	
}
