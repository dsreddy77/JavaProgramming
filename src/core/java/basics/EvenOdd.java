package core.java.basics;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number ");
		int x=sc.nextInt();
				if (x%2==0)
			System.out.println("Entered number is even");
		else
			System.out.println("Entered number is odd");

	}

}
