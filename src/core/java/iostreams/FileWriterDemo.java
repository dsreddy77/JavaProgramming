package core.java.iostreams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
	private String fileName = null;

	void fileWrite() {
		try {
			fileName = "Z:\\Softwares\\FileWriter.txt";
			File file = new File(fileName);
			if (!file.exists()) {
				file.createNewFile();
			}
			String line = "This is demo file write concept \n";
			FileWriter writer = new FileWriter(file, true);
			writer.write(line);
			writer.close();

			System.out.println("File Written");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	void readWriteFile() {
		FileReader fRead = null;
		BufferedReader buffer = null;
		try {
			File file = new File(fileName);
		    fRead = new FileReader(file);
		    buffer = new BufferedReader(fRead);

			String line = "";
			while ((line = buffer.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			try {
				if(buffer != null){
					buffer.close();
				}
				if(fRead != null){
					fRead.close();
				}
			} catch (IOException e) {
				
			}
			
		}

	}

	public static void main(String[] args) {
		FileWriterDemo fwd = new FileWriterDemo();
		fwd.fileWrite();
		fwd.readWriteFile();
	}

}
