package core.java.basics;

//import java.io.DataInputStream;

public class BankAccount3 {
	private static int accountNumber;
	private static String name;
	private static float balance;
	
	public static void deposit(float amount) {
		System.out.println("Inside deposit method...");
		balance = balance + amount;
	}
	
	public static void withdraw(float amount) {
		System.out.println("Inside withdraw method...");
		balance = balance - amount;
	}
	
	public static void display(){
		System.out.println("Account number = "+accountNumber+" Name = " + name + " Balance = "+ balance);
	}
	
	public static void main(String args[]){
		System.out.println("Inside main method...");
		accountNumber = Integer.parseInt(args[0]);
		name = args[1];
		balance = Float.parseFloat(args[2]);
		display();
		deposit(20);
		display();
		withdraw(10);
		display();		
	}
}