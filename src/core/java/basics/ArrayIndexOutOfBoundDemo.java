package core.java.basics;

public class ArrayIndexOutOfBoundDemo {

	public static void main(String[] args) {

		
		
		try{
			int arraysOne[]= new int[5];
			arraysOne[10]=20;
			System.out.println(arraysOne[10]);
			
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("exception occured "+e);
			e.printStackTrace();
			System.out.println(e.getMessage());
			e.notifyAll();
		}
		finally{
			System.out.println("This is finally block....");
		}
	}

}
