package com.korea.it;

public class Operator2 {
	public static void main(String[] args) {
		int n1 = 10;
		int result =n1++;
		System.out.println("result: "+ result);
		System.out.println("n1: "+ n1);
		// result에 10이 대입되고 n1이 11이 됨. 
		int n2 = 10;
		int result2 = ++n2;
		System.out.println("result2: "+ result2);
		System.out.println("n2: "+ n2);
		//result에 11을 대입하고 n2가 11이 됨.
	}
}
