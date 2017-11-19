package core.java.iostreams;

import java.io.DataInputStream;
import java.io.IOException;

public class DisDemo {

	public static void main(String[] args) {
		DataInputStream dis = new DataInputStream(System.in);
		try {
			System.out.println("Enter your name:");
			String name = dis.readLine();
			System.out.println("The name you have entered = "+ name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
