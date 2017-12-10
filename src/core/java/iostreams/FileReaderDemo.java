package core.java.iostreams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileReaderDemo {
//Character Stream
	void readWriteFile(){
		try{
			File file=new File("Z:\\Softwares\\static.txt");
			FileReader fRead = new FileReader(file);
			BufferedReader buffer = new BufferedReader(fRead);
			
			String line="";
			while((line=buffer.readLine())!=null){
				System.out.println(line);
			}
			buffer.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		
	}
	public static void main(String[] args) {
	
		FileReaderDemo fdr=new FileReaderDemo();
		fdr.readWriteFile();
	}

}
