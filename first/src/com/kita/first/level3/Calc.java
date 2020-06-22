package com.kita.first.level3;

public class Calc {
	static int n1;
	static int n2;
	
	public int sum() {
		return n1+n2;

	}
	
	public static int sum(int n1, int n2) {
		int result = 0; //지역변수
		return Calc.n1+n2;
		/*this.n1+n2 객체화 해야 사용할 수 있다.*/
	}
}
