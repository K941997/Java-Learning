
public class ExampleDataTypeCasting {
	public static void main(String[] args) {
		//Ép kiểu ngầm định:
		int a = 100;
		int b = 50;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		float c = a;
		float d = b;
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		
		//Ép kiểu tường mình:
		float e = 3.5f;
		float f = 9.5f;
		System.out.println("e = " + e);
		System.out.println("f = " + f);
		
		int g = (int) e;
		int h = (int) f;
		System.out.println("g = " + g);
		System.out.println("h = " + h);
		
		//Ép kiểu nguyên thủy và đối tượng:
		int x = new Integer(32);
		System.out.println("x = " + x);
	}
}
