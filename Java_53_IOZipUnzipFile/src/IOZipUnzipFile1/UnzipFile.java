package IOZipUnzipFile1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/*
 * Unzip File: (ZipInputStream)
 * 
 * */

public class UnzipFile {
	public static File newFile(File destinationDir, ZipEntry zipEntry) throws IOException {
		File destinationFile = new File(destinationDir, zipEntry.getName());
		
		String desDirPath = destinationDir.getCanonicalPath();
		String desFilePath = destinationFile.getCanonicalPath();
		
		if(!desFilePath.startsWith(desDirPath + File.separator)) {
			throw new IOException("Entry is outside of the target" + zipEntry.getName());
		}
		
		return destinationFile;
	}
	
	public static void main(String[] args) throws IOException {
		String fileZip = "D:\\1_K941997_Java\\Apps\\Java_53_IOZipUnzipFile\\foldercompressed.zip";
		File desDir = new File("D:\\1_K941997_Java\\Apps\\Java_53_IOZipUnzipFile\\unzip_foldercompressed");
		byte[] buffer = new byte[1024];
		ZipInputStream zis = new ZipInputStream(new FileInputStream(fileZip));
		ZipEntry zipEntry = zis.getNextEntry();
		while(zipEntry != null) {
			File newFile = newFile(desDir, zipEntry);
			if(zipEntry.isDirectory()) {
				if(!newFile.isDirectory() && !newFile.mkdirs()) {
					throw new IOException("Failed to create directory while unzip" + newFile);
				}
			} else {
					//fix for Windows-created archives:
					File parent = newFile.getParentFile();
					if(!parent.isDirectory() && !parent.mkdirs()) {
						throw new IOException("Failed to create directory while unzip" + parent);
					}
					
					//write file content:
					FileOutputStream fos = new FileOutputStream(newFile);
					int length;
					while((length = zis.read(buffer)) > 0) {
						fos.write(buffer, 0, length);
					}
					fos.close();
			}
			zipEntry = zis.getNextEntry();
		}
		zis.closeEntry();
		zis.close();
	}
}

