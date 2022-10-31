package OOPInterface1;

/*
 * 
 * */

public class Test {
	public static void main(String[] args) {
		//Cau a:
		System.out.println("Test cau a: ");
		MayTinhCasioFX500 mayTinhCasio = new MayTinhCasioFX500();
		MayTinhVinaCal500 mayTinhVina = new MayTinhVinaCal500();
		System.out.println("5 + 3 = " +mayTinhCasio.cong(5, 3));
		System.out.println("4 * 5 = " +mayTinhVina.nhan(4, 5));
		System.out.println("4 / 0 = " +mayTinhVina.chia(4, 0));
		System.out.println("---------------------");
		
		//Cau b:
		System.out.println("Test cau b: ");
		double[] arr1 = new double[] {5,1,3,4,5,8,0};
		double[] arr2 = new double[] {6,2,7,9,2,4,5};
		SapXepChen sapXepChen = new SapXepChen();
		SapXepChon sapXepChon = new SapXepChon();
		System.out.println("Mang? 1 sap xep chen` sap xep tang len: ");
		sapXepChen.sapXepTang(arr1);
		System.out.println("Hien thi mang 1 sau khi sap xep: ");
		for(int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] +" "); //print: 1 dong`, println: in line n dong`
		}
		System.out.println();
		System.out.println("Mang? 2 sap xep chon. sap xep giam di: ");
		sapXepChon.sapXepGiam(arr2);
		System.out.println("Hien thi mang 2 sau khi sap xep: ");
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] +" ");
		}
		System.out.println();
		System.out.println("-------------------");
		
		//Cau c:
		System.out.println("Test cau c: ");
		PhanMemMayTinh pmmt = new PhanMemMayTinh();
		System.out.println("3 + 5 = " +pmmt.cong(3, 5));
		double[] arr3 = new double[] {1,2,7,9,2,4,5};
		pmmt.sapXepTang(arr3);
		for(int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
		
		
	}
}
