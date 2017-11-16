package core.java.basics;

import java.util.Scanner;

public class MultiplyTable {

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter a number");
	 int x=sc.nextInt();
	 int i;
	 for(i=0;i<=10;i++)
		 System.out.println(x+" * "+ i + " = "+i * x );
	 
	 
	}

}
