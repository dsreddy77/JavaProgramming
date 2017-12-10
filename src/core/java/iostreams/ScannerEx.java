package core.java.iostreams;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		File file=new File("Z:\\Softwares\\static.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine()){
				System.out.println(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
			
		}
		finally{
			sc.close();
		}
	}
}
