package day25.threadings.part1;

public class ThreadMain {

	public static void main(String[] args) {
		RunnableImpl runnableImpl = new RunnableImpl();
		
		runnableImpl.run();
		
		Thread thread1 = new Thread(runnableImpl);
		
		CustomThread thread2 = new CustomThread();
		
		thread1.setName("my_thread_1");
		thread2.setName("my_thread_2");
		//we have  to start the thread not call run method
		//start will internally call run() method
		thread1.run();
		thread2.run();
		
		System.out.println("I ma Main Message My Thread Name is:"+Thread.currentThread() .getName());
	}
}
