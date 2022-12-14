package FileFolderRead1;

import java.io.File;
import java.util.Scanner;

/*
 * File Folder Read:
 * 		this.file.canExecute(): kiem tra thuc thi
 * 		this.file.canRead(): kiem tra doc
 * 		this.file.canWrite(): kiem tra viet
 * 		this.file.getAbsolutePath(): in duong dan
 * 		this.file.getName(): in ten file
 * 		this.file.isFile(): kiem tra la file
 * 		this.file.isDirectory(): kiem tra la file folder
 * 		In danh sach file con:
 * 			File[] fileChildrens = this.file.listFiles();
			for(File fileChildren: fileChildrens) {
				System.out.println(fileChildren.getAbsolutePath());
			}
 * 		
 * */

public class Example {
	File file;

	//Constructor + File Create:
	public Example(String nameFile) {
		this.file = new File(nameFile);
	}
	
	//Methods:
	public boolean kiemTraThucThi() {
		return this.file.canExecute();
	}
	
	public boolean kiemTraDoc() {
		return this.file.canRead();
	}
	
	public boolean kiemTraGhi() {
		return this.file.canWrite();
	}
	
	public void inDuongDan() {
		System.out.println(this.file.getAbsolutePath());
	}
	
	public void inTenFile() {
		System.out.println(this.file.getName());
	}
	
	public void kiemTraFilehayFolder() {
		if(this.file.isFile()) {
			System.out.println("Day la File");
		} else if(this.file.isDirectory()) {
			System.out.println("Day la Folder");
		}
	}
	
	public void inDanhSachFileChildrens() {
		if(this.file.isDirectory()) {
			System.out.println("Vi la folder nen cac tap tin con la: ");
			File[] fileChildrens = this.file.listFiles();
			for(File fileChildren: fileChildrens) {
				System.out.println(fileChildren.getAbsolutePath());
			}
		} else if(this.file.isFile()) {
			System.out.println("Vi la file nen khong co file con ben trong");
		}
	}

	public void inCayThuMuc() {
		this.inChiTietCayThuMuc(this.file, 1);
	}
	
	public void inChiTietCayThuMuc(File file, int level) {
		for(int i = 0; i < level; i++) {
			System.out.print("\t");
		}
		
		System.out.print("|__");
		
		System.out.println(file.getName());
		
		if(file.canRead() && file.isDirectory()) {
			File[] fileCons = file.listFiles();
			for(File fileCon: fileCons) {
				inChiTietCayThuMuc(fileCon, level+1);
			}
		}
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int luaChon = 0;
		
		System.out.println("Nhap ten File: ");
		String nameFile = sc.nextLine();
		Example exampleFile = new Example(nameFile);
		
		do {
			System.out.println("---------- MENU ----------");
			System.out.println("----- 1. Kiem tra file co the thuc thi");
			System.out.println("----- 2. Kiem tra file co the doc");
			System.out.println("----- 3. Kiem tra file co the ghi");
			System.out.println("----- 4. In duong dan");
			System.out.println("----- 5. In ten file");
			System.out.println("----- 6. Kiem tra file la thu muc hay tap tin");
			System.out.println("----- 7. In danh sach file con ben trong folder");
			System.out.println("----- 8. In cay thu muc");
			System.out.println("----- 9. In chi tiet cay thu muc");
			System.out.println("----- 0. Thoat chuong trinh");
			System.out.println("----- Lua chon:");
			
			luaChon = sc.nextInt();
			
			switch (luaChon) {
			case 1:
				System.out.println("File co the thuc thi ko: " +exampleFile.kiemTraThucThi());
				break;
			case 2:
				System.out.println("File co the doc ko: " +exampleFile.kiemTraDoc());
				break;
			case 3:
				System.out.println("File co the ghi ko: " +exampleFile.kiemTraGhi());
				break;
			case 4:
				System.out.println("In duong dan la: ");
				exampleFile.inDuongDan();
				break;
			case 5:
				System.out.println("In ten file: ");
				exampleFile.inTenFile();
				break;
			case 6:
				System.out.println("Kiem tra file la thu muc hay tap tin: ");
				exampleFile.kiemTraFilehayFolder();
				break;
			case 7:
				System.out.println("In danh sach file con: ");
				exampleFile.inDanhSachFileChildrens();
				break;
				
			case 8:
				System.out.println("In cay thu muc");
				exampleFile.inCayThuMuc();
				break;
				
			default:
				break;
			}
			
		} while (luaChon != 0);
	}
}
