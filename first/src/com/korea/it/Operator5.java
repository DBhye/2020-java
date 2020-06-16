package com.korea.it;

public class Operator5 {

	public static void main(String[] args) {
		//비교연산자 > boolean
		int n1 = 10;
		int n2 = 11;
		boolean result = ( n1 == n2);
		System.out.println(result);
		System.out.println(n1 == n2);
		System.out.println(n1);
		
		System.out.println();
		result = (n1 != n2); //다르면 true다.
		System.out.println(result);
		System.out.println(!(n1 != n2)); //false가 나온다.
		
		System.out.println();
		result = n2 >= n1;
		System.out.println("n1 > n2 : " + result);
		result = n2 <= n1;
		System.out.println("n2 > n1 : " + result);
		
		// !!문자열은 ==으로 비교를 하면안된다. !! //
		
	}

}
