package day14;

public class Response<R>{

	//FIZZBUZZ
	
	private R msg;
	
	public R getMsg() {
		return msg;
	}

	public void setMsg(R msg) {
		// TODO Auto-generated method stub
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "Resonse [msg=" + msg + "]";
	}
	
}
