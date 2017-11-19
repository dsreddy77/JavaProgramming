package core.java.basics;

public class ArraysEx {

	public static void main(String[] args) {
		
	//	String name = new String("Sudarshan");
		String names[] = new String[3];
		names[0] = "Sudarshan";
		names[1] = "Harini";
		names[2] = "Harika";
		
	//	String names1[] = {"Sudarshan", "Harini", "Harika"};
		
			for(int i=0;i<=names.length;i++){
				try {
					System.out.println(names[i]);
				} catch (Exception e) {
				
				}
			}
		
		
		System.out.println("End of the program ...");
		
	}

}
