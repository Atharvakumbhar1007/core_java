package day14;

public class Wrapper2 {

	public static void main(String[] args) {
		//Boxing -> Converting primitivr variable into Wrapper class object
		
		int num = 50;
		
		Integer wrapperNum = Integer.valueOf(num); //	boxing
		//Auto Boxing -> Converting primitive variable into wrapper
		//Class object
		
		Integer wrapperAutoNum = num ;//autoboxing
		
		System.out.println("Boxing = "+wrapperNum);
		System.out.println("Auto Boxing = "+wrapperAutoNum);
		
		//Unboxing -> Converting wrapper class object into primitive type
		Double decimalWrapper = 5.032256; //Autoboxing
		
		double decimalUnboxManual = decimalWrapper.doubleValue(); //Unboxing
		
		double decimalUnbox = decimalWrapper; //AutoUnboxing
		
		System.out.println("Unbox Manual =" +decimalUnboxManual);
		System.out.println("Unbox Auto =" +decimalUnbox);
		
		Float decimalFloatNum = decimalWrapper.floatValue(); //Explicit type casting
		
		System.out.println(decimalFloatNum);
	}
}
