package OOPOverriding1;

/*
 * Ghi de` Overriding:
 * - Class Con @Overriding các chức năng, phương thức của Class Cha
 * */

public class Dog extends Animal {

	public Dog() {
		super("Dog");
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void eat() {
		System.out.println("eat xuong ...");
	}
	
	@Override
	public void sound() {
		System.out.println("gau gau ...");
	}
	
}	
