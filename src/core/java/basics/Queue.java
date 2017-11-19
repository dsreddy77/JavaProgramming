package core.java.basics;

import java.util.Scanner;

public class Queue implements QueueInterface {

	int queueArray[]=new int[20];
	int front=0;
	int rear=0;
	
	@Override
	public void insertVal(int val1) {
		queueArray[rear++]=val1;

	}

	@Override
	public int delete() {
		
		return (queueArray[front++]);
	}
	
	public void display(){
		for (int i=front;i<rear;++i)
			System.out.println(queueArray[i]);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 3 numbers to insert...");
		int x=sc.nextInt();
		Queue q1=new Queue();
		q1.insertVal(x);
		
		x=sc.nextInt();
		q1.insertVal(x);
		
		x=sc.nextInt();
		q1.insertVal(x);
		
		System.out.println("queue contains...");
		q1.display();
		
		System.out.println("Deleting 2 elements...");
		int y=q1.delete();
		System.out.println("Deleted element.."+y);
		y=q1.delete();
		System.out.println("Deleted element.."+y);
		
		System.out.println("Final queue contains");
		q1.display();
	}

}
