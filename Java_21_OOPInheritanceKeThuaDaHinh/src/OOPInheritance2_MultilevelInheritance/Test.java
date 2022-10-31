package OOPInheritance2_MultilevelInheritance;

/*
 * Ke' thua` Multilevel Inheritance:
 * - Su dung "protected" o Class Cha (Class Con truy cap qua extends)
 * - Su dung "private" o Class Cha (tinh chat' OOP Capsulation) 
 * - Class Con 1 "extends" Class Cha
 * - Class Con 2 "extends" Class Con 1
 * */

public class Test {
	public static void main(String[] args) {
		System.out.println("Dog: ");
		Dog dog1 = new Dog();
		dog1.eat();
		dog1.bark();
		System.out.println("-----------------");
		
		System.out.println("Baby Dog: ");
		BabyDog babyDog1 = new BabyDog();
		babyDog1.eat();
		babyDog1.bark();
		babyDog1.weep();
	}
}
