package BaiTap2QuanLyPhim;

public class Test {
	public static void main(String[] args) {
		NgayChieu ngay1 = new NgayChieu(15, 05, 2022);
		NgayChieu ngay2 = new NgayChieu(31, 01, 2025);
		NgayChieu ngay3 = new NgayChieu(16, 02, 2002);
		
		HangSanXuat hangSanXuat1 = new HangSanXuat("Hang A", "Viet Nam");
		HangSanXuat hangSanXuat2 = new HangSanXuat("Hang B", "Nhat Ban");
		HangSanXuat hangSanXuat3 = new HangSanXuat("Hang C", "Han Quoc");
		
		Phim phim1 = new Phim("Phim A", 2020, hangSanXuat1, 65000, ngay1);
		Phim phim2 = new Phim("Phim B", 2021, hangSanXuat2, 100000, ngay2);
		Phim phim3 = new Phim("Phim C", 2025, hangSanXuat3, 65000, ngay3);
		
		//Kiem tra gia ve 1 phim bat ky co re hon gia ve phim khac ko:
		System.out.println("Kiem tra gia ve Phim A co re hon Phim B ko: " +phim1.kiemTraGiaVeReHon(phim2));
		System.out.println("Kiem tra gia ve Phim A co re hon Phim C ko: " +phim1.kiemTraGiaVeReHon(phim3));;
	
		//Show ten hang san xuat:
		//Cach 1:
//		phim1.showTenHangSanXuat();
//		phim2.showTenHangSanXuat();
//		phim3.showTenHangSanXuat();
		
		//Cach 2:
		System.out.println("Hang san xuat Phim 1 la: " +phim1.showTenHangSanXuat());
		System.out.println("Hang san xuat Phim 2 la: " +phim2.showTenHangSanXuat());
		System.out.println("Hang san xuat Phim 3 la: " +phim3.showTenHangSanXuat());
		
		//Gia ve sau khi giam gia:
		System.out.println("Gia ve Phim 1 sau khi giam 10%: " +phim1.giaVeKhiCoKhuyenMai(10));
		System.out.println("Gia ve Phim 2 sau khi giam 20%: " +phim2.giaVeKhiCoKhuyenMai(20));
		System.out.println("Gia ve Phim 3 sau khi giam 50%: " +phim3.giaVeKhiCoKhuyenMai(50));
	}
}
