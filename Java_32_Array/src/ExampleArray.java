import java.util.Iterator;
import java.util.Scanner;

public class ExampleArray {
	public static void main(String[] args) {
		double[] mang1;
		double mang2[];
		
		//Nhập giá trị vào mảng 1:
		mang1 = new double[10]; //mảng có 10 phần tử
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<mang1.length; i++) {
			System.out.println("Nhap phan tu thu " +i+ ":");
			mang1[i] = sc.nextDouble();
		}
		
		//Tính tổng các phần tử trong mảng:
		double tong = 0;
		for (int i = 0; i < mang1.length; i++) {
			tong += mang1[i];
		}
		System.out.println("Tong = " + tong);
		
		//Nhập giá trị vào mảng 2:
		mang2 = new double[]{9,8,7,6,5};
		for (int i = 0; i < mang2.length; i++) {
			System.out.println("Phan tu " +i+ " co gia tri: " +mang2[i]);
		}
	}
		
}
