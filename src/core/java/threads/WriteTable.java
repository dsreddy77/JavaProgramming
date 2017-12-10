package core.java.threads;

public class WriteTable extends Thread {
	private int n = 0;

	public WriteTable(String name, int n) {
		super(name);
		this.n = n;
	}

	@Override
	public void run() {
		System.out.println("Now executing thread = " + this.getName());
		for (int i = 1; i <= 20; i++) {
			System.out.println(n + "*" + i + "=" + (n * i));
		}
	}

	public static void main(String args[]) {
		WriteTable t1 = new WriteTable("Table5", 5);
		WriteTable t2 = new WriteTable("Table10", 10);
		WriteTable t3 = new WriteTable("Table25", 25);
		WriteTable t4 = new WriteTable("Table30", 30);
		WriteTable t5 = new WriteTable("Table10", 10);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
}
