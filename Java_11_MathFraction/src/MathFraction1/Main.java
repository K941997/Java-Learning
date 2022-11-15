package MathFraction1;

public class Main {
	public static void main(String[] args) {
		Fraction fractionA = new Fraction(2, 3);
		Fraction fractionB = new Fraction(3, 5);
			
		//print screen:
		System.out.println("Phan so A la: " +fractionA.printScreen());
		System.out.println("Phan so B la: " +fractionB.printScreen());

		//UCLN:
		//System.out.println("Uoc chung lon nhat: " +fractionA.UCLN(2, 8));
		
		//check Normalize (kiem tra toi gian):
		System.out.println("Kiem tra toi gian: ");
		if(fractionA.checkNormalize() == true) {
			System.out.println(fractionA.printScreen() + " o dang toi gian");
		} else {
			System.out.println(fractionA.printScreen() + " khong o dang toi gian");
		}
		
		//Normalize (rut gon toi gian phan so):
		System.out.println("Rut gon phan so: ");
		fractionA.normalize();
		System.out.println("Phan so A sau khi rut gon: " +fractionA.printScreen());
		
		//Tinh toan 2 phan so:
		Fraction fractionC = new Fraction(fractionA, fractionB, "+");
		System.out.println("Phan so C la tong 2 phan so = " +fractionC.printScreen());
		
		Fraction fractionD = new Fraction(fractionA, fractionB, "-");
		System.out.println("Phan so D la hieu cua 2 phan so = " +fractionD.printScreen());
		
		Fraction fractionE = new Fraction(fractionA, fractionB, "*");
		System.out.println("Phan so E la tich cua 2 phan so = " +fractionE.printScreen());
		
		Fraction fractionF = new Fraction(fractionA, fractionB, "/");
		System.out.println("Phan so F la thuong cua 2 phan so = " +fractionF.printScreen());
	}
}
