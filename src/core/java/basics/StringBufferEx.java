package core.java.basics;

public class StringBufferEx {

	public static void main(String[] args) {
		StringBuffer fullName = new StringBuffer();
		
		fullName.append("Sudarshana");
		fullName.append(" ");

		fullName.append("Reddy");
		fullName.append(" ");
		
		fullName.append("Devireddy");
		System.out.println(fullName);
		String tmp = fullName.toString();
		System.out.println(tmp);
		//word count
	}
}
