package core.java.basics;

//import java.io.DataInputStream;

public class BankAccount {
	//data start 
	private int accountNumber;
	private String name;
	private float balance;
	//data end
	
	public void deposit(float amount) {
		System.out.println("Inside deposit method...");
		balance = balance + amount;
	}
	
	public void withdraw(float amount) {
		System.out.println("Inside withdraw method...");
		balance = balance - amount;
	}
	
	public void display(){
		System.out.println("Account number = "+accountNumber+" Name = " + name + " Balance = "+ balance);
	}
	
	public static void main(String args[]){
		System.out.println("Inside main method...");
		BankAccount account1 = new BankAccount();
		account1.accountNumber = 12345;
		account1.name = "Suarshan";
		account1.balance = 89.99f;
		account1.display();
		account1.deposit(20);
		account1.display();
		account1.withdraw(10);
		account1.display();
		System.out.println("-----------------------------------------");
		
		BankAccount account2 = new BankAccount();
		
		account2.accountNumber = 12344;
		account2.name = "Brahma";
		account2.balance = 19.99f;
		account2.display();
		account2.deposit(30);
		account2.display();
		account2.withdraw(20);
		account2.display();
	}
}