package OOPInheritance2_MultilevelInheritance;

/*
 * Ke' thua` Multilevel Inheritance:
 * - Su dung "protected" o Class Cha (Class Con truy cap qua extends)
 * - Su dung "private" o Class Cha (tinh chat' OOP Capsulation) 
 * - Class Con 1 "extends" Class Cha
 * - Class Con 2 "extends" Class Con 1
 * */

public class Dog extends Animal {

	public Dog() {
		super("Dog");
		// TODO Auto-generated constructor stub
	}
	
	public void bark() {
		System.out.println("Bark Gau Gau");
	}
}
