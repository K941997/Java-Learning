package ReadObjFromFile1;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class ExampleReadObjFromFile {
	public static void main(String[] args) {
		try {
			File file1 = new File("D:\\1_K941997_Java\\Apps\\Java_52_IOReadObjFromFile\\file1.data");
			InputStream is = new FileInputStream(file1);
			ObjectInputStream ois = new ObjectInputStream(is);
			
			SinhVien sv = (SinhVien) ois.readObject();
			System.out.println(sv);
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
