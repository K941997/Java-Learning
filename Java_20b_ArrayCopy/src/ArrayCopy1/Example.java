package ArrayCopy1;

import java.util.Arrays;

public class Example {
	public static void main(String[] args) {
		//Kieu nguyen thuy:
		int[] mang1 = {1, 2, 3};
		
		//Copy 1: Dung` phep' gan':
		int[] mang1a = mang1;
		mang1a[0] = 100;
		System.out.println("Mang 1: " +mang1); //-> dung` Arrays.toString()
		System.out.println("Mang 1: " +Arrays.toString(mang1));
		System.out.println("Mang 1a: " +Arrays.toString(mang1a));
		
		//Copy 2: Dung` ham` clone:
		int[] mang1b = mang1.clone();
		mang1b[0] = 50;
		System.out.println("Mang 1b: " +Arrays.toString(mang1));
		
		//Copy 3: Dung` System.arraycopy:
		int[] mang1c = new int[mang1.length];
		System.arraycopy(mang1, 0, mang1c, 0, mang1.length);
		mang1c[0] = 90;
		System.out.println("Mang 1c: " +Arrays.toString(mang1c));
	}
}
