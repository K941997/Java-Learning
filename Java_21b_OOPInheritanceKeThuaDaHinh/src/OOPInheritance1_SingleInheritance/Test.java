package OOPInheritance1_SingleInheritance;

/*
 *	Ke' Thua` Single Inheritance: 
 *	- Class Con "extends" Class Cha
 *	- Su dung "protected" o Class Cha (Class Con truy cap qua extends)
 * 	- Su dung "private" o Class Cha (tinh chat' OOP Capsulation) 
 * */

public class Test {
	public static void main(String[] args) {
		HocSinh hocSinh1 = new HocSinh("Khanh", 1997, "Lop A", "Truong A");
		
		hocSinh1.an();
		hocSinh1.uong();
		hocSinh1.ngu();
		hocSinh1.lamBaiTap();
	}
}
