package core.java.basics;

public class StringOperations {

	public static void main(String[] args) {
		String name1 = "Sudarshan";
		String name2 = "Sudarshan";
		String name3 = new String("Sudarshan");
		
		// ==  >>> to compare address
		// equals >>> to compare value
		
		if(name1 == name2){
			System.out.println("name1 and name2 address are sanme.");
		} else {
			System.out.println("name1 and name2 address are not sanme.");
		}
		
		if(name1 == name3){
			System.out.println("name1 and name3 address are sanme.");
		} else {
			System.out.println("name1 and name3 address are not sanme.");
		}
		
		if(name1.equals(name2)){
			System.out.println("name1 and name2 values are sanme.");
		} else {
			System.out.println("name1 and name2 values are not sanme.");
		}
		
		if(name1.equals(name3)){
			System.out.println("name1 and name3 values are sanme.");
		} else {
			System.out.println("name1 and name3 values are not sanme.");
		}
		
		
		String fName = "Sudarshan";
		String mName = "Reddy";
		String lName = "Devireddy";
		
		String fullName = fName + " " + mName + " " + lName;
		
		System.out.println(fullName);
		System.out.println(fullName.toLowerCase());
		System.out.println(fullName.toUpperCase());
		
		if(fullName.contains("Reddy")){
			System.out.println("Welcome to Reddy family.");
		}
		
		if(fullName.indexOf("Reddy") != -1){
			System.out.println("Welcome to Reddy family.");
		}
		System.out.println(fullName.indexOf("Reddy"));
		
		String fullName1 = "Ramakrishna Chowdary";
		if(fullName1.indexOf("Reddy") != -1){
			System.out.println("Welcome to Reddy family.");
		} else {
			System.out.println("Welcome to Chowdary family.");
		}
		
		System.out.println(fullName1.indexOf("Reddy"));
		
		
		String tmp = fullName.replaceAll(fName, "Sudarshana");
		System.out.println(fullName);
		System.out.println(tmp);
		System.out.println(fullName.length());
		
		System.out.println(fullName.substring(10, 15));
		System.out.println(fullName.charAt(24));
		System.out.println("*"+fullName.codePointAt(1));
	
		System.out.println(name1.compareToIgnoreCase(name3));
		System.out.println(name1.compareToIgnoreCase(fullName));
		System.out.println(fullName.contains(mName));
		System.out.println(name1.contains(mName));
		System.out.println(fullName.lastIndexOf("re"));
		
		String temp = "Touch Bar and Touch ID 3.1GHz";
		String tmparr[] = temp.split(" ");
		System.out.println(tmparr.length);
		
	}

}