package core.java.basics;

public class Calc {
	private int n1;
	private int n2;

	public int getN1() {
		return n1;
	}

	public int getN2() {
		return n2;
	}

	public Calc(){
		System.out.println("default constructor invoked....");
	}
	
	public Calc(int n1, int n2){
		System.out.println("arg constructor invoked....");
		this.n1 = n1;
		this.n2 = n2;
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}

	public void setN2(int n2) {
		this.n2 = n2;
	}

	public int add() {
		return n1 + n2;
	}

	public int diff() {
		return n1 - n2;
	}

	public int product() {
		return n1 * n2;
	}

	public int divide() {
		return n1 / n2;
	}
}