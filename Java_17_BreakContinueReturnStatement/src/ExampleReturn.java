
public class ExampleReturn {
	/*
	 * Return: Ngưng luôn chương trình 
	 * 	-	Có 2 dạng:
	 *		+ Trả về 1 giá trị: return count++;
	 * 		+ Không trả về giá trị (dùng hàm void): return;
	 * */
	 
	public static void main(String[] args) {
		for (int i=2; i<=9; i++) {
			for (int j=1; j<=10; j++) {
				if (j>5) {
					return; //Return: j<=5 lấy giá trị, j>5 ngưng luôn chương trình
				}
				System.out.println("i = " +i+ ", j = " +j);
			}
			System.out.println("-------------");
		}
		System.out.println("ABC");
	}
}
