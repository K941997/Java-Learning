package OOPAbstract1;

/*
 * Truu` Tuong. Abstract:
 * - Khong the? tao. Obj qua Abstract Class (Class Cha)
 * - Co' the? tao. Obj qua Class Con extends Abstract Class (Class Cha)
 * - Abstract Method (Class Cha) se~ Override o? Class Con
 * */

public class Test {
	public static void main(String[] args) {
		ToaDo toaDo1 = new ToaDo(1, 2);
		ToaDo toaDo2 = new ToaDo(3, 4);
		ToaDo toaDo3 = new ToaDo(5, 6);
		
//		Hinh hinh1 = new Hinh(td1) //-> khong the tao. qua abstract class cha
		
		Hinh hinh1 = new Diem(toaDo1); //-> co' the tao. qua class con
		Hinh hinh2 = new HinhChuNhat(toaDo2, 4, 5);
		Hinh hinh3 = new HinhTron(toaDo3, 6);
		
		System.out.println("Dien tich Diem: " +hinh1.tinhDienTich());
		System.out.println("Dien tich hinh chu nhat: " +hinh2.tinhDienTich());
		System.out.println("Dien tich hinh tron: " +hinh3.tinhDienTich());
	}
}
