package ForEachLoop1;

/*
 * For Each Loop:
 * - Lap tung phan tu child
 * */

public class Main {
	public static void main(String[] args) {
		
		//Vi du 1:
		int[] array1 = {1, 2, 3, 4, 5};
		for(int child: array1) {
			System.out.println(child);
		}
		
		//Vi du 2:
		String[] array2 = {"Xin chao", "Tam biet"};
		for(String child: array2) {
			System.out.println(child);
		}
	}
}
