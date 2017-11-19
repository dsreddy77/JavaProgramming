package core.java.basics;

public class TryCatchEx {

	public static void main(String[] args) {
		int n1 = 0, n2 = 0, sum = 0;
		try{
			n1 = Integer.parseInt(args[0]);
			n2 = Integer.parseInt(args[1]);
		}catch(NumberFormatException e){
			System.out.println("main number format exception block");
			System.out.println(e.getMessage());
		} catch(Exception e){
			//System.out.println(e.getMessage());
			System.out.println("main exception block");
			e.printStackTrace();
		}
		
		sum = n1 + n2;
		
		System.out.println("n1="+n1+" n2="+n2+" sum="+sum);
	}

}
