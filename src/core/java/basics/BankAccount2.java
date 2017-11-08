package core.java.basics;

//import java.io.DataInputStream;

public class BankAccount2 {
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
		BankAccount2 account1 = new BankAccount2();
		
		account1.accountNumber = Integer.parseInt(args[0]);
		account1.name = args[1];
		account1.balance = Float.parseFloat(args[2]);
		account1.display();
		account1.deposit(20);
		account1.display();
		account1.withdraw(10);
		account1.display();		
	}
}