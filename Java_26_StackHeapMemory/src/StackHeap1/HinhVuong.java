package StackHeap1;

/*
 * Stack & Heap Memory:
 * 1. Stack luu bien' local, bien' tham chieu, method, doi' so'  
 * 2. Heap luu Object, String
 * */

public class HinhVuong {
	public void chuVi() {
		System.out.println("chu vi");
	}
	
	public static void xinChao(HinhVuong hinhVuong) {
		String s = "xin chao"; //s save in Stack, String "xin chao" save in Heap
		System.out.println(s); //s save in Stack
		hinhVuong.chuVi(); //hinhVuong save in Stack, chuVi() save in Stack
	}
	
	public static void main(String[] args) { //main() save in Stack
		int x = 10; //x save in Stack
		System.out.println(x); //x save in Stack
		HinhVuong hinhVuong = new HinhVuong(); //hinhVuong save in Stack, HinhVuong() save in Heap
		xinChao(hinhVuong); //xinChao() save in Stack
	}
}
