package Example1Cafe;

public class Main {
	public static void main(String[] args) {
		HoaDonCafe hoaDon1 = new HoaDonCafe("Trung Nguyen", 100000, 1.5);
		HoaDonCafe hoaDon2 = new HoaDonCafe("Highlands", 600000, 2.5);
		
		System.out.println("Tong tien cua hoadon1: " +hoaDon1.tinhTongTien());
		System.out.println("Kiem tra khoi luong da ban hoadon1 > 2kg: " +hoaDon1.kiemTraKhoiLuongDaBanVoiKNhap(2));
		System.out.println("Kiem tra khoi luong da ban hoadon1 > 1kg: " +hoaDon1.kiemTraKhoiLuongDaBanVoiKNhap(1));
		System.out.println("Kiem tra tong tien hoadon1 > 500k: " +hoaDon1.kiemTraTongTienLonHon500k());
		System.out.println("So tien giam gia cua hoadon1: " +hoaDon1.soTienGiamGia(10)); //khong giam gia vi hoaDon1 < 500k
		System.out.println("So tien giam gia cua hoadon2: " +hoaDon2.soTienGiamGia(10)); //giam 10% vi hoaDon2 > 500k
		System.out.println("So tien sau khi giam hoadon1: " +hoaDon1.giaSauKhiGiam(10)); //khong giam gia vi hoaDon1 < 500k	
		System.out.println("So tien sau khi giam hoadon2: " +hoaDon2.giaSauKhiGiam(10)); //giam 10% vi hoaDon2 > 500k
	}
}
