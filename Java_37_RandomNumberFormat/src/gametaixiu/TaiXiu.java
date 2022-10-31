package gametaixiu;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/*
 * 1 người sẽ có tài khoản chơi.
 * Người chơi có quyền đặt cược số tiền ít hơn hoặc bằng số tiền đang có
 * Luật chơi:
 * - Có 3 viên xúc xắc. Mỗi viên có 6 mặt giá trị từ 1 đến 6
 * - Mỗi lần lắc sẽ ra 1 kết quả. Kết quả = giá trị xx1 + giá trị xx2 + giá trị xx3
 * + Nếu tổng = 3 hoặc 18 => Nhà cái ăn hết, người chơi thua
 * + Nếu tổng = 4 đến 10 => xỉu => Nếu đặt xỉu thì thắng. Ngược lại thua
 * + Nếu tổng = 11 đến 17 => tài => Nếu đặt tài thì thắng. Ngược lại thua
 * */

public class TaiXiu {
	public static void main(String[] args) {
		double taiKhoanNguoiChoi = 5000000.99;
		Scanner sc = new Scanner(System.in);
		
		//Locale o VN + NumberFormat theo VN:
		Locale lc = new Locale("vi", "VN");
		NumberFormat numformat = NumberFormat.getCurrencyInstance(lc);
		
		//Chon phim choi:
		int luaChon = 0;
		do {
			System.out.println("---------- Moi` ban. lua. chon.: ----------");
			System.out.println("Chon (1) tiep tuc choi");
			System.out.println("Chon (phim khac) de thoat");
			luaChon = sc.nextInt();
			if(luaChon == 1) {
				System.out.println("*** Bat dau choi!!! ***");
				System.out.println("*** Tai khoan cua ban: " +numformat.format(taiKhoanNguoiChoi)+ ", ban muon cuoc bao nhieu? ");
				
				//Chon so tien dat cuoc:
				double soTienDatCuoc = 0;
				do {
					System.out.println("*** Dat cuoc (0 < so tien cuoc <= " +numformat.format(taiKhoanNguoiChoi)+ "):");
					soTienDatCuoc = sc.nextDouble();
				} while(soTienDatCuoc <= 0 || soTienDatCuoc > taiKhoanNguoiChoi);
				
				//Chon Tai hay Xiu:
				int luaChonTaiXiu = 0;
				do {
					System.out.println("*** Chon (1) la Tai hoac (2) la Xiu: ");
					luaChonTaiXiu = sc.nextInt();
				} while(luaChonTaiXiu != 1 && luaChonTaiXiu != 2);
				
				//Tung xuc xac:
				Random xucXac1 = new Random();
				Random xucXac2 = new Random();
				Random xucXac3 = new Random();
				
				int giaTri1 = xucXac1.nextInt(5)+1; //-> +1 vi` neu' ra 0 se la 1, ra 5 se la 6
				int giaTri2 = xucXac2.nextInt(5)+1;
				int giaTri3 = xucXac3.nextInt(5)+1;
				
				//Tinh toan:
				System.out.println("*** Ket qua: ");
				System.out.println("*** Xuc xac 1: " +giaTri1);
				System.out.println("*** Xuc xac 2: " +giaTri2);
				System.out.println("*** Xuc xac 3: " +giaTri3);
				
				int tong = giaTri1 + giaTri2 + giaTri3;
				System.out.println("*** Tong diem: " +tong);
				
				if(tong == 3 || tong == 18) {
					System.out.println("*** Nha` cai an, nguoi choi thua!");
					taiKhoanNguoiChoi -= soTienDatCuoc;
					System.out.println("*** Tai khoan nguoi choi: " +numformat.format(taiKhoanNguoiChoi));
				} else if (tong >= 4 && tong <= 10) {
					System.out.println("*** Xiu an");
					if(luaChonTaiXiu == 2) {
						System.out.println("Ban da win !");
						taiKhoanNguoiChoi += soTienDatCuoc;
					} else {
						taiKhoanNguoiChoi -= soTienDatCuoc;
					}
					System.out.println("*** Tai khoan nguoi choi: " +numformat.format(taiKhoanNguoiChoi));
				} else if (tong >= 11 && tong <= 17) {
					System.out.println("*** Tai an");
					if(luaChonTaiXiu == 1) {
						System.out.println("*** Ban da win !");
						taiKhoanNguoiChoi += soTienDatCuoc;
					} else {
						System.out.println("*** Ban da lose !");
						taiKhoanNguoiChoi -= soTienDatCuoc;
					}
					System.out.println("*** Tai khoan nguoi choi: " +numformat.format(taiKhoanNguoiChoi));
				}
				
			}
			
		} while(luaChon == 1);
	}
}
