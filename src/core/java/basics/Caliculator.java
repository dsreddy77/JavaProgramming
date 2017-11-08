package core.java.basics;

public class Caliculator {

	public static void main(String[] args) {
		//ArthimeticOperations aos = new ArthimeticOperations();
		int n1 = 10, n2 = 20;
		System.out.println("Addition of n1 = "+ n1 + " and n2="+n2+" is=" + ArthimeticOperations.add(n1, n2));
		System.out.println("Difference of n1 = "+ n1 + " and n2="+n2+" is=" + ArthimeticOperations.substract(n1, n2));
		System.out.println("Product of n1 = "+ n1 + " and n2="+n2+" is=" + ArthimeticOperations.multiply(n1, n2));
		System.out.println("Division of n1 = "+ n1 + " and n2="+n2+" is=" + ArthimeticOperations.divide(n1, n2));
	}
}
