package FileFolderDelete1;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

/*
 * File Folder Delete:
 * */

public class Example {
	
	public static void xoaFile1(File file) {
		if(file.isFile()) {
			//Xoa file:
			System.out.println("Da xoa: " +file.getAbsolutePath());
			file.delete();
		} else if(file.isDirectory()) {
			//Xoa folder:
			File[] fileChilds = file.listFiles();
			for(File fileChild: fileChilds) {
				xoaFile1(fileChild);
			}
			System.out.println("Da xoa: " +file.getAbsolutePath());
			file.delete();
		}
	}
	
	public static void xoaFile2(File file) {
		Path path = file.toPath();
		if(file.isFile()) {
			System.out.println("Da xoa: " +file.getAbsolutePath());
			try {
				Files.deleteIfExists(path);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if(file.isDirectory()) {
			File[] fileChilds = file.listFiles();
			for(File fileChild: fileChilds) {
				xoaFile2(fileChild);
			}
			System.out.println("Da xoa: " +file.getAbsolutePath());
			try {
				Files.deleteIfExists(path);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		
		//Su dung delete():
		/*
		File file0 = new File("D:\\1_K941997_Java\\Apps\\Java_47_FileFolderDelete\\F0");
		File file1 = new File("D:\\1_K941997_Java\\Apps\\Java_47_FileFolderDelete\\F1");
		File file2 = new File("D:\\1_K941997_Java\\Apps\\Java_47_FileFolderDelete\\F2.txt");
		//file0.deleteOnExit(); //false vi file0 co file con
		file1.deleteOnExit(); //true vi file1 rong
		file2.deleteOnExit(); //true vi file2 la tap tin txt
		System.out.println(file0.delete()); //false vi file0 co file con
		System.out.println(file1.delete()); //true vi file1 rong
		Example.xoaFile1(file0); //true vi file0 da xoa duoc 
		*/
		
		//Su dung class Files:
		File file0 = new File("D:\\1_K941997_Java\\Apps\\Java_47_FileFolderDelete\\F0");
		File file1 = new File("D:\\1_K941997_Java\\Apps\\Java_47_FileFolderDelete\\F1");
		File file2 = new File("D:\\1_K941997_Java\\Apps\\Java_47_FileFolderDelete\\F2.txt");
		Path path0 = file0.toPath();
		Path path1 = file1.toPath();
		Path path2 = file2.toPath();
		try {
			//Files.deleteIfExists(path0); //false vi co file con
			Files.deleteIfExists(path1); //true vi rong
			Files.deleteIfExists(path2); //true vi la txt
			
			Example.xoaFile2(file0);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
