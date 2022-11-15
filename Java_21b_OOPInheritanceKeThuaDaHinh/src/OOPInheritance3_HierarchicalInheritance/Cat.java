package OOPInheritance3_HierarchicalInheritance;

/*
 *	Ke thua Hierarchical Inheritance:
 *	- Su dung "protected" o Class Cha (Class Con truy cap qua extends)
 * 	- Su dung "private" o Class Cha (tinh chat' OOP Capsulation) 
 *	- Class Con1 extends Class Cha
 *	- Class Con2 extends Class Cha
 *	- Class Con3 extends Class Cha
 * */

public class Cat extends Animal {

	public Cat() {
		super("Cat");
		// TODO Auto-generated constructor stub
	}
	
	//meow:
	public void meow() {
		System.out.println("Meow meow");
	}
	
}
