package core.java.iostreams;

import java.io.File;
import java.io.FileInputStream;

public class FileInputStreamDemo {
	
		void readFromFiel()
		{
			try {
				File file=new File("Z:\\Softwares\\static.txt");
				FileInputStream fis=new FileInputStream(file);
				
				int ch=0;
				while((ch=fis.read())!=-1){
					System.out.print((char)ch);
				}
				fis.close();
				}
			catch(Exception e)
				{
				e.printStackTrace();
				}
	}

	public static void main(String[] args) {
		FileInputStreamDemo fileDemo = new FileInputStreamDemo();
		
		fileDemo.readFromFiel();

	}

}
