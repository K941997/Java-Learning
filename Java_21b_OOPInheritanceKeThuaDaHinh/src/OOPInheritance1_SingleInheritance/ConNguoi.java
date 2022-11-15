package OOPInheritance1_SingleInheritance;

/*
 *	Ke' Thua` Single Inheritance: 
 *	- Class Con "extends" Class Cha
 *	- Su dung "protected" o Class Cha (Class Con truy cap qua extends)
 * 	- Su dung "private" o Class Cha (tinh chat' OOP Capsulation) 
 * */

public class ConNguoi {
	protected String hoVaTen;
	private int namSinh;
	
	public ConNguoi(String hoVaTen, int namSinh) {
		super();
		this.hoVaTen = hoVaTen;
		this.namSinh = namSinh;
	}

	public String getHoVaTen() {
		return hoVaTen;
	}

	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}

	public int getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}
	
	//Chuc nang an:
	public void an() {
		System.out.println("An Nhoam Nhoam");
	}
	
	//Chuc nang uong:
	public void uong() {
		System.out.println("Uong Uc Uc");
	}
	
	//Chuc nang ngu:
	public void ngu() {
		System.out.println("Ngu Kho Kho");
	}
	
}
