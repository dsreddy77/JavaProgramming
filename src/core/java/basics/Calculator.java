package core.java.basics;

public class Calculator {

	public static void main(String[] args) {
		Calc calc = new Calc();
		calc.setN1(100);
		calc.setN2(200);
		
		System.out.println(calc.add());
		System.out.println(calc.diff());
		System.out.println(calc.product());
		System.out.println(calc.divide());
		
		Calc calc2 = new Calc(300,100);
		System.out.println(calc2.add());
		System.out.println(calc2.diff());
		System.out.println(calc2.product());
		System.out.println(calc2.divide());
		
		System.out.println("calc vales n1 = "+ calc.getN1()+" n2="+calc.getN2());
		System.out.println("calc2 vales n1 = "+ calc2.getN1()+" n2="+calc2.getN2());
	}

}
