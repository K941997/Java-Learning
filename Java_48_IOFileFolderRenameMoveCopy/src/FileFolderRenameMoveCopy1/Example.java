package FileFolderRenameMoveCopy1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

/*
 * IO FileFolder RenameMoveCopy:
 * - Create File
 * - Rename File = renameTo()
 * - Rename File = Files.move()
 * - Move File To Folder = Create File, Folder + Files.move()
 * - Copy Folder To Folder = Create Folder, FolderCopy + Create method copyAll
 * */

public class Example {
	
	public static void copyAll(File f1, File f2) {
		try {
			//copy ban than:
			Files.copy(f1.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(f1.isDirectory()) {
			//copy file con:
			File[] fileChilds = f1.listFiles();
			for(File fileChild: fileChilds) {
				File fileChildNew = new File(f2.getAbsoluteFile()+ "/" +fileChild.getName());
				copyAll(fileChild, fileChildNew);
			}
		}
	}
	
	public static void main(String[] args) {
		//Create File:
		File file0 = new File("D:\\1_K941997_Java\\Apps\\Java_48_IOFileFolderRenameMoveCopy\\File0abc.txt");
		File file1 = new File("D:\\1_K941997_Java\\Apps\\Java_48_IOFileFolderRenameMoveCopy\\File1abc.txt");
		File file0Rename = new File("D:\\1_K941997_Java\\Apps\\Java_48_IOFileFolderRenameMoveCopy\\File0Rename.txt");
		File file1Rename = new File("D:\\1_K941997_Java\\Apps\\Java_48_IOFileFolderRenameMoveCopy\\File1Rename.txt");
		
		//Rename File = renameTo:
		file0.renameTo(file0Rename);
		
		//Rename File = Files.move:
		try {
			Files.move(file1.toPath(), file1Rename.toPath(), StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//Move File To Folder = Create File, Folder + Files.move():
		File file2 = new File("D:\\1_K941997_Java\\Apps\\Java_48_IOFileFolderRenameMoveCopy\\File2.txt");
		File folderMoveFile2 = new File("D:\\1_K941997_Java\\Apps\\Java_48_IOFileFolderRenameMoveCopy\\FolderMoveFile2\\File2.txt");
		try {
			Files.move(file2.toPath(), folderMoveFile2.toPath(), StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//Copy Folder To Folder = Create Folder, FolderCopy + Create method copyAll:
		File folder3 = new File("D:\\1_K941997_Java\\Apps\\Java_48_IOFileFolderRenameMoveCopy\\Folder3");
		File folderCopyFolder3 = new File("D:\\1_K941997_Java\\Apps\\Java_48_IOFileFolderRenameMoveCopy\\Folder3_copy");
		try {
			Files.copy(folder3.toPath(), folderCopyFolder3.toPath(), StandardCopyOption.REPLACE_EXISTING);
		} catch (IOException e) {
			e.printStackTrace();
		}
		Example.copyAll(folder3, folderCopyFolder3);
		
	};
}
