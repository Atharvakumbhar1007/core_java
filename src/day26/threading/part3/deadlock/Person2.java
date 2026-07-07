package day26.threading.part3.deadlock;

public class Person2 extends Thread{

	public Notebook notebook;
	
	public Pen pen;

	public Person2(Notebook notebook, Pen pen) {
		super();
		this.notebook = notebook;
		this.pen = pen;
	}

	@Override
	public void run() {
		 //Person 1 Pen
		notebook.use();
		pen.write(notebook);
	}
	
	
	 
}
