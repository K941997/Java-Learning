package FileFolderCreate1;

import java.io.File;
import java.io.IOException;

/*
 * File Folder Create:
 * - Luu y:
 * 		+ MS Windows: \\, Vi du: "C:\\ThuMuc1\\ThuMuc\\TepTin.xxx"
 * 		+ Linux, MacOS: /, Vi du: "C:/ThuMuc1/ThuMuc/TepTin.xxx"
 * 
 * - Code:
 * 		File file1 = new File("D:\\abc"); - Tao File
 * 		file1.exist(); - Kiem tra ton tai
 * 		folder1.mkdir(); - Tao 1 thu muc mkdir
 * 		folder2.mkdirs(); - Tao nhieu thu muc con mkdirs
 * 		Tao file mo rong (.exe, .txt, .doc):
 * 			File file1MoRong = new File("D:\\1_K941997_Java\\Apps\\Java_45_FileFolder\\Folder1\\File1MoRong.txt");
			try {
				file1MoRong.createNewFile();
			} catch (IOException e) {
				//Khong co quyen tao tap tin
				//O cung bi day
				//Duong dan sai
				e.printStackTrace();
			}
 * */

public class Example {
	public static void main(String[] args) {
		
		//Tao file:
		File file1 = new File("D:\\1_K941997_Java\\Apps\\Java_45_IOFileFolderCreate");
		File file2 = new File("D:\\1_K941997_Java\\Apps\\Java_46_FileFolder");
		
		//Kiem tra ton tai:
		System.out.println("Kiem tra file1 ton tai hay khong: " +file1.exists()); //true
		System.out.println("Kiem tra file2 ton tai hay khong: " +file2.exists()); //false
		
		//Tao 1 folder mkdir():
		File folder1Le = new File("D:\\1_K941997_Java\\Apps\\Java_45_IOFileFolderCreate\\Folder1");
		folder1Le.mkdir();
		
		//Tao nhieu folder con mkdirs():
		File folder2Nhieu = new File("D:\\1_K941997_Java\\Apps\\Java_45_IOFileFolderCreate\\Folder2\\Folder3\\Folder4\\Folder5");
		folder2Nhieu.mkdirs();
		
		//Tao file mo rong (.exe, .txt, .doc):
		File file1MoRong = new File("D:\\1_K941997_Java\\Apps\\Java_45_IOFileFolderCreate\\Folder1\\File1MoRong.txt");
		File file2MoRong = new File("D:\\1_K941997_Java\\Apps\\Java_45_IOFileFolderCreate\\Folder1\\File2MoRong.doc");
		try {
			file1MoRong.createNewFile();
			file2MoRong.createNewFile();
		} catch (IOException e) {
			//Khong co quyen tao tap tin
			//O cung bi day
			//Duong dan sai
			e.printStackTrace();
		}
	}
}
