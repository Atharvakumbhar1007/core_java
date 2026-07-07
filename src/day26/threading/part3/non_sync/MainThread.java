package day26.threading.part3.non_sync;

public class MainThread {

	public static void main(String[] args) {
		Counter counter = new Counter();
		
		CustomThread t1 = new CustomThread(counter);
		CustomThread t2 = new CustomThread(counter);
	}
}
