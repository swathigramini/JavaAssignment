package threadsexamples;

public class example1 extends Thread { //thread is a class

	public void run() {
		System.out.println("this is thread class !!!!");
	}

//	public static void main(String[] args) {
//
//		Thread t = new example1();
//		t.start();  // start method internally calls run method.
//	}
}
