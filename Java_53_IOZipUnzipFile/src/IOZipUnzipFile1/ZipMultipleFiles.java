package IOZipUnzipFile1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/*
 * Zip Multiple Files: (ZipOutputStream)
 * 1. List<String> srcFiles: cac file goc
 * 2. FileOutputStream fos, throws IOException: create file zip
 * - ZipOutputStream zos(fos): create zip
 * 4. for loop(srcFile: srcFiles): cho tung file goc
 * 	4a. File fileToZip(srcFile): file goc de zip 
 * 	4b. FileInputStream(fis): read file
 * 	4c. ZipEntry zipEntry(fileToZip): file zip childs
 * 	- zos.putNextEntry(zipEntry): put file childs to zip
 * 	4d. byte[] bytes: create array bytes
 * 	- fis.read(bytes)
 * 	- zos.write(bytes)
 * 5. fis.close()
 * 6. zos.close(), fos.close()
 * */

public class ZipMultipleFiles {
	public static void main(String[] args) throws IOException {
		List<String> srcFiles = Arrays.asList("D:\\1_K941997_Java\\Apps\\Java_53_IOZipUnzipFile\\file1.txt", "D:\\1_K941997_Java\\Apps\\Java_53_IOZipUnzipFile\\file2.txt");
		FileOutputStream fos = new FileOutputStream("multiplefilescompressed.zip");
		ZipOutputStream zos = new ZipOutputStream(fos); 
		
		for(String srcFile: srcFiles) {
			File fileToZip = new File(srcFile);
			FileInputStream fis = new FileInputStream(fileToZip);
			ZipEntry zipEntry = new ZipEntry(fileToZip.getName());
			zos.putNextEntry(zipEntry);
			
			byte[] bytes = new byte[1024];
			int length;
			while((length = fis.read(bytes)) >= 0) {
				zos.write(bytes, 0, length);
			}
			fis.close();
		}
		zos.close();
		fos.close();
	}
}
