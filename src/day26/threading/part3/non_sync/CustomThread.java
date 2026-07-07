package day26.threading.part3.non_sync;

public class CustomThread extends Thread{
	
	public Counter counter;
	
	public CustomThread(Counter counter) {
		this.counter = counter;
	}
	 public void run() {
		 
		 for(int i=0; i<=100;i++) {
			 counter.increment(); 
		 }
		 System.out.println("Value of counter by"
		 +Thread.currentThread().getName()+" is = "+counter.count );
	 }
	
}
