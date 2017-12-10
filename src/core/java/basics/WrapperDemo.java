package core.java.basics;

public class WrapperDemo {

	public static void main(String[] args) {

		int i=20;
		char ch='A';
		
		Integer iRef = new Integer(i);
		Character chRef = new Character(ch);
		
		int k=iRef.intValue();
		int cha=chRef.charValue();
		
		System.out.println("k is "+k);
		System.out.println("cha is "+cha);
		
		long l=100L;
		Long lRef=l;
		
		long m=lRef;
		
		System.out.println("long value "+m);

	}

}
