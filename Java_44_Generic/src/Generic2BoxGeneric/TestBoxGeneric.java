package Generic2BoxGeneric;

/*
 * Generic:
 * 		- Dùng để gán dữ liệu, ép kiểu, đổi sang kiểu dữ liệu mới
 * */

public class TestBoxGeneric {
	public static void main(String[] args) {
		BoxGeneric box1 = new BoxGeneric<Integer>(15);
		System.out.println("Gia tri Box1 la: " +box1.getValue());
		
		BoxGeneric box2 = new BoxGeneric<Double>(15.5);
		System.out.println("Gia tri Box2 la: " +box2.getValue());
		
		BoxGeneric box3 = new BoxGeneric<String>("Hello");
		System.out.println("Gia tri Box3 la: " +box3.getValue());
	}
}
