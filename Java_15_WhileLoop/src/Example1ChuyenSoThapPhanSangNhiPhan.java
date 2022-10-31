import java.util.Scanner;

public class Example1ChuyenSoThapPhanSangNhiPhan {
	//Vòng lặp WhileLoop dùng khi ko có điểm dừng
	
	public static void main(String[] args) {	
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so nguyen n > 0");
		n = sc.nextInt();
		
		//Doi so Thap phan sang Nhi phan 1010101: (Vong lap WhileLoop)
		String nhiPhan = "";
		/*
		 * chia lien tuc cho 2 va lay' phan` du
		 * dao? nguoc. chuoi~ => ket' qua?
		 * 
		 * 10:2 = 5 du 0
		 * 5:2 = 2 du 1
		 * 2:2 = 1 du 0
		 * 1:2 = 0 du 1
		 * => 1010
		 */
		while (n>0) {
			nhiPhan = (n%2) + nhiPhan;
			n = n/2;
		}
		System.out.println("So he nhi phan la: " + nhiPhan);
		
	}
}
