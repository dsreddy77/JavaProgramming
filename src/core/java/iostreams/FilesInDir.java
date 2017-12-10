package core.java.iostreams;

import java.io.File;
import java.io.FileNotFoundException;

public class FilesInDir {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("Z:\\Softwares");
		if(file.exists()){
			if(file.isDirectory()){
				File arr[] = file.listFiles();
				if(arr != null && arr.length > 0){
					for(File f : arr){
						System.out.println(f.getName());
					}
				}
			}
		} else {
			System.out.println("Specifie path does not exists.");
		}
		
		File f = new File("Z:\\Softwares\\java\\test");
		f.mkdirs();
		//f.delete();
	}

}
