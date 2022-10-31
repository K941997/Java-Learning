package OOPOverriding1;

/*
 * Ghi de` Overriding:
 * - Class Con @Overriding các chức năng, phương thức của Class Cha
 * */

public class Test {
	public static void main(String[] args) {
		System.out.println("Dog: ");
		Dog dog1 = new Dog();
		dog1.eat();
		dog1.sound();
		dog1.sleep();
		
		System.out.println("-------------");
		
		System.out.println("Cat: ");
		Cat cat1 = new Cat();
		cat1.eat();
		cat1.sound();
		cat1.sleep();
	}
}
