package OOPInheritance2_MultilevelInheritance;

/*
 * Ke' thua` Multilevel Inheritance:
 *	- Su dung "protected" o Class Cha (Class Con truy cap qua extends)
 * 	- Su dung "private" o Class Cha (tinh chat' OOP Capsulation) 
 * - Class Con 1 "extends" Class Cha
 * - Class Con 2 "extends" Class Con 1
 * */

public class Animal {
	protected String name;

	public Animal(String name) {
		super();
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
		System.out.println("Eat meat ...");
	}
}
