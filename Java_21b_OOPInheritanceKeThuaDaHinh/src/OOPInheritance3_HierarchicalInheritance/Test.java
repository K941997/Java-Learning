package OOPInheritance3_HierarchicalInheritance;

/*
 *	Ke thua Hierarchical Inheritance:
 *	- Su dung "protected" o Class Cha (Class Con truy cap qua extends)
 * 	- Su dung "private" o Class Cha (tinh chat' OOP Capsulation) 
 *	- Class Con1 extends Class Cha
 *	- Class Con2 extends Class Cha
 *	- Class Con3 extends Class Cha
 * */

public class Test {
	public static void main(String[] args) {
		System.out.println("Cat: ");
		Cat cat1 = new Cat();
		cat1.eat();
		cat1.meow();
		
		System.out.println("------------------");
		
		System.out.println("Bird:");
		Bird bird1 = new Bird();
		bird1.eat();
		bird1.fly();
	}
}
