package ReadTextFromFile1;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

/*
 * Read Text From File:
 * */

public class Example {
	public static void main(String[] args) {
		
		//Cach 1:
		/*
		File file1 = new File("D:\\1_K941997_Java\\Apps\\Java_50_IOReadTextFromFile\\file1.txt");
		try {
			BufferedReader bufferReader1 = Files.newBufferedReader(file1.toPath(), StandardCharsets.UTF_8);
			String line = null;
			while (true) {
				line = bufferReader1.readLine();
				if(line == null) {
					break;
				} else {
					System.out.println(line);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/
		
		//Cach 2:
		File file2 = new File("D:\\1_K941997_Java\\Apps\\Java_50_IOReadTextFromFile\\file1.txt");
		try {
			List<String> allText = Files.readAllLines(file2.toPath(), StandardCharsets.UTF_8);
			for(String line: allText) {
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
