package com.facultad.numericUtils;

public class NumericUtils {

	public NumericUtils(){
		
	}
	
	public static boolean isPrime(int toCheck) {
		for(int i = toCheck -1;i > 1;i--){
			if(toCheck%i == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isDivisorDe3000(int numero) {
		if(3000%numero == 0) {
			return true;
		}
		return false;
	}
	
	public static boolean isDivisorDe300(int numero) {
		if(300%numero == 0) {
			return true;
		}
		return false;
	}
}
