package core.java.basics;

public class PrimitiveToWrapper {

	public static void main(String[] args) {
		int n1 = 10;
		long n2 = 100;
		float n3 = 20.5f;
		double n4 = 40.75;
		boolean n5 = true;
		
		System.out.println("n1="+n1+" n2="+n2+" n3="+n3+" n4="+n4+" n5="+n5);
		
		Integer wn1 = new Integer("10");
		int tmp = wn1.intValue();
		System.out.println(wn1+" "+tmp);
		
		Long ln2 = new Long(100);
		long tmp1 = ln2.longValue();
		System.out.println(ln2+" "+ tmp1);
	}
}
