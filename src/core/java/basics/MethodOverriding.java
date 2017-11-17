package core.java.basics;

public class MethodOverriding {

	public static void main(String[] args) {
		Bike bike = new Bike();
		bike.run();
		
		Bus bus = new Bus();
		bus.run();
		bus.speed();
		for(int i=0;i<3;i++) {
			System.out.println(i);
			System.out.println("hello...");
		}
	}

}
