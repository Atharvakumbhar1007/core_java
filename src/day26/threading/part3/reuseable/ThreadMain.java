package day26.threading.part3.reuseable;

public class ThreadMain {

	public static void main(String[] args) {
		Thread t1 = new Thread(()->{
			System.out.println("Thread 1 Started");
		});
		t1.start();
		Thread t2 = new Thread(()->{
			System.out.println("Thread 1 Started");
		});
		t2.start();
	}
}
