import java.util.Scanner;

public class ExampleWhileLoop {
	public static void main(String[] args) {
		//Vòng lặp WhileLoop dùng khi ko có điểm dừng
		int x = 1;
		Scanner sc = new Scanner(System.in);
		
		while (x != 0) {
			System.out.println("Nhap x = 0 de thoat, nhap x != de tiep tuc");
			x = sc.nextInt();
		}
		
		//Vòng lặp vô tận while true:
		int i = 0;
		while (true) {
			System.out.println(i);
			i++;
			if (i == 10) {
				break;
			}
		}
	}
}
