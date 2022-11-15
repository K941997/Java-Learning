package StringEqualsCompare1;

/*
 * String Equals CompareTo:
 * - Equals: So sanh bang =
 * - CompareTo: So sanh theo thu tu >, <, =
 * */

public class Example {
	public static void main(String[] args) {
		//Ham` equals: So sanh =, phan biet hoa thuong
		String s1 = "abc";
		String s2 = "ABC";
		String s3 = "abc";
		System.out.println("s1 equals s2: " +s1.equals(s2));
		System.out.println("s1 equals s3: " +s1.equals(s3));
		System.out.println("s2 equals s3: " +s2.equals(s3));
		
		//Ham` equalsIgnoreCase: So sanh =, ko phan biet hoa thuong
		System.out.println("s1 equalsIgnoreCase s2: " +s1.equalsIgnoreCase(s2));
		System.out.println("s1 equalsIgnoreCase s3: " +s1.equalsIgnoreCase(s3));
		System.out.println("s2 equalsIgnoreCase s3: " +s2.equalsIgnoreCase(s3));
		
		//Ham` compare: So sanh theo thu tu > < =, phan biet hoa thuong
		String sv1 = "Nguyen Van A";
		String sv2 = "Nguyen Van B";
		String sv3 = "Nguyen Van";
		String sv4 = "Nguyen Van A";
		System.out.println("sv1 compareTo sv2: " +sv1.compareTo(sv2));
		System.out.println("sv1 compareTo sv3: " +sv1.compareTo(sv3));
		System.out.println("sv1 compareTo sv4: " +sv1.compareTo(sv4));
		
		//Ham` compareToIgnoreCase: So sanh theo thu tu > < =, ko phan biet hoa thuong
		System.out.println("sv1 compareToIgnoreCase sv2: " +sv1.compareToIgnoreCase(sv2));
		System.out.println("sv1 compareToIgnoreCase sv3: " +sv1.compareToIgnoreCase(sv3));
		System.out.println("sv1 compareToIgnoreCase sv4: " +sv1.compareToIgnoreCase(sv4));
		
		//Ham` regionMatches: So sanh 1 doan ngan
		String r1 = "TITV.vn";
		String r2 = "TV.v";
		String r3 = "12343534";
		boolean check = r1.regionMatches(2, r2, 0, 4); //(kytuthu2cuar1, r2, kytuthu0cuar2, kytuthu4cuar2)
		System.out.println(check);
	
		//Ham` startWith: Kiem tra chuoi bat dau
		String sdt = "037456789";
		System.out.println(sdt.startsWith("037"));
		System.out.println(sdt.startsWith("789"));
		
		//Ham` endWith: Kiem tra chuoi ket thuc
		String tenFile1 = "I love you .jpg";
		String tenFile2 = "Hoc Java .pdf";
		if(tenFile1.endsWith("jpg")) {
			System.out.println("File hinh` anh?");
		} else if(tenFile1.endsWith("pdf")) {
			System.out.println("File pdf");
		}
		if(tenFile2.endsWith("jpg")) {
			System.out.println("File hinh` anh?");
		} else if(tenFile2.endsWith("pdf")) {
			System.out.println("File pdf");
		}
		
		
		
		
		
	}
}
