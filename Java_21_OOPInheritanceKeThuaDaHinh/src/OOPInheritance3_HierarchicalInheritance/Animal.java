package OOPInheritance3_HierarchicalInheritance;

/*
 *	Ke thua Hierarchical Inheritance:
 *	- Su dung "protected" o Class Cha (Class Con truy cap qua extends)
 * 	- Su dung "private" o Class Cha (tinh chat' OOP Capsulation) 
 *	- Class Con1 extends Class Cha
 *	- Class Con2 extends Class Cha
 *	- Class Con3 extends Class Cha
 * */

public class Animal {
	protected String name;

	public Animal(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//eat:
	public void eat() {
		System.out.println("Dang eating ...");
	}
	
}
