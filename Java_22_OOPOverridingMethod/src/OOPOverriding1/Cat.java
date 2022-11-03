package OOPOverriding1;

/*
 * Ghi de` Overriding:
 * - Class Con @Overriding các chức năng, phương thức của Class Cha
 * */

public class Cat extends Animal {

	public Cat() {
		super("Cat");
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void eat() {
		System.out.println("eat ca' ...");
	}
	
	@Override
	public void sound() {
		System.out.println("meow meow ...");
	}
	
}
