package OOPInheritance0_HasAIsA;

/*
 * Has-A & Is-A:
 * 1. Has-A: Object Person has Object Address
 * 2. Is-A: Object Student extends Object Person
 * */

public class Person {
	private String hoVaTen;
	private int tuoi;
	private Address address;
	
	public Person(String hoVaTen, int tuoi, Address address) {
		this.hoVaTen = hoVaTen;
		this.tuoi = tuoi;
		this.address = address;
	}
	
	public String getHoVaTen() {
		return hoVaTen;
	}
	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
}
