package OOPInheritance1_SingleInheritance;

/*
 *	Ke' Thua` Single Inheritance: 
 *	- Class Con "extends" Class Cha
 *	- Su dung "protected" o Class Cha (Class Con truy cap qua extends)
 * 	- Su dung "private" o Class Cha (tinh chat' OOP Capsulation) 
 * */

public class HocSinh extends ConNguoi {
	private String tenLop;
	private String tenTruong;
	
	public HocSinh(String hoVaTen, int namSinh, String tenLop, String tenTruong) {
		super(hoVaTen, namSinh);
		this.tenLop = tenLop;
		this.tenTruong = tenTruong;
	}

	public String getTenLop() {
		return tenLop;
	}

	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}

	public String getTenTruong() {
		return tenTruong;
	}

	public void setTenTruong(String tenTruong) {
		this.tenTruong = tenTruong;
	}
	
	//lam:
	public void lamBaiTap() {
		System.out.println("Lam bai tap");
	}
	
	
	
	
}
