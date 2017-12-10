package core.java.threads;

public class FirstThread {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		for(int i=0;i<20;i++){
			System.out.println("Hello loop : "+ i);
			if(i==10){
				System.out.println("Sleep for few secs.");
				try {
					Thread.sleep(6000);
				} catch (InterruptedException e) {
					
				}
				System.out.println("Sleep time elapse .. get started again");
			}
		}
	}
}
