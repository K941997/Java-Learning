package OOPBasic2GetterSetter;
/*
 * GetterSetter:
 * - Vì có private (tính chất đóng gói Capsulation OOP) nên không thể lấy dữ liệu bằng md.day
 * - Mà phải thiết lập GetterSetter để lấy bằng md.getDay()
 * - Source -> Generate GetterSetter
 * */
public class Test {
	public static void main(String[] args) {
		MyDate md = new MyDate(9, 4, 1997);
		
		//Day:
		System.out.println("Day = " +md.getDay());
		md.setDay(30);
		System.out.println("Day sau khi thay doi lan 1 = " +md.getDay());
		md.setDay(32);
		System.out.println("Day sau khi thay doi lan 2 = " +md.getDay());
		
		//Month:
		System.out.println("Month = " +md.getMonth());
		md.setMonth(12);
		System.out.println("Month doi lan 1 = " +md.getMonth());
		md.setMonth(13);
		System.out.println("Month doi lan 2 = " +md.getMonth());
		
	}
}
