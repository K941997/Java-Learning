package SaveTextToFile1;

import java.io.PrintWriter;

/*
 * Save/Print Text To File:
 * - Try/catch
 * - Create PrintWriter pw File - file
 * - pw.println("abc" | 3.14 | Obj) - print text to file
 * - pw.flush()
 * - pw.close
 * */

public class Example {
	public static void main(String[] args) {
		try {
			PrintWriter pw = new PrintWriter("D:\\1_K941997_Java\\Apps\\Java_49_IOPrintTextToFile\\file1.txt", "UTF-8");
			pw.println("Xin chao, minh la K");
			pw.print("Du lieu: ");
			pw.print(3.14);
			pw.print(' ');
			pw.print(" la so Pi");
			pw.println();
			
			Student student1 = new Student(001, "Nguyen Ngoc Khanh");
			pw.println(student1);
			pw.println();
			
			pw.flush();
			pw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
