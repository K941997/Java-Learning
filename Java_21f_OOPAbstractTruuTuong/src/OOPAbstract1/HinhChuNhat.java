package OOPAbstract1;

/*
 * Truu` Tuong. Abstract:
 * - Khong the? tao. Obj qua Abstract Class (Class Cha)
 * - Co' the? tao. Obj qua Class Con extends Abstract Class (Class Cha)
 * - Abstract Method (Class Cha) se~ Override o? Class Con
 * */

public class HinhChuNhat extends Hinh {
	private double chieuRong, chieuCao;

	public HinhChuNhat(ToaDo toaDo, double chieuRong, double chieuCao) {
		super(toaDo);
		this.chieuRong = chieuRong;
		this.chieuCao = chieuCao;
	}

	public double getChieuRong() {
		return chieuRong;
	}

	public void setChieuRong(double chieuRong) {
		this.chieuRong = chieuRong;
	}

	public double getChieuCao() {
		return chieuCao;
	}

	public void setChieuCao(double chieuCao) {
		this.chieuCao = chieuCao;
	}

	@Override
	public double tinhDienTich() {
		return this.chieuCao*this.chieuRong;
	}
	
}
