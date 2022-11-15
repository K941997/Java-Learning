package IOZipUnzipFile1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/*
 * Zip 1 File: (ZipOutputStream)
 * 1. sourceFile: file goc
 * 
 * 2. FileOutputStream fos: create file zip
 * - ZipOutputStream zos(fos): create zip
 * 
 * 3. FileToZip fileToZip(sourceFile): file goc de zip
 * - FileInputStream fis(fileToZip): read file
 * 
 * 4. ZipEntry zipEntry(fileToZip.getName): zip childs
 * - zos.putNextEntry(zipEntry): put zip childs to zip
 * 
 * 5. byte[] bytes: create array bytes
 * - fis.read(bytes)
 * - zos.write(bytes)
 * 6. zos.close(), fis.close(), fos.close()
 * */

public class ZipFile {
	public static void main(String[] args) throws IOException {
		//Create sourcefile, create file, create zip:
		String sourceFile = "D:\\1_K941997_Java\\Apps\\Java_53_IOZipUnzipFile\\file1.txt";
		FileOutputStream fos = new FileOutputStream("D:\\1_K941997_Java\\Apps\\Java_53_IOZipUnzipFile\\filecompressed.zip");
		ZipOutputStream zos = new ZipOutputStream(fos);
		
		//Read file:
		File fileToZip = new File(sourceFile);
		FileInputStream fis = new FileInputStream(fileToZip);
		
		//Zip Childs:
		ZipEntry zipEntry = new ZipEntry(fileToZip.getName());
		zos.putNextEntry(zipEntry);
		
		//Create array byte[]:
		byte[] bytes = new byte[1024];
		int length;
		
		//Read array byte[] in file + Write to file zip:
		while((length = fis.read(bytes)) >= 0) {
			zos.write(bytes, 0, length);
		}
		
		zos.close();
		fis.close();
		fos.close();
	}
}
