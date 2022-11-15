package Example1Cafe;

/**
 * Đề bài: 1 hóa đơn gồm:
 * - Tên loại cafe
 * - Giá tiền trên 1 kg
 * - Khối lượng của túi cafe
 * -> Tính tổng tiền của hóa đơn dựa trên khối lượng nhân giá tiền 1kg
 * -> Kiểm tra khối lương cafe của túi đã bán có lớn hơn 1 con số được đưa vào phương thức hay ko
 * -> Kiểm tra giá tiền của hóa đơn có lớn hơn 500k hay không
 * -> Tính số tiền giảm giá, giảm x% cho các hóa đơn giá trị > 500k
 * -> Tính số tiền khách phải trả sau khi giảm giá
 */
public class HoaDonCafe {
	//Properties: Thuộc tính
	private String tenLoaiCafe;
	private double giaTien1Kg;
	private double khoiLuong;
	
	//Constructor: Hàm khởi tạo đối tượng
	public HoaDonCafe(String t, double g, double k) {
		this.tenLoaiCafe = t;
		this.giaTien1Kg = g;
		this.khoiLuong = k;
	}
	
	//Methods: Phương thức
	public double tinhTongTien() { //double: return double
		return this.giaTien1Kg * this.khoiLuong;
	}
	
	public boolean kiemTraKhoiLuongDaBanVoiKNhap(double kNhap) { //boolean: return boolean
		if (this.khoiLuong > kNhap) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean kiemTraTongTienLonHon500k() { //boolean: return boolean
		return this.tinhTongTien() > 500000;
	}
	
	public double soTienGiamGia(double x) { //double: return double
		if(this.tinhTongTien()>500000) {
			return (x/100)*this.tinhTongTien();
		}else {
			return 0;
		}
	}
	
	public double giaSauKhiGiam (double x) {
		return this.tinhTongTien() - this.soTienGiamGia(x);
	}
	
}
