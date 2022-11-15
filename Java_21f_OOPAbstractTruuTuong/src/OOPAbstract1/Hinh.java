package OOPAbstract1;

/*
 * Truu` Tuong. Abstract:
 * - Khong the? tao. Obj qua Abstract Class (Class Cha)
 * - Co' the? tao. Obj qua Class Con extends Abstract Class (Class Cha)
 * - Abstract Method (Class Cha) se~ Override o? Class Con
 * */

public abstract class Hinh {
	protected ToaDo toaDo;

	public Hinh(ToaDo toaDo) {
		super();
		this.toaDo = toaDo;
	}

	public ToaDo getToaDo() {
		return toaDo;
	}

	public void setToaDo(ToaDo toaDo) {
		this.toaDo = toaDo;
	}
	
	//abstract method tinhDienTich():
	public abstract double tinhDienTich();
	
	
	
}
