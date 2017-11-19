package core.java.iostreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx {

	public static void main(String[] args) throws IOException {
		try {
			FileInputStream fis = new FileInputStream("Z:\\Softwares\\ws\\JavaPrograming\\src\\core\\java\\basics\\ArrayIndexOutOfBoundDemo.java");
			int ch;
			while((ch = fis.read()) != -1){
				System.out.print((char)ch);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
