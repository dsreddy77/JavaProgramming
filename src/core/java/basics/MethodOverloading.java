package core.java.basics;

public class MethodOverloading {

	//polymorphism 	- compile time or method overloading
					//- run time
	public int add(int n1, int n2){
		System.out.println("* 1 *");
		return n1 + n2;
	}
	
	public int add(int n1, int n2, int n3){
		System.out.println("* 2 *");
		return n1 + n2 + n3;
	}
	
	public double add(double n1, double n2){
		System.out.println("* 3 *");
		return n1 + n2;
	}
	
	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		System.out.println(obj.add(10,20));
		System.out.println(obj.add(10.5,20.5));
	}
}
