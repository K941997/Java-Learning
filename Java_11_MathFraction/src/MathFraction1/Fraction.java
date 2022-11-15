package MathFraction1;

/*
 * Math Fraction: (Phan so)
 * */

public class Fraction {
	private int numerator; //tu so
	private int demonirator; //mau so
	
	public Fraction(int numerator, int demonirator) {
		this.numerator = numerator;
		this.demonirator = demonirator;
	}

	public Fraction(Fraction fractionA, Fraction fractionB, String operator) {
		fractionA.normalize();
		fractionB.normalize();
		
		switch (operator) {
			case "+":
				this.add(fractionA, fractionB);
				break;

			case "-":
				this.sub(fractionA, fractionB);
				break;
				
			case "*":
			case "x":
			case "X":
			case ".":
				this.multiply(fractionA, fractionB);
				break;
				
			case "/":
			case ":":
				this.divide(fractionA, fractionB);
				break;
				
			default:
				break;
		}
	}
	
	//Hien thi phan so:
	public String printScreen() {
		return this.getNumerator() + "/" + this.getDemonirator();
	}
	
	//Tim UCLN: Vi du 5/20 -> 1/4:
	private int UCLN(int x, int y) {
		int result = Math.min(x, y);
		while(result >= 1) {
			if(x % result == 0 && y % result == 0) {
				return result;
			}
			result--;
		}
		return result;
	}
	
	//Kiem tra toi gian hay chua:
	public boolean checkNormalize() {
		if(this.UCLN(this.getNumerator(), this.getDemonirator()) == 1) {
			return true;
		}
		return false;
	}
	
	//Rut gon, toi gian  phan so:
	public void normalize() {
		int ucln = this.UCLN(this.getNumerator(), this.getDemonirator());
		if(ucln > 1) {
			this.numerator = this.getNumerator() / ucln;
			this.demonirator = this.getDemonirator() / ucln;
		}
	}
	
	//Tong 2 phan so:
	private void add(Fraction fractionA, Fraction fractionB) {
		System.out.println("Phep cong 2 phan so: ");
		this.numerator = fractionA.getNumerator() * fractionB.getDemonirator() + fractionA.getDemonirator() * fractionB.getNumerator();
		this.demonirator = fractionA.getDemonirator() * fractionB.getDemonirator();
	}
	
	//Hieu 2 phan so:
	private void sub(Fraction fractionA, Fraction fractionB) {
		System.out.println("Phep tru 2 phan so: ");
		this.numerator = fractionA.getNumerator() * fractionB.getDemonirator() + fractionA.getDemonirator() * fractionB.getNumerator();
		this.demonirator = fractionA.getDemonirator() * fractionB.getDemonirator();
	}
	
	//Tich 2 phan so:
	private void multiply(Fraction fractionA, Fraction fractionB) {
		System.out.println("Phep nhan 2 phan so: ");
		this.numerator = fractionA.getNumerator() * fractionB.getNumerator();
		this.demonirator = fractionA.getDemonirator() * fractionB.getDemonirator();
	}
	
	//Thuong 2 phan so:
	private void divide(Fraction fractionA, Fraction fractionB) {
		System.out.println("Phep chia 2 phan so: ");
		this.numerator = fractionA.getNumerator() * fractionB.getDemonirator();
		this.demonirator = fractionA.getDemonirator() * fractionB.getNumerator();
	}
	
	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDemonirator() {
		return demonirator;
	}

	public void setDemonirator(int demonirator) {
		this.demonirator = demonirator;
	}
}
