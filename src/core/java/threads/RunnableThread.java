package core.java.threads;

public class RunnableThread implements Runnable {
	private int n = 0;
	private String name = null;

	public RunnableThread(String name, int n) {
		this.n = n;
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println("Now executing thread = " + this.name);
		for (int i = 1; i <= 20; i++) {
			System.out.println(n + "*" + i + "=" + (n * i));
		}
	}

	public static void main(String args[]) {

		Thread t1 = new Thread(new RunnableThread("Table5", 5));
		Thread t2 = new Thread(new RunnableThread("Table10", 10));
		Thread t3 = new Thread(new RunnableThread("Table15", 15));
		Thread t4 = new Thread(new RunnableThread("Table20", 20));
		Thread t5 = new Thread(new RunnableThread("Table25", 25));

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
}
