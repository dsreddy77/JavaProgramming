package core.java.strings;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokanizer {

	public static void main(String[] args) {
		//String str = "This is StringTokanizer demo";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String str = sc.nextLine();
		StringTokenizer tokens = new StringTokenizer(str, " ");
		while(tokens.hasMoreTokens()){
			System.out.println(tokens.nextToken());
		}
		sc.close();
	}
}
