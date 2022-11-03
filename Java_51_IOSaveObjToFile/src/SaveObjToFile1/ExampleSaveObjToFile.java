package SaveObjToFile1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/*
 * IO Save Obj To File:
 * - Create Obj SinhVien
 * - Create Collection List Interface (ArrayList):
 * - Save Obj To File = Serializable, OutputStream, FileOutputStream
 * - writeObject() + flush() day du lieu di + close() dong du lieu
*/

public class ExampleSaveObjToFile {
	public static void main(String[] args) {
		try {
			File file1 = new File("D:\\1_K941997_Java\\Apps\\Java_51_IOSaveObjToFile\\file1.data");
			OutputStream os = new FileOutputStream(file1);
			ObjectOutputStream oos = new ObjectOutputStream(os); 
			
			SinhVien sinhVien1 = new SinhVien("001", "Khanh", 1997, 9.5f);
			oos.writeObject(sinhVien1);
			
			oos.flush();
			oos.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
