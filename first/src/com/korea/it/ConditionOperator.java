package com.korea.it;

public class ConditionOperator {

	public static void main(String[] args) {
		int num = 4;
		
		//boolean isOdd = (num % 2 ==1 ? true : false);
		// System.out.printf("%d is odd? %b\n", num, isOdd);
		
		String result = (num % 2 == 1 ? "홀수" : "짝수");
		
		System.out.printf("%d is odd? %b\n", num, result);
	}

}
