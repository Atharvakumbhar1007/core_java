package day25.threadings;

public class ThreadMain {

	public static void main(String[] args) {
		RunnableImpl runnableImpl = new RunnableImpl();
		
		runnableImpl.run();
		
		CustomThread thread2 = new CustomThread();
		
		thread2.run();
	}
}
