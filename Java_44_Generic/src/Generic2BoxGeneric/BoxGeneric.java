package Generic2BoxGeneric;

/*
 * Generic:
 * 		- Dùng để gán dữ liệu, ép kiểu, đổi sang kiểu dữ liệu mới
 * */

public class BoxGeneric<T> {
	private T value;

	public BoxGeneric(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
	
}
