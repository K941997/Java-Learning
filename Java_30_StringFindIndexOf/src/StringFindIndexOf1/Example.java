package StringFindIndexOf1;

public class Example {
	public static void main(String[] args) {
		String s1 = "Xin chao co chu, cac ban, xin chao !";
		String s2 = "Xin chao";
		String s3 = "Xin chao 123";
		char c1 = 'o';
		
		//Ham` indexOf tim` kiem String trong String:
		System.out.println("Vi tri cua s2 trong s1 la: " +s1.indexOf(s2));
		System.out.println("Vi tri cua s3 trong s1 la: " +s1.indexOf(s3));
		System.out.println("Vi tri cua s2 trong s1 tai vi tri thu 2: " +s1.indexOf(s2, 2));
		
		//Ham` indexOf tim` kiem char trong String:
		System.out.println("Tim kiem c1 trong s1: " +s1.indexOf(c1));
		System.out.println("Tim kiem c1 trong s1 tai vi tri thu 20: " +s1.indexOf(c1, 20));
	
		//Ham` lastIndexOf: tim` kiem' tu` phai sang trai
		System.out.println("Vi tri cua s2 trong s1 (tu` phai? sang trai') la: " +s1.lastIndexOf(s2));
	
		
	}
}
