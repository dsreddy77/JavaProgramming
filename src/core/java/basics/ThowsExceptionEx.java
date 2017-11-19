package core.java.basics;

public class ThowsExceptionEx {

	public static void main(String[] args) {
		int sum = 0;		
		try{
			sum = add(args[0], args[1]);
		}catch(NumberFormatException e){
			e.printStackTrace();
		}catch(Exception e) {
			
		}
		
		System.out.println("n1="+args[0]+" n2="+args[1]+" sum="+sum);
	}
	
	private static int add(String num1, String num2) throws Exception{
		int n1 = Integer.parseInt(num1);
		int n2 = Integer.parseInt(num2);
		
		return n1 + n2;
	}

}
