package OOPInheritance2_MultilevelInheritance;

/*
 * Ke' thua` Multilevel Inheritance:
 * - Su dung "protected" o Class Cha (Class Con truy cap qua extends)
 * - Su dung "private" o Class Cha (tinh chat' OOP Capsulation) 
 * - Class Con 1 "extends" Class Cha
 * - Class Con 2 "extends" Class Con 1
 * */

public class BabyDog extends Dog {
	
	public BabyDog() {
		super();
	}
	
	public void weep() {
		System.out.println("Weeping ...");
	}
	
	
}
