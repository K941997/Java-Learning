package OOPOverriding1;

/*
 * Ghi de` Overriding:
 * - Class Con @Overriding các chức năng, phương thức của Class Cha
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
	
	//chuc nang eat:
	public void eat() {
		System.out.println("eating ...");
	}
	
	//chuc nang sound:
	public void sound() {
		System.out.println("Make sound ...");
	}
	
	//chuc nang sleep:
	public void sleep() {
		System.out.println("sleeping ...");
	}
}
