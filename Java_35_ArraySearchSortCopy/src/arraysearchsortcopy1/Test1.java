package arraysearchsortcopy1;

import java.util.Arrays;

public class Test1 {
	
	//Custom ham` reverse: sap xep giam dan
	public static int[] reverse(int[] x) {
		int[] rs = new int[x.length];
		int index = 0;
		for(int i = x.length - 1; i >= 0; i--) {
			rs[index] = x[i];
			index++;
		}
		return rs;
	}
	
	public static void main(String[] args) {
		int[] a = new int[] {1,8,2,6,4,3,7,9};
		int[] b = new int[15];
		
		System.out.println("a ban dau`: " +Arrays.toString(a));
		
		//Ham` sort: sap xep tang dan`
		Arrays.sort(a);
		System.out.println("a sau khi sap xep tang dan: " +Arrays.toString(a));
		
		//Ham` binarySearch: tim kiem phan tu trong mang
		System.out.println(Arrays.binarySearch(a, 4)); //3 -> co' trong mang
		System.out.println(Arrays.binarySearch(a, -1)); //-1 -> ko co' trong mang
		
		//Ham` fill: dien` gia tri
		Arrays.fill(b, 5);
		System.out.println("b sau khi dien` gia' tri.: " +Arrays.toString(b));
		
		//Ham` custom reverse: sap xep giam dan
		Arrays.sort(a);
		a = Test1.reverse(a);
		System.out.println("a sau khi sap xep giam dan: " +Arrays.toString(a));
		
	}
}
