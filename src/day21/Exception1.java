package day21;

public class Exception1 {

	public static void main(String[] args) {
		int n1 = 50;
		
		int n2 = 0;
		
		try {
			System.out.println(n1/n2);
		}catch(ArithmeticException ae) {
			System.out.println(ae.getMessage());
		}

		try {
			String name = null;
			System.out.println(name.length());
		} catch (NullPointerException npe) {
			System.out.println(npe);
		}
		
		String numberStr = "55";
		
		try {
		int num = Integer.parseInt(numberStr);
		System.out.println("Integer = " +num);
		} catch (NumberFormatException nfe){
			System.out.println(nfe.getMessage());
		}
		
	}
}
