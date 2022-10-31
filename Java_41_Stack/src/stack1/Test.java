package stack1;

import java.util.Scanner;
import java.util.Stack;

/*
 * Java Stack (Ngan xep): LIFO (Last In First Out)
	stackChuoi.push("giatri"); //them gia tri vao stack
	stackChuoi.pop(); //lay gia tri ra, ko xoa khoi stack
	stackChuoi.peek(); //lay gia tri ra, ko xoa khoi stack
	stackChuoi.clear(); //xoa tat ca phan tu trong stack
	stackChuoi.contains("giatri"); //xac dinh gia tri ton tai hay ko
	stackChuoi.size(); //do lon cua stack
 * */

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		Stack<String> stackChuoi = new Stack<String>();
		
//		stackChuoi.push("giatri"); //them 1 phan tu vao stack
//		stackChuoi.pop(); //lay phan tu o tren cung, xoa hoac ko xoa khoi stack
//		stackChuoi.peek(); //lay phan tu o tren cung, ko xoa khoi stack
//		stackChuoi.clear(); //xoa tat ca phan tu trong stack
//		stackChuoi.contains("giatri"); //xac dinh gia tri ton tai hay ko
//		stackChuoi.size(); //do lon cua stack
//		stackChuoi.isFull(); //kiem tra stack day hay chua
//		stackChuoi.isEmpty(); //kiem tra stack trong hay khong
		
		//1. Vi du dao nguoc chuoi:
		//a. Nhap lan luot chu vao stack:
		Stack<String> stackChuoi = new Stack<String>();
		System.out.println("Nhap vao chuoi: ");
		String s = sc.nextLine();
		for(int i = 0; i < s.length(); i++) {
			stackChuoi.push(s.charAt(i) + "");
		}
		//b. Dao nguoc chuoi:
		System.out.println("Chuoi dao nguoc: ");
		for(int i = 0; i < s.length(); i++) {
			System.out.println(stackChuoi.pop());
		}
		
		//2. Chuyen he thap phan sang nhi phan:
		//a. Nhap so nguyen duong:
		Stack<Integer> stackSoDu = new Stack<Integer>();
		System.out.println("Nhap so nguyen duong: ");
		int x = sc.nextInt();
		while (x > 0) {
			int soDu = x % 2;
			stackSoDu.push(soDu);
			x = x / 2;
		}
		//b. In so nhi phan:
		System.out.println("So nhi phan la: ");
		int n = stackSoDu.size();
		for(int i = 0; i < n; i++) {
			System.out.println(stackSoDu.pop());
		}
		
		
		
	}
}
