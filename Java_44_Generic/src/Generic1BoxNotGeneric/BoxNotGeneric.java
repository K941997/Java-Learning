package Generic1BoxNotGeneric;

/*
 * Not Generic:
 * 		- Khong the thay doi int value -> float value, double value, string value
 * */

public class BoxNotGeneric {
	private int value;

	public BoxNotGeneric(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	
}
