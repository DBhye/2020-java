package com.korea.it;

public class Operator3 {
	public static void main(String[] args) {
		int n1 = 10;
		int cost = 1;
		n1 = n1 + cost;
		System.out.println("n1 : " + n1);
		
		int n2 = 10;
		n2 = n2 + 2;
		System.out.println("n2 : " + n2);

		int n3 =10;
		n3 += (-2); //음수를 사용할 때는 부호연산자에 괄호로 구별하는것이 좋다.
		System.out.println("n3 : " + n3);
	}

}
