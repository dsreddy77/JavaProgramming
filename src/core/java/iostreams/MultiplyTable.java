package core.java.iostreams;

import java.util.Scanner;

public class MultiplyTable {

	public static void main(String[] args) {

		String z = "Y";

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");
		int n = sc.nextInt();

		while (z != "N") {

			for (int i = 0; i <= 10; i++) {
				System.out.println(n + "*" + i + "=" + n * i);
			}
			z = "N";

			System.out.println("Do you want one more multiplication table Y/N? ");
			z = sc.next();

			if (z != "N") {
				System.out.println("Enter number again");
				n = sc.nextInt();
			} else {
				System.exit(0);
			}
		}
	}

}
