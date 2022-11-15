package OOPInheritance3_HierarchicalInheritance;

/*
 *	Ke thua Hierarchical Inheritance:
 *	- Su dung "protected" o Class Cha (Class Con truy cap qua extends)
 * 	- Su dung "private" o Class Cha (tinh chat' OOP Capsulation) 
 *	- Class Con1 extends Class Cha
 *	- Class Con2 extends Class Cha
 *	- Class Con3 extends Class Cha
 * */

public class Bird extends Animal {

	public Bird() {
		super("Bird");
		// TODO Auto-generated constructor stub
	}
	
	//Fly:
	public void fly() {
		System.out.println("Flying");
	}
}
