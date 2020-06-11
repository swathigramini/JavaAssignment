package threadsexamples;

public class example2 extends example1 implements Runnable{
	
	public void run() {
		System.out.println("This is runnble interface");
	}
	
	public static void main(String[] args) {
		Thread t = new example2();
		t.start();
	}

}
