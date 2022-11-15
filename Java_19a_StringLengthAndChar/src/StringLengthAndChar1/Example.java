package StringLengthAndChar1;

import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		System.out.println("Nhap vao chuoi: ");
		s = sc.nextLine();
		System.out.println("--------------");
		
		//Ham` length(): lay' do. dai` chuoi~
		System.out.println("Ham` s.length: " +s.length());
		System.out.println("--------------");
		
		//Ham` charAt(vitri): lay' 1 ky' tu. tai. vi. tri' cu. the?
		for(int i = 0; i < s.length(); i++) {
			System.out.println("Vi. tri' " +i+ " la`: " +s.charAt(i));
		}
		System.out.println("--------------");
		
		//Ham` getChars(vitribatdau, vitriketthuc, mangluudulieu, vitribatdauluu): lay' nhieu` ky' tu.
		char[] arr = new char[20];
		s.getChars(2, 4, arr, 0);
		for(int i = 0; i < arr.length; i++ ) {
			System.out.println("Gia tri mang tai vi tri': " +i+ " la`: " +arr[i]);
		}
		
		//Ham` getBytes: lay' ra gia' tri. byte cua? ky' tu.
		byte[] arrBytes = s.getBytes();
		for(byte b : arrBytes ) {
			System.out.println(b);
		}
	}
}
