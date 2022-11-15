package IOZipUnzipFile1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/*
 * Zip 1 FileDirectory(Folder): (ZipOutputStream)
 * */

public class ZipFileDirectory {
	public static void main(String[] args) throws IOException {
		String srcFile = "D:\\1_K941997_Java\\Apps\\Java_53_IOZipUnzipFile\\folder1";
		FileOutputStream fos = new FileOutputStream("D:\\1_K941997_Java\\Apps\\Java_53_IOZipUnzipFile\\foldercompressed.zip"); 
		ZipOutputStream zos = new ZipOutputStream(fos);
		
		File fileToZip = new File(srcFile);
		
		zipFileDirectory(fileToZip, fileToZip.getName(), zos);
		zos.close();
		fos.close();
	
	}
	
	private static void zipFileDirectory(File fileToZip, String fileName, ZipOutputStream zos) throws IOException {
		if(fileToZip.isHidden()) {
			return;
		}
		if(fileToZip.isDirectory()) {
			if(fileName.endsWith("/")) {
				zos.putNextEntry(new ZipEntry(fileName));
				zos.closeEntry();
			} else {
				zos.putNextEntry(new ZipEntry(fileName + "/"));
				zos.closeEntry();
			}
			
			File[] fileChildrens = fileToZip.listFiles();
			for(File fileChildren: fileChildrens) {
				zipFileDirectory(fileChildren, fileName + "/" + fileChildren.getName(), zos);
				
			}
			return;
		}
		
		FileInputStream fis = new FileInputStream(fileToZip);
		ZipEntry zipEntry = new ZipEntry(fileName);
		zos.putNextEntry(zipEntry);
		byte[] bytes = new byte[1024];
		int length;
		while((length = fis.read(bytes)) >= 0) {
			zos.write(bytes, 0, length);
		}
		fis.close();
			 
	}
}
