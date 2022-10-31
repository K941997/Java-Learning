package StringConcatReplaceTrimSubString1;

public class Example {
	public static void main(String[] args) {
		String s1 = "tItv";
		String s2 = ".Vn";
		
		//Math Basic:
		String s3 = s1 + s2;
		System.out.println("s3: " +s3);
		
		//Ham` concat: noi' chuoi~
		String s4 = s1.concat(s2);
		System.out.println("s4: " +s4);
		
		//Ham` replace: thay the'
		String s5 = "Tung.vn";
		String s6 = s5.replaceAll("Tung", "Khanh");
		System.out.println("s5: " +s5);
		System.out.println("s6: " +s6);
		
		//Ham` toLowerCase -> viet thuong
		//Ham` toUpperCase -> viet hoa
		String s7 = s3.toLowerCase();
		String s8 = s3.toUpperCase();
		System.out.println("s7: " +s7);
		System.out.println("s8: " +s8);
		
		//Ham` trim: xoa' khoang? trang' du thua`
		String s9 = "   Xin chao abc!   ";
		System.out.println(s9.trim());
		
		//Ham` subString: cat' chuoi~ con
		String s10 = "Xin chao` cac' ban, minh la Khanh";
		String s11 = s10.substring(10);
		String s12 = s10.substring(10, 18);
		System.out.println("s11: " +s11);
		System.out.println("s12: " +s12);
		
	}
}
